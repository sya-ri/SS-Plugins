package com.github.syari.ss.plugins.mobarena

import com.github.syari.ss.plugins.core.Main.Companion.console
import com.github.syari.ss.plugins.core.code.OnEnable
import com.github.syari.ss.plugins.core.config.CreateConfig.configDir
import com.github.syari.ss.plugins.core.config.dataType.ConfigDataType
import com.github.syari.ss.plugins.core.config.dataType.ConfigItemConverter
import com.github.syari.ss.plugins.dependency.crackshot.CrackShotAPI
import com.github.syari.ss.plugins.dependency.crackshotplus.CrackShotPlusAPI
import com.github.syari.ss.plugins.dependency.mythicmobs.MythicMobsAPI
import com.github.syari.ss.plugins.mobarena.Main.Companion.plugin
import com.github.syari.ss.plugins.mobarena.data.MobArenaManager
import com.github.syari.ss.plugins.mobarena.data.arena.Area
import com.github.syari.ss.plugins.mobarena.data.arena.MobArena
import com.github.syari.ss.plugins.mobarena.data.kit.MobArenaKit
import com.github.syari.ss.plugins.mobarena.data.wave.MobArenaWave
import com.github.syari.ss.plugins.mobarena.data.wave.boss.MobArenaBoss
import com.github.syari.ss.plugins.mobarena.data.wave.boss.MobArenaMythicMobsBoss
import com.github.syari.ss.plugins.mobarena.data.wave.mob.MobArenaMob
import com.github.syari.ss.plugins.mobarena.data.wave.mob.MobArenaMythicMobsMob
import org.bukkit.Material
import org.bukkit.command.CommandSender
import org.bukkit.inventory.ItemStack

object ConfigLoader : OnEnable {
    override fun onEnable() {
        load(console)
    }

    fun load(sender: CommandSender) {
        loadArena(sender)
        loadKit(sender)
    }

    @OptIn(ExperimentalStdlibApi::class)
    private fun loadArena(sender: CommandSender) {
        val arenas = mutableListOf<MobArena>()
        plugin.configDir(sender, "MobArena") {
            val id = fileNameWithoutExtension
            val name = get("name", ConfigDataType.STRING, id)
            val lobby = get("lobby", Area.ConfigDataType) ?: return@configDir
            val play = get("play", Area.ConfigDataType) ?: return@configDir
            val spec = get("spec", Area.ConfigDataType) ?: return@configDir
            val spawn = get("spawn", ConfigDataType.LOCATION) ?: return@configDir nullError("spawn", "Location")
            val kits = get("kit", ConfigDataType.STRINGLIST, listOf())
            val playerLimit = get("limit.player", ConfigDataType.INT, 5)
            val kitLimit = get("limit.kit", ConfigDataType.INT, 1, false)
            val waveInterval = get("wave-interval", ConfigDataType.LONG, 200, false)
            val arena = MobArena(id, name, kits, lobby, play, spec, spawn, waveInterval, playerLimit, kitLimit)
            val waves = section("wave")?.mapNotNull {
                it.toIntOrNull() ?: run {
                    typeMismatchError("&cWave($it)", "Int")
                    null
                }
            }?.toMutableList()
            if (waves != null) {
                waves.sort()
                if (waves.first() == 1) {
                    var lastWave = 1
                    arena.waveList = buildList {
                        var stop = false
                        var mobAmount = 5
                        var mobs = listOf<MobArenaMob>()
                        var boss: MobArenaBoss? = null
                        var upgradeItem = listOf<ItemStack>()
                        waves.forEach { wave ->
                            if (wave != 1) add(
                                MobArenaWave(
                                    arena, lastWave until wave, mobAmount, stop, mobs, boss, upgradeItem
                                )
                            )
                            stop = get("wave.$wave.stop", ConfigDataType.BOOLEAN, false, notFoundError = false)
                            mobAmount = get("wave.$wave.mob.amount", ConfigDataType.INT, mobAmount, false)
                            mobs = section("wave.$wave.mob.list", false)?.map {
                                val priority = get("wave.$wave.mob.list.$it", ConfigDataType.INT, 1)
                                MobArenaMythicMobsMob(it, priority)
                            } ?: mobs
                            boss = get("wave.$wave.boss", ConfigDataType.STRING, false)?.let {
                                MobArenaMythicMobsBoss(it)
                            }
                            upgradeItem = get("wave.$wave.upgrade", ConfigDataType.ITEMS(itemConverter), listOf(), false)
                            lastWave = wave
                        }
                        add(MobArenaWave(arena, lastWave..lastWave, mobAmount, true, mobs, boss, upgradeItem))
                    }
                    arena.lastWave = lastWave
                } else {
                    sendError("", "Wave 1 is not defined")
                }
            } else {
                sendError("", "Wave is Empty")
            }
            arenas.add(arena)
        }
        MobArenaManager.arenas = arenas
    }

    @OptIn(ExperimentalStdlibApi::class)
    private fun loadKit(sender: CommandSender) {
        MobArenaKit.kits = buildMap {
            plugin.configDir(sender, "Kit") {
                val id = fileNameWithoutExtension
                val name = get("name", ConfigDataType.STRING, id)
                val items = get("items", ConfigDataType.INVENTORY(itemConverter), mapOf())
                put(id, MobArenaKit(id, name, items))
            }
        }
    }

    private val itemTypeMap = mapOf<String, (String, Int) -> ItemStack?>(
        "mc" to { id, amount ->
            Material.getMaterial(id.toUpperCase())?.let { ItemStack(it, amount) }
        },
        "mm" to { id, amount ->
            MythicMobsAPI.getItem(id, amount)?.toOneItemStack
        },
        "cs" to { id, amount ->
            CrackShotAPI.getItem(id, amount)?.toOneItemStack
        },
        "csp" to { id, amount ->
            CrackShotPlusAPI.getAttachment(id, amount)?.toOneItemStack
        }
    )

    private val itemConverter = ConfigItemConverter.Format(itemTypeMap)
}
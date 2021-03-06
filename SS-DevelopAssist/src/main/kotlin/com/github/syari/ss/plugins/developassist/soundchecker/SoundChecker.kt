package com.github.syari.ss.plugins.developassist.soundchecker

import com.github.syari.spigot.api.command.command
import com.github.syari.spigot.api.inventory.inventory
import com.github.syari.ss.plugins.core.code.OnEnable
import com.github.syari.ss.plugins.core.message.template.ConstantMessage.OnlyPlayer
import com.github.syari.ss.plugins.core.message.template.sendTemplateError
import com.github.syari.ss.plugins.developassist.Main.Companion.plugin
import org.bukkit.Material
import org.bukkit.Sound
import org.bukkit.entity.Player
import org.bukkit.event.inventory.ClickType

object SoundChecker : OnEnable {
    override fun onEnable() {
        plugin.command("csound") {
            execute {
                val player = sender as? Player ?: return@execute sender.sendTemplateError("SoundChecker", OnlyPlayer)
                player.openSoundList()
            }
        }
    }

    private val soundList = Sound.values().toList().chunked(45)

    private data class OpenSoundListConfig(
        val page: Int = 0,
        var pitch: Float = 1.0F,
        var sound: Sound? = null
    )

    private fun Player.openSoundList(config: OpenSoundListConfig = OpenSoundListConfig()) {
        val lastPage = soundList.lastIndex
        when {
            config.page < 0 -> openSoundList(config.copy(page = 0))
            lastPage < config.page -> openSoundList(config.copy(page = lastPage))
            else -> inventory("&9SoundChecker (${config.page}/$lastPage)", 6) {
                fun playSound() {
                    config.sound?.let {
                        playSound(location, it, 1.0F, config.pitch)
                    }
                }

                fun updatePitch(pitch: Float) {
                    when {
                        pitch < 0 -> updatePitch(0F)
                        2 < pitch -> updatePitch(2F)
                        else -> {
                            config.pitch = pitch
                            item(
                                49,
                                Material.LIME_STAINED_GLASS_PANE,
                                "&fピッチ &a${String.format("%.1f", pitch)}",
                                "&6L: -0.5",
                                "&6SL: -0.1",
                                "&6SR: +0.1",
                                "&6R: +0.5"
                            ) {
                                onClick(ClickType.LEFT) {
                                    updatePitch(pitch - 0.5F)
                                }
                                onClick(ClickType.SHIFT_LEFT) {
                                    updatePitch(pitch - 0.1F)
                                }
                                onClick(ClickType.SHIFT_RIGHT) {
                                    updatePitch(pitch + 0.1F)
                                }
                                onClick(ClickType.RIGHT) {
                                    updatePitch(pitch + 0.5F)
                                }
                                onClick {
                                    playSound()
                                }
                            }
                        }
                    }
                }

                soundList[config.page].forEachIndexed { i, sound ->
                    item(i, soundToMaterial(sound), "&6${sound.name} &7${sound.key.key}") {
                        onClick {
                            config.sound = sound
                            playSound()
                        }
                    }
                }
                item(45..53, Material.BLACK_STAINED_GLASS_PANE, "")
                item(47, Material.ORANGE_STAINED_GLASS_PANE, "&d<<") {
                    onClick {
                        openSoundList(config.copy(page = config.page - 1))
                    }
                }
                item(51, Material.ORANGE_STAINED_GLASS_PANE, "&d>>") {
                    onClick {
                        openSoundList(config.copy(page = config.page + 1))
                    }
                }
                updatePitch(config.pitch)
            }.open(this)
        }
    }
}

package com.github.syari.ss.plugins.lobby

import com.github.syari.ss.plugins.core.code.CoolTime
import com.github.syari.ss.plugins.core.code.EventRegister
import com.github.syari.ss.plugins.core.code.ListenerFunctions
import com.github.syari.ss.plugins.core.item.CustomItemStack
import com.github.syari.ss.plugins.core.player.UUIDPlayer
import com.github.syari.ss.plugins.core.scheduler.CreateScheduler.runLater
import org.bukkit.GameMode
import org.bukkit.event.entity.EntityAirChangeEvent
import org.bukkit.event.player.PlayerDropItemEvent
import org.bukkit.event.player.PlayerInteractEvent
import org.bukkit.event.player.PlayerJoinEvent

object EventListener : EventRegister {
    override fun ListenerFunctions.events() {
        event<PlayerJoinEvent> {
            plugin.runLater(1) {
                LobbyInventory.applyToPlayer(it.player)
            }
        }
        event<PlayerDropItemEvent>(ignoreCancelled = true) {
            val player = it.player
            if (player.isOp.not() || player.gameMode != GameMode.CREATIVE) {
                it.isCancelled = true
            }
        }
        val gadgetCoolTime = CoolTime<UUIDPlayer>(plugin)
        event<PlayerInteractEvent> { e ->
            val item = e.item ?: return@event
            val player = e.player
            val uuidPlayer = UUIDPlayer(player)
            if (gadgetCoolTime.isAvailable(uuidPlayer)) {
                LobbyInventory.inventory.values.firstOrNull {
                    it.item.itemMeta?.displayName == item.itemMeta?.displayName
                }?.let {
                    it.toggle(player, CustomItemStack.create(item))
                    gadgetCoolTime.add(uuidPlayer, 10)
                    e.isCancelled = true
                }
            }
        }
        event<EntityAirChangeEvent> {
            it.isCancelled = true
        }
    }
}

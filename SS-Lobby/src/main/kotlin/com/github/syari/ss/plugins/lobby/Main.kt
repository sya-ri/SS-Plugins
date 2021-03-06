package com.github.syari.ss.plugins.lobby

import com.github.syari.ss.plugins.core.code.SSPlugin
import com.github.syari.ss.plugins.lobby.gadget.DoubleJump
import org.bukkit.plugin.java.JavaPlugin

class Main : SSPlugin() {
    companion object {
        internal lateinit var plugin: JavaPlugin
    }

    init {
        plugin = this
    }

    override val onEnables = listOf(ConfigLoader, CommandCreator, EventListener, DoubleJump.EventListener)
}

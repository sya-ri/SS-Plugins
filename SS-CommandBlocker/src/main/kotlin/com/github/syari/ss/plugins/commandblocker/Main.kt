package com.github.syari.ss.plugins.commandblocker

import com.github.syari.ss.plugins.core.code.SSPlugin
import org.bukkit.plugin.java.JavaPlugin

class Main : SSPlugin() {
    companion object {
        internal lateinit var plugin: JavaPlugin
    }

    override val onEnables = listOf(ConfigLoader)
    override val events = listOf(EventListener)

    override fun onEnable() {
        plugin = this
        runOnEnable()
        registerEvents()
    }
}

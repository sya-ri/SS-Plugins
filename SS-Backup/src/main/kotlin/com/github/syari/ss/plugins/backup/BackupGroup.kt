package com.github.syari.ss.plugins.backup

import com.github.syari.ss.plugins.backup.Backup.backupDirectory
import com.github.syari.ss.plugins.backup.Main.Companion.plugin
import java.io.File
import java.text.SimpleDateFormat

class BackupGroup(
    val name: String, val worldNames: MutableList<String>, val pluginNames: MutableList<String>, val otherPaths: MutableList<String>
) {
    companion object {
        private val dateFormat = SimpleDateFormat("yyyy_MM_dd_HH_mm_ss")

        fun from(
            name: String, worldNames: List<String>, pluginNames: List<String>, otherPaths: List<String>
        ) = BackupGroup(name, worldNames.toMutableList(), pluginNames.toMutableList(), otherPaths.toMutableList())
    }

    val zipFileName
        get() = dateFormat.format(System.currentTimeMillis()) + name + ".zip"

    val backupFiles
        get(): List<BackupFile> {
            val worlds = worldNames.mapNotNull { plugin.server.getWorld(it) }.map { BackupFile.World(it) }
            val plugins = pluginNames.mapNotNull { plugin.server.pluginManager.getPlugin(it) }.map { BackupFile.Plugin(it) }
            val others = otherPaths.map { BackupFile.Other(File(it)) }
            return worlds + plugins + others
        }

    fun create() {
        val files = backupFiles.map { it.file }.toTypedArray()
        if (backupDirectory.exists().not()) backupDirectory.mkdir()
        val output = File(backupDirectory, zipFileName)
        if (output.exists().not()) output.mkdir()
        zipFiles(files, output)
    }
}
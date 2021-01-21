package com.github.syari.ss.plugins.autocommand

import com.github.syari.ss.plugins.autocommand.Main.Companion.plugin
import com.github.syari.ss.plugins.core.Main.Companion.console
import com.github.syari.ss.plugins.core.code.IConfigLoader
import com.github.syari.ss.plugins.core.command.RunCommand
import com.github.syari.ss.plugins.core.config.CreateConfig.config
import com.github.syari.ss.plugins.core.config.CustomConfig
import com.github.syari.ss.plugins.core.config.type.ConfigDataType
import com.github.syari.ss.plugins.core.config.type.ConfigSectionType
import com.github.syari.ss.plugins.core.message.Message.send
import com.github.syari.ss.plugins.core.time.TimeScheduler.clearTimeScheduler
import com.github.syari.ss.plugins.core.time.TimeScheduler.getFormatTime
import com.github.syari.ss.plugins.core.time.TimeScheduler.scheduleEveryDayAt
import com.github.syari.ss.plugins.core.time.TimeScheduler.scheduleEveryWeekAt
import org.bukkit.command.CommandSender
import java.time.DayOfWeek

object ConfigLoader : IConfigLoader {
    override fun onEnable() {
        load(console)
    }

    override fun load(sender: CommandSender) {
        plugin.clearTimeScheduler()
        plugin.config(sender, "config.yml") {
            sender.send("&b[AutoCommand] &f自動コマンド一覧")
            section("every", ConfigTimeSectionType, false)?.forEach { (hour, minute, key) ->
                val commandList = get("every.$key", ConfigDataType.STRINGLIST) ?: return@forEach
                plugin.scheduleEveryDayAt(hour, minute) {
                    commandList.forEach(RunCommand::runCommandFromConsole)
                }
                sender.send("&7- &a${getFormatTime(hour, minute)} &7×${commandList.size}")
            }
            DayOfWeek.values().forEach { day ->
                val dayName = day.name.toLowerCase()
                section(dayName, ConfigTimeSectionType, false)?.forEach nextTime@{ (hour, minute, key) ->
                    val commandList = get("$dayName.$key", ConfigDataType.STRINGLIST) ?: return@nextTime
                    plugin.scheduleEveryWeekAt(day, hour, minute) {
                        commandList.forEach(RunCommand::runCommandFromConsole)
                    }
                    sender.send("&7- &a$dayName ${getFormatTime(hour, minute)} &7×${commandList.size}")
                }
            }
        }
    }

    data class Time(val hour: Int, val minute: Int, val key: String)

    object ConfigTimeSectionType : ConfigSectionType<Time> {
        override val typeName = "Time"

        override fun parse(
            config: CustomConfig,
            path: String,
            value: String
        ): Time? {
            val split = value.split(":")
            val hour = split.getOrNull(0)?.toIntOrNull() ?: return null
            val minute = split.getOrNull(1)?.toIntOrNull() ?: return null
            return Time(hour, minute, value)
        }
    }
}

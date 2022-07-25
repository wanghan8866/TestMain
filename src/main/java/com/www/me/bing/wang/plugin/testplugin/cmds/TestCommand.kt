package com.www.me.bing.wang.plugin.testplugin.cmds

import com.www.me.bing.wang.plugin.testplugin.TestPluginMain
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender

class TestCommand(testPluginMain: TestPluginMain):CommandExecutor {
    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>): Boolean {
        return false
    }
}
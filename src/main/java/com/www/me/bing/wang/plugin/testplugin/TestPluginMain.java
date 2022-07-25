package com.www.me.bing.wang.plugin.testplugin;

import com.www.me.bing.wang.plugin.testplugin.cmds.TestCommand;
import org.bukkit.plugin.java.JavaPlugin;

public final class TestPluginMain extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getCommand("test").setExecutor(new TestCommand(this));

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}

package org.peakimo.schoolrp;

import org.bukkit.plugin.java.JavaPlugin;
import org.peakimo.schoolrp.Exam.*;
import org.peakimo.schoolrp.Exam.Public;

public final class School_RP extends JavaPlugin {

    private static School_RP plugin;

    public static School_RP instance;

    public static School_RP getInstance(){

        return instance;

    }

    @Override
    public void onEnable() {
        // Plugin startup logic

        // Config File

        saveDefaultConfig();
        instance = this;

        // Events
        getServer().getPluginManager().registerEvents(new Public(this),this);
        getServer().getPluginManager().registerEvents(new Military(this),this);

        // Commands
        getCommand("exam").setExecutor(new exam_command());
        getCommand("Schoolrp-reload").setExecutor(new reload());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}

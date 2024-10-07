package org.peakimo.schoolrp;

import org.bukkit.plugin.java.JavaPlugin;
import org.peakimo.schoolrp.Exam.Public;
import org.peakimo.schoolrp.Exam.exam_command;
import org.peakimo.schoolrp.Exam.Public;

public final class School_RP extends JavaPlugin {

    private static School_RP plugin;

    @Override
    public void onEnable() {
        // Plugin startup logic

        // Events
        getServer().getPluginManager().registerEvents(new Public(this),this);

        // Commands
        getCommand("exam").setExecutor(new exam_command());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}

package org.peakimo.schoolrp.Exam;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.peakimo.schoolrp.School_RP;

public class reload implements CommandExecutor {

    private School_RP instance = School_RP.getInstance();

    @Override
    public boolean onCommand(CommandSender sender, Command command,String label,String[] args){

        Player bazikon = (Player) sender;

        if (sender.hasPermission("SchoolRP.reload")){

            instance.reloadConfig();
            sender.sendMessage("School-RP reloaded!");

        }

        return true;
    }

    private String color(String str) {
        return ChatColor.translateAlternateColorCodes('&', str);
    }

}

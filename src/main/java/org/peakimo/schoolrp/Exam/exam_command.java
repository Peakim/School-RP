package org.peakimo.schoolrp.Exam;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class exam_command implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command,String label,String[] args) {

        Player bazikon = (Player) sender;

        if (bazikon.hasPermission("School-rp.student.use")){



            // get Course
            if (bazikon.hasPermission("School-rp.exam.public.question1")) {
                bazikon.sendMessage(color("You have already started the exam!"));
            }

        if (!bazikon.hasPermission("School-rp.exam.public.question1")) {
            bazikon.sendMessage(color("The exam has started for you."));
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user " + bazikon.getName() + " permission settemp School-rp.exam.public.question1 true 30s");
            bazikon.sendMessage(color("&6[Question] 1: &fCommand didan pol khod chist? bedun [/] slash vared konid."));
            bazikon.sendMessage(color("&6[Military-Test] &a30 Sanie baraye ersal javab forsat darid pas az an pasokhi daryaft nemishavad."));
        }

        if (args.length == 1 && args[0].equalsIgnoreCase("military")) {

            if (!bazikon.hasPermission("School-rp.exam.military.question1")) {

                bazikon.sendMessage(color("&6[Military-Test] &fMilitary exam started for you!"));
                Bukkit.dispatchCommand(Bukkit.getConsoleSender(),"lp user " + bazikon.getName() + " permission settemp School-rp.exam.military.question1");
                bazikon.sendMessage(color("&6[Military-Test] &fQuestion 1: command mamoriat anjam dadan sarbaz chist? bedun [/] slash vared konid."));
                bazikon.sendMessage(color("&6[Military-Test] &a30 Sanie baraye ersal javab forsat darid pas az an pasokhi daryaft nemishavad."));

            }


        }
    }



        return true;
    }

    private String color(String str) {
        return ChatColor.translateAlternateColorCodes('&', str);
    }

}

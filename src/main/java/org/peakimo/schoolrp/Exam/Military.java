package org.peakimo.schoolrp.Exam;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.peakimo.schoolrp.School_RP;


public class Military implements Listener {

    private final School_RP plugin;

    public Military(School_RP plugin) {
        this.plugin = plugin;

    }
    @EventHandler
    public void onPlayerChat(AsyncPlayerChatEvent event) {

        Player bazikon = event.getPlayer();
        String message = event.getMessage();

        Bukkit.getScheduler().runTaskLater(plugin, () -> {

            // Question 1
            if (bazikon.hasPermission("School-rp.exam.military.question1")) {
                if (message.equalsIgnoreCase("soldierjob")) {

                    bazikon.sendMessage(color("&aPasokh shoma sahih bod."));

                    Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user " + bazikon.getName() + " permission unsettemp School-rp.exam.military.question1");
                    Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user " + bazikon.getName() + " permission settemp School-rp.exam.military.question2 true 30s");

                    // Soal baadi
                    bazikon.sendMessage(color("&6[Military-Test] 2: &fAya sarbaz mitavanad dar shahr ya makan ha azadane begardand??"));
                    bazikon.sendMessage(color("&6[Military-Test] 1- bale"));
                    bazikon.sendMessage(color("&6[Military-Test] 2- kheyr"));
                    bazikon.sendMessage(color("&6[Military-Test] Pasokh ra ba ersal adad [1,2] vared konid."));


                } else {
                    bazikon.sendMessage(color("&6[Military-Test] &cPasokh ghalat bod! mojadad bayad emtehan dahid!"));
                    Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user " + bazikon.getName() + " permission unsettemp School-rp.exam.public.question1");

                }
            }

            // Question 2
            if (bazikon.hasPermission("School-rp.exam.military.question2")) {

                if (message.equalsIgnoreCase("2")) {

                    bazikon.sendMessage(color("&aPasokh shoma sahih bod."));
                    Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user " + bazikon.getName() + " permission unsettemp School-rp.exam.military.question2");
                    Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user " + bazikon.getName() + " permission settemp School-rp.exam.military.question3 true 30s");

                    // Soal baadi
                    bazikon.sendMessage(color("&6[Military-Test] 3: &fCommand bazrasi badani zendanian"));
                    bazikon.sendMessage(color("&6[Military-Test] 1-&f /suspect (player)"));
                    bazikon.sendMessage(color("&6[Military-Test] 2-&f /wanted add (player)"));
                    bazikon.sendMessage(color("&6[Military-Test] 3-&f /invsee (player)"));
                    bazikon.sendMessage(color("&6[Military-Test] Pasokh ra ba ersal adad [1,2,3] vared konid."));

                }
                else {
                    bazikon.sendMessage(color("&cPasokh ghalat bod! mojadad bayad emtehan dahid!"));
                    Bukkit.dispatchCommand(Bukkit.getConsoleSender(),"lp user " + bazikon.getName() + " permission unsettemp School-rp.exam.military.question2");
                }
            }

            // Question 3
            if (bazikon.hasPermission("School-rp.exam.military.question3")) {

                if (message.equalsIgnoreCase("1")) {

                    bazikon.sendMessage(color("&aPasokh shoma sahih bod."));
                    Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user " + bazikon.getName() + " permission unsettemp School-rp.exam.military.question3");
                    Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user " + bazikon.getName() + " permission settemp School-rp.exam.military.question4 true 30s");

                    // Soal baadi
                    bazikon.sendMessage(color("&6[Military-Test] 3: &fAgar shahrvandi jeloye FBI ya rank balatar eghdam be koshtan va tir andazi kard mitavanad be fard marbot wanted dahad?"));
                    bazikon.sendMessage(color("&6[Military-Test] 1-&f Sahih"));
                    bazikon.sendMessage(color("&6[Military-Test] 2-&f Ghalat"));
                    bazikon.sendMessage(color("&6[Military-Test] Pasokh ra ba ersal adad [1,2] vared konid."));

                }
                else {
                    bazikon.sendMessage(color("&cPasokh ghalat bod! mojadad bayad emtehan dahid!"));
                    Bukkit.dispatchCommand(Bukkit.getConsoleSender(),"lp user " + bazikon.getName() + " permission unsettemp School-rp.exam.military.question3");
                }
            }
            // Winner
            if (bazikon.hasPermission("School-rp.exam.military.question4")) {

                if (message.equalsIgnoreCase("1")) {

                    Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user " + bazikon.getName() + " permission unsettemp School-rp.exam.military.question3");
                    Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user " + bazikon.getName() + " parent addtemp sarbaz 60d rp");

                    bazikon.sendMessage(color("&aPasokh shoma sahih bod."));
                    bazikon.sendMessage(color("&aShoma job sarbaz ra gereftid!"));

                }
                else {
                    bazikon.sendMessage(color("&cPasokh ghalat bod! mojadad bayad emtehan dahid!"));
                    Bukkit.dispatchCommand(Bukkit.getConsoleSender(),"lp user " + bazikon.getName() + " permission unsettemp School-rp.exam.military.question4");
                }
            }

        }, 20 * 2);

    }
    private String color(String str) {
        return ChatColor.translateAlternateColorCodes('&', str);
    }
}

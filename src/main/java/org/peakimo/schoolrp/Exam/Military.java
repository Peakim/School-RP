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
                    bazikon.sendMessage(color("&6[Military-Test] 2: &fAya sarbaz mitavanad dar shahr ya makan ha azadane begardad??"));
                    bazikon.sendMessage(color("&6[Military-Test] 1- bale"));
                    bazikon.sendMessage(color("&6[Military-Test] 1- kheyr"));
                    bazikon.sendMessage(color("&6[Military-Test] Pasokh ra ba ersal adad [1,2] vared konid."));


                } else {
                    bazikon.sendMessage(color("&6[Military-Test] &cPasokh ghalat bod! mojadad bayad emtehan dahid!"));
                    Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user " + bazikon.getName() + " permission unsettemp School-rp.exam.public.question1");

                }
            }

            // Question 2
            if (bazikon.hasPermission("School-rp.exam.military.question2")) {

                if (message.equalsIgnoreCase("baltop")) {

                    bazikon.sendMessage(color("&aPasokh shoma sahih bod."));
                    Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user " + bazikon.getName() + " permission unsettemp School-rp.exam.military.question2");
                    Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user " + bazikon.getName() + " permission settemp School-rp.exam.military.question3 true 30s");

                    // Soal baadi
                    bazikon.sendMessage(color("&6[Question] 3: &fSiyasat mali gheyr mamol chist?."));
                    bazikon.sendMessage(color("&6[Question] 3: &f1- be siyasat hayi ke server migozarad va mamoli bashand migoyand."));
                    bazikon.sendMessage(color("&6[Question] 3: &f2- dar sorati ke az rahe mokhtalefi mesl abuse ya residan be servat ziyad az tarafe harkas va barashon tojihi nabashe."));
                    bazikon.sendMessage(color("&6[Question] 3: &f3- estefade az client haye gheyr mojaz mesl fabric va forge va chand nemone digar."));
                    bazikon.sendMessage(color("&6[Question] &fbaraye pasokh faghat adad javab ra ersal konid."));

                }
                else {
                    bazikon.sendMessage(color("&cPasokh ghalat bod! mojadad bayad emtehan dahid!"));
                    Bukkit.dispatchCommand(Bukkit.getConsoleSender(),"lp user " + bazikon.getName() + " permission unsettemp School-rp.exam.military.question2");
                }
            }

        }, 20 * 2);

    }
    private String color(String str) {
        return ChatColor.translateAlternateColorCodes('&', str);
    }
}

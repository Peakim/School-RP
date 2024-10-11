package org.peakimo.schoolrp.Exam;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.inventory.ItemStack;
import org.peakimo.schoolrp.School_RP;

public class Public implements Listener {

    private final School_RP plugin;

    public Public(School_RP plugin) {
        this.plugin = plugin;

    }

    private School_RP instance = School_RP.getInstance();
    @EventHandler
    public void onPlayerChat(AsyncPlayerChatEvent event) {

        Player player = event.getPlayer();
        String message = event.getMessage();
        int rewardheartofsea = instance.getConfig().getInt("rewardcount-heartofthesea");

        // Question 1
        // بررسی پیام چت
        Bukkit.getScheduler().runTaskLater(plugin, () -> {

            // Question 1
            if (player.hasPermission("School-rp.exam.public.question1")) {
                if (message.equalsIgnoreCase("balance")) {

                    player.sendMessage(color("&aPasokh shoma sahih bod."));
                    Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user " + player.getName() + " permission unsettemp School-rp.exam.public.question1");

                    Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user " + player.getName() + " permission settemp School-rp.exam.public.question2 true 30s");

                    // Soal baadi
                    player.sendMessage(color("&6[Question] 2: &fCommand moshahedeh poldartarin bazikonan shahr? bedun [/] slash vared konid."));
                    player.sendMessage(color("&a30 Sanie forsat darid pas az an agar javab dahid pasokhi daryaft nemikonid."));


                } else {
                    player.sendMessage(color("&cPasokh ghalat bod! mojadad bayad emtehan dahid!"));
                    Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user " + player.getName() + " permission unsettemp School-rp.exam.public.question1");

                }
            }

            // Question 2
            if (player.hasPermission("School-rp.exam.public.question2")) {

                if (message.equalsIgnoreCase("baltop")) {

                    player.sendMessage(color("&aPasokh shoma sahih bod."));
                    Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user " + player.getName() + " permission unsettemp School-rp.exam.public.question2");
                    Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user " + player.getName() + " permission settemp School-rp.exam.public.question3 true 30s");

                    // Soal baadi
                    player.sendMessage(color("&6[Question] 3: &fSiyasat mali gheyr mamol chist?."));
                    player.sendMessage(color("&6[Question] 3: &f1- be siyasat hayi ke server migozarad va mamoli bashand migoyand."));
                    player.sendMessage(color("&6[Question] 3: &f2- dar sorati ke az rahe mokhtalefi mesl abuse ya residan be servat ziyad az tarafe harkas va barashon tojihi nabashe."));
                    player.sendMessage(color("&6[Question] 3: &f3- estefade az client haye gheyr mojaz mesl fabric va forge va chand nemone digar."));
                    player.sendMessage(color("&6[Question] &fbaraye pasokh faghat adad javab ra ersal konid."));

                }
                else {
                    player.sendMessage(color("&cPasokh ghalat bod! mojadad bayad emtehan dahid!"));
                    Bukkit.dispatchCommand(Bukkit.getConsoleSender(),"lp user " + player.getName() + " permission unsettemp School-rp.exam.public.question2");
                }
            }
            // Question 3
            if (player.hasPermission("School-rp.exam.public.question3")) {

                if (message.equalsIgnoreCase("2")) {

                    player.sendMessage(color("&aPasokh shoma sahih bod."));
                    Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user " + player.getName() + " permission unsettemp School-rp.exam.public.question3");
                    Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user " + player.getName() + " permission settemp School-rp.exam.public.question4 true 30s");
                    player.sendMessage(color("&6[Question] 4: &fMojazate Content-Snipe chist?."));
                    player.sendMessage(color("&6[Question] 4: &f1- mute."));
                    player.sendMessage(color("&6[Question] 4: &f2- kick"));
                    player.sendMessage(color("&6[Question] 4: &f3- ban."));
                    player.sendMessage(color("&6[Question] &fbaraye pasokh faghat adad javab ra ersal konid."));

                }
                else {
                    player.sendMessage(color("&cPasokh ghalat bod! mojadad bayad emtehan dahid!"));
                    Bukkit.dispatchCommand(Bukkit.getConsoleSender(),"lp user " + player.getName() + " permission unsettemp School-rp.exam.public.question3");
                }
            }
            // Question 3
            if (player.hasPermission("School-rp.exam.public.question4")) {

                if (message.equalsIgnoreCase("3")) {

                    player.sendMessage(color("&aPasokh shoma sahih bod."));
                    Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user " + player.getName() + " permission unsettemp School-rp.exam.public.question4");

                    // GetReward
                    player.sendMessage(color("&bShoma course khod ra daryaft kardid va barandeh shodid!"));
                    player.getInventory().addItem(new ItemStack(Material.HEART_OF_THE_SEA,rewardheartofsea));


                }
                else {
                    player.sendMessage(color("&cPasokh ghalat bod! mojadad bayad emtehan dahid!"));
                    Bukkit.dispatchCommand(Bukkit.getConsoleSender(),"lp user " + player.getName() + " permission unsettemp School-rp.exam.public.question4");
                }
            }

        }, 20 * 1);
    }

    private String color(String str) {
        return ChatColor.translateAlternateColorCodes('&', str);
    }

}

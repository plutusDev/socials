package com.gmail.conwayj74;

import org.apache.commons.lang.StringUtils;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class commandSocials extends socials implements CommandExecutor {
    main plugin = JavaPlugin.getPlugin(main.class);
    socials scl = new socials();


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args){


        if(sender instanceof Player){

            Player player = (Player) sender;
            scl.social(player);
        }

        return true;
    }

}

package com.gmail.conwayj74;

import org.apache.commons.lang.StringUtils;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class socials {
    main plugin = JavaPlugin.getPlugin(main.class);


    public boolean social(Player sender) {
        Player player = (Player) sender;
        ChatColor borderColour = ChatColor.valueOf(plugin.config.getString("borderColour").toUpperCase());

        ChatColor serverColour = ChatColor.valueOf(plugin.config.getString("serverNameColour").toUpperCase());

        ChatColor dTitleColour = ChatColor.valueOf(plugin.config.getString("discordColour").toUpperCase());
        ChatColor dTextColour = ChatColor.valueOf(plugin.config.getString("discordLinkColour").toUpperCase());

        ChatColor wTitleColour = ChatColor.valueOf(plugin.config.getString("websiteColour").toUpperCase());
        ChatColor wTextColour = ChatColor.valueOf(plugin.config.getString("websiteLinkColour").toUpperCase());

        ChatColor tTitleColour = ChatColor.valueOf(plugin.config.getString("twitterColour").toUpperCase());
        ChatColor tTextColour = ChatColor.valueOf(plugin.config.getString("twitterLinkColour").toUpperCase());

        ChatColor yTitleColour1 = ChatColor.valueOf(plugin.config.getString("youtubeColour1").toUpperCase());
        ChatColor yTitleColour2 = ChatColor.valueOf(plugin.config.getString("youtubeColour2").toUpperCase());
        ChatColor yTextColour = ChatColor.valueOf(plugin.config.getString("youtubeLinkColour").toUpperCase());


        int nameLength = plugin.config.getString("serverName").length();
        String borderType = plugin.config.getString("borderType");
        int borderLength = borderType.length();
        int finalLength = nameLength / borderLength;
        String autoBorder = StringUtils.repeat(borderType, finalLength);

        if (plugin.config.getBoolean("borderAutoSize") == false) {
            String border = StringUtils.repeat(borderType, plugin.config.getInt("borderSize"));
            player.sendRawMessage(borderColour + border);
            player.sendRawMessage(  serverColour + plugin.config.getString("serverName"));
            player.sendRawMessage(borderColour + border);
        } else {
            player.sendRawMessage(borderColour + autoBorder);
            player.sendRawMessage(serverColour + plugin.config.getString("serverName"));
            player.sendRawMessage(borderColour + autoBorder);
        }


        if (plugin.config.getBoolean("discord")) {
            player.sendRawMessage(dTitleColour + "Discord: " + dTextColour + plugin.config.getString("discordLink"));
        }
        if (plugin.config.getBoolean("website")) {
            player.sendRawMessage(wTitleColour + "Website: " + wTextColour + plugin.config.getString("websiteLink"));
        }
        if (plugin.config.getBoolean("twitter")) {
            player.sendRawMessage(tTitleColour + "Twitter: " + tTextColour + plugin.config.getString("twitterLink"));
        }
        if (plugin.config.getBoolean("youtube")) {
            player.sendRawMessage(yTitleColour1 + "You" + yTitleColour2 + "Tube: " + yTextColour + plugin.config.getString("youtubeLink"));
        }

        return true;
    }


}



package com.gmail.conwayj74;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;



public class main extends JavaPlugin{
    FileConfiguration config = getConfig();


    @Override
    public void onEnable(){
        saveDefaultConfig();

        if(config.getBoolean("enableCommand") == true){
            this.getCommand("socials").setExecutor(new commandSocials());
        }
        if(config.getBoolean("enableOnJoin") == true) {
            getServer().getPluginManager().registerEvents(new onJoinSocials(), this);
        }


    }

    @Override
    public void onDisable(){
    }








}

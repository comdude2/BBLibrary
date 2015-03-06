package net.mcviral.dev.plugins.bblibrary.main;

import org.bukkit.plugin.java.JavaPlugin;

public class BBLibrary extends JavaPlugin{
	
	public void onEnable(){
		this.getLogger().info(this.getDescription().getName() + " Enabled!");
	}
	
	public void onDisable(){
		this.getLogger().info(this.getDescription().getName() + " Disabled!");
	}
	
}

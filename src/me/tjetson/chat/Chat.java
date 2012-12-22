package me.tjetson.chat;

import java.util.logging.Logger;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Chat extends JavaPlugin
{
	public final static Logger logger = Logger.getLogger("Minecraft");
	
	@Override
	public void onEnable()
	{
		PluginManager pm = getServer().getPluginManager();
		
		ChatListener cl = new ChatListener();
		
		pm.registerEvents(cl, this);
		
		logger.info("Enabled!");
	}
	
	@Override
	public void onDisable()
	{
		logger.info("Disabled!");
	}
}

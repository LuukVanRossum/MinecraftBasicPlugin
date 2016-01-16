package iamluuck.basicplugin;

import java.util.logging.Logger;

import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import commands.Bye;
import commands.CreeperSpawn;
import commands.Feed;
import commands.Heal;
import commands.Hello;
import commands.Hurt;
import commands.SkeletonSpawn;
import commands.ZombieSpawn;
import event.BlockBreak;
import event.PlayerWelcome;

public class basic extends JavaPlugin {
	
	public void onEnable(){
		PluginDescriptionFile pdfFile = getDescription();
		Logger logger = getLogger();
	
		registerCommands();
		registerEvents();
		
		logger.info(pdfFile.getName() + " has been enabled " + pdfFile.getVersion());
	}
	
	public void onDisable(){
		PluginDescriptionFile pdfFile = getDescription();
		Logger logger = getLogger();
		
		logger.info(pdfFile.getName() + " has been disabled " + pdfFile.getVersion());
	}
	
	public void registerCommands(){
		getCommand("heal").setExecutor(new Heal());
		getCommand("hello").setExecutor(new Hello());
		getCommand("bye").setExecutor(new Bye());
		getCommand("feed").setExecutor(new Feed());
		getCommand("hurt").setExecutor(new Hurt());
		getCommand("spawnzombie").setExecutor(new ZombieSpawn());
		getCommand("spawnskeleton").setExecutor(new SkeletonSpawn());
		getCommand("spawncreeper").setExecutor(new CreeperSpawn());
	}
	
	public void registerEvents(){
		PluginManager pm = getServer().getPluginManager();
		pm.registerEvents(new BlockBreak(), this);
		pm.registerEvents(new PlayerWelcome(), this);
	}
}

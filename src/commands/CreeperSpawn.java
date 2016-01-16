package commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import iamluuck.basicplugin.MobSpawn;

public class CreeperSpawn implements CommandExecutor{
	public boolean onCommand(CommandSender sender, Command command,
			String label, String[] args) {
		if (!(sender instanceof Player)){
			sender.sendMessage("You must be a player to use this command!");
			return false;
		}
		MobSpawn spawn = new MobSpawn();
		Player player = (Player) sender;
		switch (args[0])
		{
		case "normal":
			spawn.SpawnNormalCreeper(player, Integer.parseInt(args[1]));
			break;
		case "advanced":
			spawn.SpawnAdvancedCreeper(player, Integer.parseInt(args[1]));
			break;
		}
		return true;
	}
}

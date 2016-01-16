package commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import iamluuck.basicplugin.MobSpawn;

public class ZombieSpawn implements CommandExecutor{
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
			spawn.SpawnNormalZombie(player, Integer.parseInt(args[1]));
			break;
		case "advanced":
			spawn.SpawnAdvancedZombie(player, Integer.parseInt(args[1]));
			break;
		case "elite":
			if (args.length == 2)
			{
				spawn.SpawnEliteZombie(player, Integer.parseInt(args[1]), "");
			}
			else
			{
				spawn.SpawnEliteZombie(player, Integer.parseInt(args[1]), args[2]);
			}
			Bukkit.broadcastMessage("Watch out! An elite mob has spawned!");
			break;
		}
		return true;
	}
	
}

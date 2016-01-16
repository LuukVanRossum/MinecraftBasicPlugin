package commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import iamluuck.basicplugin.MobSpawn;

public class SkeletonSpawn implements CommandExecutor{
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
			spawn.SpawnNormalSkeleton(player, Integer.parseInt(args[1]));
			break;
		case "advanced":
			spawn.SpawnAdvancedSkeleton(player, Integer.parseInt(args[1]));
			break;
		case "elite":
			if (args.length == 2)
			{
				spawn.SpawnEliteSkeleton(player, Integer.parseInt(args[1]), "");
			}
			else
			{
				spawn.SpawnEliteSkeleton(player, Integer.parseInt(args[1]), args[2]);
			}
			Bukkit.broadcastMessage("Watch out! An elite mob has spawned!");
			break;
		}
		return true;

	}
}

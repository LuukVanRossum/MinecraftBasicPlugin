package commands;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Bye implements CommandExecutor{

	public boolean onCommand(CommandSender sender, Command command,
			String label, String[] args) {
		if (!(sender instanceof Player)){
			sender.sendMessage("You must be a player to use this command!");
			return false;
		}
		
		Player player = (Player) sender;
		
		Location l = new Location(player.getWorld(), 50165, 111, 50158);
		player.sendMessage(ChatColor.GOLD + "Goodbye " + player.getName() + "!");
		player.teleport(l);
		
		return true;
	}

}

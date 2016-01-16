package commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Heal implements CommandExecutor{

	public boolean onCommand(CommandSender sender, Command command,
			String label, String[] args) {
		if (!(sender instanceof Player)){
			sender.sendMessage("You must be a player to use this command!");
			return false;
		}		
		Player player = (Player) sender;
		if (player.getHealth() == 20)
		{
			player.sendMessage(ChatColor.GREEN + "You do already have maximum health!");
			return false;
		}
		player.setHealth(20);
		player.sendMessage(ChatColor.GREEN + "You have been healed!");
		return true;
	}

}

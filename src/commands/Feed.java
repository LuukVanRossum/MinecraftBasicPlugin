package commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Feed implements CommandExecutor{
	public boolean onCommand(CommandSender sender, Command command,	String label, String[] args){
		if (!(sender instanceof Player))
		{
			sender.sendMessage("You must be a player to use this command!");
			return false;
		}
		
		Player player = (Player)sender;
		if (player.getFoodLevel() >= 20)
		{
			sender.sendMessage(ChatColor.RED + "You are not hungry!");
			return false;
		}
		
		player.setFoodLevel(20);	
		sender.sendMessage(ChatColor.GREEN + "You have been fed, " + ChatColor.YELLOW + "you fatass!!");
		return true;
	}

}

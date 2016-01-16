package commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Hurt implements CommandExecutor{
	public boolean onCommand(CommandSender sender, Command command,String label, String[] args) 
	{
		if (args[0] == "")
		{
			sender.sendMessage(ChatColor.RED + "Give the name of the player to damage");
			return false;
		}
		if (Bukkit.getPlayer(args[0]) != null)
		{
			Player playerToDamage = Bukkit.getPlayer(args[0]);
			playerToDamage.damage(Double.parseDouble(args[1]));
			playerToDamage.sendMessage("You have been damaged by " + sender.getName() + "!");
			sender.sendMessage(playerToDamage.getName() + " has been damaged!");
		}	
		return true;
	}
	
}

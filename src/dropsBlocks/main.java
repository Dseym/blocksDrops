package dropsBlocks;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandExecutor;
import org.bukkit.plugin.java.JavaPlugin;



public class main extends JavaPlugin {
	
	static boolean start = false;
	String tagPlugin = ChatColor.RESET + "[" + ChatColor.BLUE + "DropsBlocks" + ChatColor.RESET + "] ";
	
	public void onEnable() {
		
		Bukkit.getPluginManager().registerEvents(new event(), this);
		this.getCommand("start").setExecutor((CommandExecutor)new commands(this, this.tagPlugin));
		this.getLogger().info("Started!");
		
	}
	
}

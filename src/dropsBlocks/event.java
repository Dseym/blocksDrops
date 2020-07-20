package dropsBlocks;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;



public class event implements Listener {

	@EventHandler
	void run(PlayerMoveEvent e) {
		
		double xFrom = Math.floor(e.getFrom().getX());
		double yFrom = Math.floor(e.getFrom().getY());
		double zFrom = Math.floor(e.getFrom().getZ());
		double xTo = Math.round(e.getTo().getX());
		double yTo = Math.round(e.getTo().getY());
		double zTo = Math.round(e.getTo().getZ());
		
		Location loc = e.getPlayer().getLocation();
		loc.setY(loc.getY()-1);
		
		
		if((xFrom != xTo || yFrom != yTo || zFrom != zTo ) && main.start && loc.getBlock().getType() != Material.AIR) {
			
			for(int i = 0; i < 256; i++) {
				
				new Location(e.getFrom().getWorld(), xFrom-1, i, zFrom).getBlock().setType(Material.AIR);
				
			}
			
		}
		
	}
	
}

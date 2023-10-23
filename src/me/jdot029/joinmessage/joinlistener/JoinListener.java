package me.jdot029.joinmessage.joinlistener;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import me.jdot029.joinmessage.Main;

public class JoinListener implements Listener{
	
	public JoinListener(Main plugin) {
		Bukkit.getPluginManager().registerEvents(this, plugin);
	}
	@EventHandler(priority = EventPriority.HIGHEST)
	public void onJoin(PlayerJoinEvent e) {
		Player p = e.getPlayer();
		
		if (p.hasPlayedBefore() == true) {
			e.setJoinMessage("§3Willkommen zurück§6 " + p.getName() + "§3!");
		} else {
			e.setJoinMessage("§3Willkommen auf diesem Server,§6 " + p.getName() + "§3!");
		}
	
	}
}

package me.jdot029.joinmessage.joinlistener;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

import me.jdot029.joinmessage.Main;

public class JoinListener implements Listener {

    public JoinListener(Main plugin) {
        Bukkit.getPluginManager().registerEvents(this, plugin);
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onJoin(PlayerJoinEvent e) {
        Player p = e.getPlayer();

        if (p.hasPlayedBefore()) {
            e.setJoinMessage("§3Willkommen zurück§6 " + p.getName() + "§3!");
            Bukkit.broadcastMessage("[§a+§r] §3" + p.getName());
        } else {
            e.setJoinMessage("§3Willkommen auf diesem Server,§6 " + p.getName() + "§3!");
            // Broadcast Join-Nachricht nur für neue Spieler
            Bukkit.broadcastMessage("§6§lWILLKOMMEN, " + p.getName() + " !");
        }
    }

    @EventHandler
    public void onQuit(PlayerQuitEvent event) {
        Player player = event.getPlayer();
        event.setQuitMessage("[§c-§r] §3" + player.getName());

        // Broadcast Quit-Nachricht an alle Spieler
        Bukkit.broadcastMessage("[§c-§r] §c" + player.getName());
    }
}

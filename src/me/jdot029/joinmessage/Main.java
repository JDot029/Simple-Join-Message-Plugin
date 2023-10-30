package me.jdot029.joinmessage;

import org.bukkit.plugin.java.JavaPlugin;

import me.jdot029.joinmessage.joinlistener.JoinListener;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("JoinMessage Plugin wurde aktiviert!");
        new JoinListener(this);
    }
}

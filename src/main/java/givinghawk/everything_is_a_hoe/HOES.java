package givinghawk.everything_is_a_hoe;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.Bukkit;

public final class HOES extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(new playerJoin(), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}

package givinghawk.everything_is_a_hoe;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.command.ConsoleCommandSender;

public class playerJoin implements Listener {
    @EventHandler
    public void playerJoin(PlayerJoinEvent e) {
        Player player = e.getPlayer();
        //Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "clear "+player.getName());
        e.getPlayer().getInventory().clear();
        player.getInventory().addItem(new ItemStack(Material.WOODEN_HOE,9999999));
        e.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, 99999, 5));
        //Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "give "+player.getName()+" golden_hoe{display:{Name:\"[{\\\"text\\\":\\\"Most useful item\\\",\\\"italic\\\":\\\"false\\\"}]\",Lore:[\"⠀⠀⠀⣀⣠⣤⣤⣤⣀⣀⣀⡀⠀⠀⠀⠀⠀⠀⣀⣤⣤⣦⠦⠶⠴⠦⣤⣀⠀\",\"⣠⠖⢛⡉⠥⠤⠬⠌⣉⠉⠛⠋⠀⠀⠀⠀⠐⠛⠋⣉⡀⠤⠤⡤⠄⣀⠀⠁⠁\",\"⣀⣠⣵⢿⣿⣿⣿⣿⣶⢧⣄⠀⠀⠀⠀⠀⠀⢀⣬⣷⣾⣿⣿⣿⡿⣦⣄⢀⠀\",\"⠈⠻⣧⡘⣿⣿⣿⣶⡿⢈⣇⠀⠀⠀⠀⠀⠀⣐⣏⠻⣿⣿⣿⡾⢃⣼⠟⠉⠀\",\"⠀⠀⠈⠹⠶⢿⡿⠷⠾⠿⠁⠀⠀⠀⠀⠀⠀⠉⠹⠹⠾⠿⠷⠶⠏⠀⠀⠀⠀\",\"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\",\"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\",\"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\",\"⠀⠀⠀⠀⠀⠀⣠⣄⡤⣤⡖⣬⢥⣂⣔⡬⣅⣆⢤⢀⣀⠀⠀⠀⠀⠀⠀⠀⠀\",\"⠀⠀⠀⠀⠀⠀⠀⠘⢝⡷⢯⣧⣯⣾⣥⣯⣽⢾⡿⡿⠃⠀⠀⠀⠀⠀⠀⠀⠀\",\"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠋⢝⡲⢭⠭⡭⣍⣞⣣⠝⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\",\"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⠁⠀⠉⠘⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\"]}} 36");
        player.sendMessage("Woah, these are so useful! Enjoy them!");
        System.out.println("[LOG] Replaced "+player.getName()+"'s inventory");
    }
}

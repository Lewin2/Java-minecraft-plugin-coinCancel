package me.lewin.dellunacoin;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

public class CancelEvent implements Listener {
    @EventHandler
    private void onPlayerUse(PlayerInteractEvent event){
        Player player = event.getPlayer();
        ItemStack item = player.getItemInHand();
        if (isGold(item)){
            event.setCancelled(true);
        }
        else if (isSilver(item)){
            event.setCancelled(true);
        }
        else if (isCopper(item)){
            event.setCancelled(true);
        }
    }

    private boolean isGold(ItemStack item){
        if (item.getType() == Material.RED_DYE){
            if (item.getItemMeta().hasCustomModelData()){
                if (item.getItemMeta().getCustomModelData() == 1000){
                    return true;
                }
            }
        }
        return false;
    }
    private boolean isSilver(ItemStack item){
        if (item.getType() == Material.BLUE_DYE){
            if (item.getItemMeta().hasCustomModelData()){
                if (item.getItemMeta().getCustomModelData() == 1000){
                    return true;
                }
            }
        }
        return false;
    }
    private boolean isCopper(ItemStack item){
        if (item.getType() == Material.GREEN_DYE){
            if (item.getItemMeta().hasCustomModelData()){
                if (item.getItemMeta().getCustomModelData() == 1000){
                    return true;
                }
            }
        }
        return false;
    }
}

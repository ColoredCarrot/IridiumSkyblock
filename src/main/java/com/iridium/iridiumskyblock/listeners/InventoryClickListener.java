package com.iridium.iridiumskyblock.listeners;

import com.iridium.iridiumskyblock.gui.GUI;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;

public class InventoryClickListener implements Listener {

    @EventHandler
    public void onInventoryClick(InventoryClickEvent event) {
        Inventory inv = event.getClickedInventory();
        if (inv != null && inv.getHolder() != null && inv.getHolder() instanceof GUI) {
            event.setCancelled(true);
            ((GUI) inv.getHolder()).onInventoryClick(event);
        }
    }
}

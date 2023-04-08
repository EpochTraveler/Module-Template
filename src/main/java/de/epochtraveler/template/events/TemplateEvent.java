package de.epochtraveler.template.events;

import de.epochtraveler.epochapi.Core;
import de.epochtraveler.epochapi.event.EventListener;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.TextColor;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerJoinEvent;
import org.w3c.dom.Text;

public class TemplateEvent {

    public TemplateEvent()
    {
        Core.registerListener(PlayerJoinEvent.class, (EventListener<PlayerJoinEvent>) event ->
        {
            Player player = event.getPlayer();
            event.setJoinMessage(String.format(" §7| §a§l+ §7| » §9%s", event.getPlayer().getDisplayName()));
        });
    }

}

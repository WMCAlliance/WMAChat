package me.tjetson.chat;

import java.util.Iterator;
import java.util.Set;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class ChatListener implements Listener
{
	@EventHandler public void onChat(AsyncPlayerChatEvent event)
	{
		event.setCancelled(true);
		Set<Player> recipientsSet = event.getRecipients();
		  
		if (!recipientsSet.isEmpty())
		{
			Iterator<Player> i = recipientsSet.iterator();
			while (i.hasNext())
			{
				Player receiver = i.next();
				receiver.sendMessage("MESSAGE FROM: "+event.getPlayer().getName());
				receiver.sendMessage(event.getMessage());
				  
				Chat.logger.info("MESSAGE FROM: "+event.getPlayer().getName());
				Chat.logger.info(event.getMessage());
			}
		}
	}
}
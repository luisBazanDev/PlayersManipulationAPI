package pe.bazan.luis.plugins.playersmanipulationapi.events;

import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import pe.bazan.luis.plugins.playersmanipulationapi.enums.MessageKey;
import pe.bazan.luis.plugins.playersmanipulationapi.utils.Messages;

public class JoinEvent implements Listener {
    public void onPlayerJoin(PlayerJoinEvent e) {
        e.getPlayer().sendMessage(Messages.getMessage(MessageKey.WELCOME_MSG));
    }
}

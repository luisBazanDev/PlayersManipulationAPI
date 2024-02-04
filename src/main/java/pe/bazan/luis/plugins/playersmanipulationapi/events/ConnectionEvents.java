package pe.bazan.luis.plugins.playersmanipulationapi.events;

import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerLoginEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import pe.bazan.luis.plugins.playersmanipulationapi.PlayersManipulationAPI;
import pe.bazan.luis.plugins.playersmanipulationapi.domain.PlayerManipulated;
import pe.bazan.luis.plugins.playersmanipulationapi.enums.MessageKey;
import pe.bazan.luis.plugins.playersmanipulationapi.utils.Messages;

public class ConnectionEvents implements Listener {
    public void onPlayerLogin(PlayerLoginEvent e) {
        PlayerManipulated playerManipulated = PlayersManipulationAPI.getPlayerManipulated(e.getPlayer().getName());

        if (playerManipulated == null) playerManipulated = new PlayerManipulated(e.getPlayer());

        if (playerManipulated.isCanJoinServer()) return;
        else e.getPlayer().kick(Messages.formatMsg(Messages.getMessage(MessageKey.YOU_CANT_JOIN)));
    }

    public void onPlayerLeave(PlayerQuitEvent e) {

    }
}

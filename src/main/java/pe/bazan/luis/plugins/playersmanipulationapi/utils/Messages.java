package pe.bazan.luis.plugins.playersmanipulationapi.utils;

import net.kyori.adventure.text.Component;
import org.bukkit.ChatColor;
import pe.bazan.luis.plugins.playersmanipulationapi.PlayersManipulationAPI;
import pe.bazan.luis.plugins.playersmanipulationapi.enums.MessageKey;

public class Messages {
    public static String getMessage(MessageKey key) {
        return PlayersManipulationAPI.getInstance().getMessagesConfig().get(key.toString());
    }

    public static Component formatMsg(String text) {
        return Component.text(text);
    }

    @Deprecated
    public static Component formatOldColorsMsg(String text) {
        return Component.text(ChatColor.translateAlternateColorCodes('&', text));
    }
}

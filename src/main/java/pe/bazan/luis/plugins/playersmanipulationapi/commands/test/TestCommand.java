package pe.bazan.luis.plugins.playersmanipulationapi.commands.test;


import org.bukkit.Bukkit;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import pe.bazan.luis.plugins.playersmanipulationapi.PlayersManipulationAPI;
import pe.bazan.luis.plugins.playersmanipulationapi.commands.Command;
import pe.bazan.luis.plugins.playersmanipulationapi.commands.CommandInfo;
import pe.bazan.luis.plugins.playersmanipulationapi.enums.MessageKey;
import pe.bazan.luis.plugins.playersmanipulationapi.utils.Messages;

import java.util.ArrayList;
import java.util.List;

@CommandInfo(
        name = "test",
        pattern = "test",
        usage = "/manipulationapi test <player>",
        desc = "Only a test command",
        permission = "PlayersManipulationAPI.commands.test.test"
)
public class TestCommand implements Command {
    @Override
    public boolean execute(PlayersManipulationAPI plugin, CommandSender sender, String... args) {
        if (args.length == 0) {
            sender.sendMessage(Messages.getMessage(MessageKey.CMD_TEST_NO_PLAYER));
        } else {
            sender.sendMessage(Messages.getMessage(MessageKey.CMD_TEST_PLAYER) + args[0]);
        }
        return true;
    }

    @Override
    public List<String> tab(PlayersManipulationAPI plugin, Player player, String... args) {
        List<String> complete = new ArrayList<>();
        if (args.length == 1) {
            for (String string : Bukkit.getOnlinePlayers().stream().map(x -> x.getName().toLowerCase()).toList()) {
                if (string.startsWith(args[0])) complete.add(string);
            }
            return complete;
        }
        return complete;
    }
}

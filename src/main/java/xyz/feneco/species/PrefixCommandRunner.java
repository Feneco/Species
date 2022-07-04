package xyz.feneco.species;

import org.bukkit.Bukkit;
import org.bukkit.Color;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;
import xyz.feneco.species.userInterface.SelectorInterface;

public class PrefixCommandRunner {
    private ConsoleCommandSender console;

    PrefixCommandRunner(){
        console = Bukkit.getServer().getConsoleSender();
    }

    public void setPrefix(Player player, String species, Color color) {

    }
}

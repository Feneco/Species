package xyz.feneco.species;

import org.bukkit.Color;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import xyz.feneco.species.userInterface.SelectorInterface;
import xyz.feneco.species.userInterface.ColorSelector;
import xyz.feneco.species.userInterface.SpeciesSelector;

public class SpeciesCommand implements CommandExecutor {
    PrefixCommandRunner prefixCommandRunner;

    SpeciesCommand(){
        prefixCommandRunner = Species.getInstance().getPrefixCommandRunner();
    }

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if(sender instanceof Player) {
            Player player = (Player) sender;
            SelectorInterface<String> species = new SpeciesSelector();
            SelectorInterface<Color> color    = new ColorSelector();
            species.showInterface(player);
            if(!species.getSuccess()) { return false; }
            color.showInterface(player);
            if(!color.getSuccess()) { return false; }
            prefixCommandRunner.setPrefix(player, species.getValue(), color.getValue());
            return true;
        }
        else {
            return false;
        }
    }
}

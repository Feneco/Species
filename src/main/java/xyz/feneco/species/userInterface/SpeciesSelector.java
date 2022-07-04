package xyz.feneco.species.userInterface;

import com.github.stefvanschie.inventoryframework.gui.type.ChestGui;
import com.github.stefvanschie.inventoryframework.pane.PaginatedPane;
import org.bukkit.entity.Player;
import xyz.feneco.jtrees.JTrees;

public class SpeciesSelector implements SelectorInterface<String>{
    private boolean success;
    private String  value;

    public void showInterface(Player player){
        ChestGui gui = new ChestGui(4, "Inventory");
        PaginatedPane pageSelector = new PaginatedPane(0, 0, 9, 3);
        gui.addPane(pageSelector);
        JTrees<String> = SpeciesTreeInterface.get();
        gui.show(player);
        // todo
    }
    public boolean getSuccess(){
        return success;
    }
    public String getValue(){
        return value;
    }
}

package xyz.feneco.species.userInterface;

import org.bukkit.Color;
import org.bukkit.entity.Player;

public class ColorSelector implements SelectorInterface<Color>{
    private boolean success;
    private Color value;
    public void showInterface(Player player){
        // TODO: 24/06/2022
    }
    public boolean getSuccess(){
        return success;
    };
    public Color getValue(){
        return value;
    };
}

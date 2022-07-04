package xyz.feneco.species.userInterface;

import org.bukkit.entity.Player;

public interface SelectorInterface<T> {
    public void showInterface(Player player);
    public boolean getSuccess();
    public T getValue();
}

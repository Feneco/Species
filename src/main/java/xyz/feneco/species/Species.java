package xyz.feneco.species;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import xyz.feneco.species.configurations.SpeciesTreeInterface;

public final class Species extends JavaPlugin {
    private PrefixCommandRunner prefixCommandRunner;
    private SpeciesTreeInterface speciesTree;
    private static Species species;

    @Override
    public void onEnable() {
        species = this;
        // todo: speciesTree =  new speciesTreeLoader();
        prefixCommandRunner = new PrefixCommandRunner();
        Bukkit.getLogger().info("Hello world!");
        this.getCommand("species").setExecutor(new SpeciesCommand());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        Bukkit.getLogger().info("goodbye");
    }

    public PrefixCommandRunner getPrefixCommandRunner() {
        return prefixCommandRunner;
    }

    public static Species getInstance() {
        return species;
    }
}

package pe.bazan.luis.plugins.playersmanipulationapi.configs;

import org.bukkit.configuration.file.FileConfiguration;
import pe.bazan.luis.plugins.playersmanipulationapi.PlayersManipulationAPI;

public class MainConfig {
    private CustomConfig configFile;
    private PlayersManipulationAPI plugin;
    // --- Variables to config
    private boolean enabled;
    // ---

    public MainConfig(PlayersManipulationAPI plugin) {
        this.plugin = plugin;
        registerConfig();
    }

    /**
     * Register configuration file or create it based on plugin resources
     */
    private void registerConfig() {
        configFile = new CustomConfig("configs/config.yml", plugin);
        configFile.registerConfig();
    }

    /**
     * Logic to load things
     */
    private void load() {
        FileConfiguration config = configFile.getConfig();
        enabled = config.getBoolean("enabled");
    }

    /**
     * Method for reload this config
     */
    public void reloadConfig() {
        configFile.reloadConfig();
        load();
    }

    // --- Getters and setters
    public boolean isEnabled() {
        return enabled;
    }
}

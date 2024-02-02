package pe.bazan.luis.plugins.playersmanipulationapi.configs;

import pe.bazan.luis.plugins.playersmanipulationapi.PlayersManipulationAPI;

public class MessagesConfig {
    private CustomConfig configFile;
    private PlayersManipulationAPI plugin;

    public MessagesConfig(PlayersManipulationAPI plugin) {
        this.plugin = plugin;
        registerConfig();
    }

    /**
     * Register configuration file or create it based on plugin resources
     */
    private void registerConfig() {
        configFile = new CustomConfig("messages/EN_US.yml", plugin);
        configFile.registerConfig();
    }

    /**
     * Method for reload this config
     */
    public void reloadConfig() {
        configFile.reloadConfig();
    }

    public String get(String key) {
        return this.configFile.getConfig().getString(key, "ERROR TO GET MESSAGE: " + key);
    }
}

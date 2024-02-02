package pe.bazan.luis.plugins.playersmanipulationapi;

import org.bukkit.plugin.java.JavaPlugin;
import pe.bazan.luis.plugins.playersmanipulationapi.commands.CommandHandler;
import pe.bazan.luis.plugins.playersmanipulationapi.configs.MainConfig;
import pe.bazan.luis.plugins.playersmanipulationapi.configs.MessagesConfig;
import pe.bazan.luis.plugins.playersmanipulationapi.events.JoinEvent;

public final class PlayersManipulationAPI extends JavaPlugin {
    private static PlayersManipulationAPI instance;
    public static String pluginId = "PlayersManipulationAPI";
    private MainConfig mainConfig;
    private MessagesConfig messagesConfig;
    private CommandHandler commandHandler;

    @Override
    public void onEnable() {
        // Plugin startup logic
        instance = this;

        loadConfigs();
        setUpCommandHandler();

        registerEvents();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    // -- Plugin methods

    /**
     * Load all configs
     */
    private void loadConfigs() {
        mainConfig = new MainConfig(this);
        messagesConfig = new MessagesConfig(this);
    }

    /**
     * Start a command handler
     */
    private void setUpCommandHandler() {
        commandHandler = new CommandHandler(this);
        getCommand("playersmanipulationapi").setExecutor(commandHandler);
        getCommand("playersmanipulationapi").setTabCompleter(commandHandler);
    }

    /**
     * Register events of the plugin
     */
    private void registerEvents() {
        getServer().getPluginManager().registerEvents(new JoinEvent(), this);
    }

    // --- Getters and Setters

    /**
     * Singleton pattern
     * @return Unique instance of the plugin
     */
    public static PlayersManipulationAPI getInstance() {
        return instance;
    }

    public MainConfig getMainConfig() {
        return mainConfig;
    }

    public MessagesConfig getMessagesConfig() {
        return messagesConfig;
    }
}

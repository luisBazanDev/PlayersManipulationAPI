package pe.bazan.luis.plugins.playersmanipulationapi.domain;

import org.bukkit.Location;
import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import pe.bazan.luis.plugins.kitsapi.KitsAPI;
import pe.bazan.luis.plugins.kitsapi.api.KitsHelper;
import pe.bazan.luis.plugins.kitsapi.domain.Kit;
import pe.bazan.luis.plugins.kitsapi.domain.KitItem;
import pe.bazan.luis.plugins.playersmanipulationapi.PlayersManipulationAPI;

import javax.annotation.Nullable;

public class PlayerManipulated {
    private OfflinePlayer offlinePlayer;
    private boolean canMove;
    private boolean canJoinServer;
    private boolean isSpectator;
    private boolean canDeath;
    private Location spawnLocation;
    private Kit kit;

    public PlayerManipulated(OfflinePlayer player) {
        this.offlinePlayer = player;
        this.canMove = true;
        this.canJoinServer = true;
        this.canDeath = true;
        this.isSpectator = false;
        this.kit = null;
    }

    /**
     *
     * @return if player is online return player or null if is offline
     */
    @Nullable
    public Player getPlayer() {
        return offlinePlayer.getPlayer();
    }

    // Getters
    public OfflinePlayer getOfflinePlayer() {
        return offlinePlayer;
    }

    public boolean isCanMove() {
        return canMove;
    }

    public boolean isCanJoinServer() {
        return canJoinServer;
    }

    public boolean isSpectator() {
        return isSpectator;
    }

    public boolean isCanDeath() {
        return canDeath;
    }

    public Kit getKit() {
        return kit;
    }

    public boolean isOnline() {
        return offlinePlayer.isOnline();
    }

    // Setters

    public void setCanMove(boolean canMove) {
        this.canMove = canMove;
    }

    public void setCanJoinServer(boolean canJoinServer) {
        this.canJoinServer = canJoinServer;
    }

    public void setSpectator(boolean spectator) {
        isSpectator = spectator;
    }

    public void setCanDeath(boolean canDeath) {
        this.canDeath = canDeath;
    }
}

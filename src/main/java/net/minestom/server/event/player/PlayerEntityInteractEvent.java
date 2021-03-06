package net.minestom.server.event.player;

import net.minestom.server.entity.Entity;
import net.minestom.server.entity.Player;
import net.minestom.server.event.Event;
import org.jetbrains.annotations.NotNull;

/**
 * Called when a {@link Player} interacts (right-click) with an {@link Entity}.
 */
public class PlayerEntityInteractEvent extends Event {

    private final Player player;
    private final Entity entityTarget;
    private final Player.Hand hand;

    public PlayerEntityInteractEvent(@NotNull Player player, @NotNull Entity entityTarget, @NotNull Player.Hand hand) {
        this.player = player;
        this.entityTarget = entityTarget;
        this.hand = hand;
    }

    /**
     * Gets the {@link Player} who is interacting.
     *
     * @return the {@link Player}
     */
    @NotNull
    public Player getPlayer() {
        return player;
    }

    /**
     * Gets the {@link Entity} with who {@link #getPlayer()} is interacting.
     *
     * @return the {@link Entity}
     */
    @NotNull
    public Entity getTarget() {
        return entityTarget;
    }

    /**
     * Gets with which hand the player interacted with the entity.
     *
     * @return the hand
     */
    @NotNull
    public Player.Hand getHand() {
        return hand;
    }
}
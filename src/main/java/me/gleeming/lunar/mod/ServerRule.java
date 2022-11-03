package me.gleeming.lunar.mod;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum ServerRule {

    /**
     * Whether or not minimap is allowed
     * Expected value: (String) NEUTRAL or FORCED_OFF
     */
    MINIMAP_STATUS("minimapStatus"),

    /**
     * Whether or not the server will store waypoints, instead of the client
     */
    SERVER_HANDLES_WAYPOINTS("serverHandlesWaypoints"),

    /**
     * A warning message will be shown when attempting to disconnect if the current
     * game is competitive.
     */
    COMPETITIVE_GAME("competitiveGame"),

    /**
     * If this server forces shaders to be disabled
     */
    SHADERS_DISABLED("shadersDisabled"),

    /**
     * If the server runs legacy enchanting (pre 1.8)
     */
    LEGACY_ENCHANTING("legacyEnchanting"),

    /**
     * If this server has enabled voice chat
     */
    VOICE_ENABLED("voiceEnabled"),

    /**
     * Whether to revert combat mechanics to 1.7
     */
    LEGACY_COMBAT("legacyCombat");

    @Getter private final String name;

}

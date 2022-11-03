package me.gleeming.lunar.mod;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum ModType {

    LEGACY_VISUALS("one_seven_visuals"),
    FPS("fps"),
    CPS("cps"),
    SKYBLOCK_ADDONS("skyblockAddons"),
    TOGGLE_SNEAK("toggleSneak"),
    HYPIXEL("hypixel_mod"),
    ARMOR_STATUS("armorstatus"),
    KEYSTROKES("keystrokes"),
    COORDINATES("coords"),
    CROSSHAIR("crosshair"),
    POTION_EFFECTS("potioneffects"),
    DIRECTION_HUD("direction_hud"),
    WAYPOINTS("waypoints"),
    SCOREBOARD("scoreboard"),
    POTION_COUNTER("potion_counter"),
    PING("ping"),
    MOTION_BLUR("motionBlur"),
    CHAT("chat"),
    SCROLLABLE_TOOLTIPS("scrollable_tooltip"),
    UHC_OVERLAY("uhc_overlay"),
    PARTICLE_MULTIPLIER("particleMultiplierMod"),
    COOLDOWNS("cooldowns"),
    WORLDEDIT_CUI("worldedit_cui"),
    CLOCK("clock"),
    STOPWATCH("stopwatch"),
    MEMORY_USAGE("memory"),
    COMBO_COUNTER("combo"),
    REACH_DISPLAY("range"),
    TIME_CHANGER("time"),
    SERVER_ADDRESS("serverAddressMod"),
    SATURATION("saturation"),
    ITEM_PHYSICS("itemPhysic"),
    ITEM_TRACKER("itemTrackerChild"),
    SHINY_POTS("shinyPots"),
    BLOCK_OUTLINE("block_outline"),
    SCREENSHOT_UPLOADER("screenshot"),
    FOV("fov_mod"),
    TEXT_HOTKEY("textHotKey"),
    NET_GRAPH("netgraph"),
    MUMBLE_LINK("mumble.link"),
    BOSS_BAR("bossbar"),
    FREE_LOOK("freelook"),
    REPLAY("replaymod"),
    NICK_HIDER("nickHider");

    @Getter private final String name;

}

package me.gleeming.lunar;

import lombok.Getter;
import me.gleeming.lunar.mod.ModType;
import me.gleeming.lunar.mod.settings.ModSettingsBuilder;
import me.gleeming.lunar.packet.impl.DisableModPacket;
import org.bukkit.plugin.Plugin;

public class LunarWrapper {

    @Getter private static Plugin plugin;

    /**
     * Registers the plugin as the
     * primary plugin for the wrapper
     *
     * Note: This must be called or nothing
     * inside of this library will work.
     *
     * @param plugin Plugin
     */
    public static void register(Plugin plugin) {
        LunarWrapper.plugin = plugin;

        plugin.getServer().getMessenger().registerIncomingPluginChannel(plugin, "Lunar-Client", (s, player, bytes) -> {});
        plugin.getServer().getMessenger().registerOutgoingPluginChannel(plugin, "Lunar-Client");

    }

}

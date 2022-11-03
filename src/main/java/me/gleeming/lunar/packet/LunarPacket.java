package me.gleeming.lunar.packet;

import me.gleeming.lunar.LunarWrapper;
import me.gleeming.lunar.buffer.LunarBuffer;
import me.gleeming.lunar.packet.info.PacketInfo;
import org.bukkit.entity.Player;

public abstract class LunarPacket {

    private final PacketInfo packetInfo;

    public LunarPacket() {
        packetInfo = getClass().getAnnotation(PacketInfo.class);

        if (packetInfo == null) {
            System.out.println("[lunar-wrapper] Warning: " + getClass().getSimpleName() + " doesn't have a packet info.");
        }
    }

    /**
     * Applies the values to the buffer
     * @param buffer Buffer
     * @return Lunar Buffer
     */
    public abstract LunarBuffer applyValues(LunarBuffer buffer);

    /**
     * Sends the packet to the player
     * @param player Player
     */
    public void sendPacket(Player player) {
        if (LunarWrapper.getPlugin() == null) {
            System.out.println("[lunar-wrapper] You must register the lunar wrapper plugin.");
            return;
        }

        LunarBuffer buffer = applyValues(new LunarBuffer().append(packetInfo.id()));
        byte[] bytes = buffer.getBuffer().array();

        player.sendPluginMessage(LunarWrapper.getPlugin(), "Lunar-Client", bytes);
    }

}

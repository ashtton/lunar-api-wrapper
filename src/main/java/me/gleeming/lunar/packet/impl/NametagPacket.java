package me.gleeming.lunar.packet.impl;

import lombok.AllArgsConstructor;
import me.gleeming.lunar.buffer.LunarBuffer;
import me.gleeming.lunar.packet.LunarPacket;
import me.gleeming.lunar.packet.info.PacketInfo;
import org.bukkit.ChatColor;

import java.util.List;
import java.util.UUID;

@AllArgsConstructor
@PacketInfo(id = 7)
public class NametagPacket extends LunarPacket {

    private final UUID player;
    private final List<String> nametag;

    @Override
    public LunarBuffer applyValues(LunarBuffer buffer) {
        buffer.append(player).append(nametag != null);

        if (nametag != null) {
            buffer.append(nametag.size());
            nametag.stream().map(line -> ChatColor.translateAlternateColorCodes('&', line)).forEach(buffer::append);
        }

        return buffer;
    }
}

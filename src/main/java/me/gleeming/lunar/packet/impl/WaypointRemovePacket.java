package me.gleeming.lunar.packet.impl;

import lombok.AllArgsConstructor;
import me.gleeming.lunar.buffer.LunarBuffer;
import me.gleeming.lunar.packet.LunarPacket;
import me.gleeming.lunar.packet.info.PacketInfo;

@AllArgsConstructor
@PacketInfo(id = 24)
public class WaypointRemovePacket extends LunarPacket {

    private final String name;
    private final String world;

    @Override
    public LunarBuffer applyValues(LunarBuffer buffer) {
        buffer.append(name);
        buffer.append(world);

        return buffer;
    }
}

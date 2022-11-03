package me.gleeming.lunar.packet.impl;

import lombok.AllArgsConstructor;
import me.gleeming.lunar.buffer.LunarBuffer;
import me.gleeming.lunar.packet.LunarPacket;
import me.gleeming.lunar.packet.info.PacketInfo;

import java.awt.*;
import java.util.Map;
import java.util.UUID;

@AllArgsConstructor
@PacketInfo(id = 23)
public class WaypointCreatePacket extends LunarPacket {

    private final String name;
    private final int x;
    private final int y;
    private final int z;
    private final String world;
    private final Color color;
    private final boolean forced;
    private final boolean visible;

    @Override
    public LunarBuffer applyValues(LunarBuffer buffer) {
        buffer.append(name);
        buffer.append(world);
        buffer.append(color.getRGB());
        buffer.append(x);
        buffer.append(y);
        buffer.append(z);
        buffer.append(forced);
        buffer.append(visible);

        return buffer;
    }
}

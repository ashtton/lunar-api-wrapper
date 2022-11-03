package me.gleeming.lunar.packet.impl;

import lombok.AllArgsConstructor;
import me.gleeming.lunar.buffer.LunarBuffer;
import me.gleeming.lunar.packet.LunarPacket;
import me.gleeming.lunar.packet.info.PacketInfo;

import java.util.Map;
import java.util.UUID;

@AllArgsConstructor
@PacketInfo(id = 13)
public class TeamPacket extends LunarPacket {

    private final UUID leader;
    private final Map<UUID, Map<String, Double>> members;

    @Override
    public LunarBuffer applyValues(LunarBuffer buffer) {
        buffer.append(leader != null);

        if (leader != null) {
            buffer.append(leader);
        }

        buffer.append(0).append(members.size());

        members.forEach((uuid, map) -> {
            buffer.append(uuid).append(map.size());
            map.forEach((key, val) -> buffer.append(key).append(val));
        });

        return buffer;
    }
}

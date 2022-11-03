package me.gleeming.lunar.packet.impl;

import lombok.AllArgsConstructor;
import me.gleeming.lunar.buffer.LunarBuffer;
import me.gleeming.lunar.packet.LunarPacket;
import me.gleeming.lunar.packet.info.PacketInfo;
import me.gleeming.lunar.staff.StaffModule;

@AllArgsConstructor
@PacketInfo(id = 3)
public class CooldownPacket extends LunarPacket {

    private final String message;
    private final long duration;
    private final int icon;

    @Override
    public LunarBuffer applyValues(LunarBuffer buffer) {
        return buffer.append(message).append(duration).append(icon);
    }
}

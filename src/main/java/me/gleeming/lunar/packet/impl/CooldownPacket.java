package me.gleeming.lunar.packet.impl;

import lombok.AllArgsConstructor;
import me.gleeming.lunar.buffer.LunarBuffer;
import me.gleeming.lunar.packet.LunarPacket;
import me.gleeming.lunar.packet.info.PacketInfo;
import me.gleeming.lunar.staff.StaffModule;

import java.util.concurrent.TimeUnit;

@AllArgsConstructor
@PacketInfo(id = 3)
public class CooldownPacket extends LunarPacket {

    private final String name;
    private final int icon;
    private final TimeUnit timeUnit;
    private final long duration;

    @Override
    public LunarBuffer applyValues(LunarBuffer buffer) {
        return buffer.append(name).append(timeUnit.toMillis(duration)).append(icon);
    }
}

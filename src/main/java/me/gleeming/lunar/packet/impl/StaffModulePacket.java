package me.gleeming.lunar.packet.impl;

import lombok.AllArgsConstructor;
import me.gleeming.lunar.buffer.LunarBuffer;
import me.gleeming.lunar.packet.LunarPacket;
import me.gleeming.lunar.packet.info.PacketInfo;
import me.gleeming.lunar.staff.StaffModule;

@AllArgsConstructor
@PacketInfo(id = 12)
public class StaffModulePacket extends LunarPacket {

    private final StaffModule module;
    private final boolean value;

    @Override
    public LunarBuffer applyValues(LunarBuffer buffer) {
        return buffer.append(module.name()).append(value);
    }
}

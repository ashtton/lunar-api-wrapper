package me.gleeming.lunar.packet.impl;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import me.gleeming.lunar.buffer.LunarBuffer;
import me.gleeming.lunar.mod.ServerRule;
import me.gleeming.lunar.packet.LunarPacket;
import me.gleeming.lunar.packet.info.PacketInfo;

@RequiredArgsConstructor
@PacketInfo(id = 10)
public class ServerRulePacket extends LunarPacket {

    @Getter private final ServerRule rule;
    @Getter private final boolean booleanValue;

    @Override
    public LunarBuffer applyValues(LunarBuffer buffer) {
        buffer.append(rule.getName());
        if (rule == ServerRule.MINIMAP_STATUS)
            return buffer.append(booleanValue ? "NEUTRAL" : "FORCED_OFF");
        buffer.append(booleanValue);
        buffer.getBuffer().writeInt(0);
        buffer.getBuffer().writeFloat(0);
        return buffer;
    }
}

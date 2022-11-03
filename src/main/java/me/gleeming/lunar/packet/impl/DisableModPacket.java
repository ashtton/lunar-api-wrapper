package me.gleeming.lunar.packet.impl;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import me.gleeming.lunar.buffer.LunarBuffer;
import me.gleeming.lunar.mod.ServerRule;
import me.gleeming.lunar.mod.settings.ModSettingsBuilder;
import me.gleeming.lunar.packet.LunarPacket;
import me.gleeming.lunar.packet.info.PacketInfo;

@RequiredArgsConstructor
@PacketInfo(id = 31)
public class DisableModPacket extends LunarPacket {

    @Getter private final ModSettingsBuilder modSettings;

    @Override
    public LunarBuffer applyValues(LunarBuffer buffer) {
        buffer.append(modSettings.create());
        return buffer;
    }
}

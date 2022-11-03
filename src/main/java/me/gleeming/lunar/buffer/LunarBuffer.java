package me.gleeming.lunar.buffer;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import lombok.Getter;

import java.nio.charset.StandardCharsets;
import java.util.UUID;

@Getter
public class LunarBuffer {

    private final ByteBuf buffer = Unpooled.buffer();


    /**
     * Appends the integer to the buffer
     * @param num Number
     * @return Lunar Buffer
     */
    public LunarBuffer append(int num) {
        while((num & -128) != 0) {
            buffer.writeByte(num & 127 | 128);
            num >>>= 7;
        }

        buffer.writeByte(num);
        return this;
    }

    /**
     * Appends the string to the buffer
     * @param str String
     * @return Lunar Buffer
     */
    public LunarBuffer append(String str) {
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        append(bytes.length);
        buffer.writeBytes(bytes);
        return this;
    }

    /**
     * Appends the boolean to the buffer
     * @param bool Boolean
     * @return Lunar Buffer
     */
    public LunarBuffer append(boolean bool) {
        buffer.writeBoolean(bool);
        return this;
    }

    /**
     * Appends the UUID to the buffer
     * @param uuid UUID
     * @return Lunar Buffer
     */
    public LunarBuffer append(UUID uuid) {
        buffer.writeLong(uuid.getMostSignificantBits());
        buffer.writeLong(uuid.getLeastSignificantBits());
        return this;
    }

}

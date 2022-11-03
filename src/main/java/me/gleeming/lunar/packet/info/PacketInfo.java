package me.gleeming.lunar.packet.info;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface PacketInfo {

    /**
     * Retrieves the ID
     * @return ID
     */
    int id();

}

package me.gleeming.lunar.mod.settings;

import me.gleeming.lunar.mod.ModType;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class ModSettingsBuilder {

    private final Set<String> disabledMods = new HashSet<>();

    public ModSettingsBuilder disable(ModType modType) {
        disabledMods.add(modType.getName());
        return this;
    }

    public String create() {

        ModSettings.ModSetting disabled = new ModSettings.ModSetting(false, new HashMap<>());

        ModSettings modSettings = new ModSettings();

        disabledMods.forEach(mod -> modSettings.addModSetting(mod, disabled));

        return ModSettings.GSON.toJson(modSettings);
    }

}

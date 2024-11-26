
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.genshinnature.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

import net.mcreator.genshinnature.GenshinNatureMod;

public class GenshinNatureModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(Registries.SOUND_EVENT, GenshinNatureMod.MODID);
	public static final DeferredHolder<SoundEvent, SoundEvent> SILENCE = REGISTRY.register("silence", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("genshin_nature", "silence")));
}

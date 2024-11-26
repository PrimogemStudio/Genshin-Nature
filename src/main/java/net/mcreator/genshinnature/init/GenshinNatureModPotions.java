
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.genshinnature.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.core.registries.Registries;

import net.mcreator.genshinnature.GenshinNatureMod;

public class GenshinNatureModPotions {
	public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(Registries.POTION, GenshinNatureMod.MODID);
	public static final DeferredHolder<Potion, Potion> BLINDNESSPOTION = REGISTRY.register("blindnesspotion", () -> new Potion(new MobEffectInstance(MobEffects.BLINDNESS, 3600, 0, false, true)));
	public static final DeferredHolder<Potion, Potion> COLDPROTECTIONPOTION = REGISTRY.register("coldprotectionpotion", () -> new Potion(new MobEffectInstance(GenshinNatureModMobEffects.COLDPROTECTION, 6000, 0, false, true)));
	public static final DeferredHolder<Potion, Potion> WITHERINGPROTECTIONPOTION = REGISTRY.register("witheringprotectionpotion", () -> new Potion(new MobEffectInstance(GenshinNatureModMobEffects.WITHERINGPROTECTION, 2400, 0, false, true)));
}

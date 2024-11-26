
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.genshinnature.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.core.registries.Registries;

import net.mcreator.genshinnature.world.features.RandomchestsaroundspawnFeatureFeature;
import net.mcreator.genshinnature.GenshinNatureMod;

public class GenshinNatureModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(Registries.FEATURE, GenshinNatureMod.MODID);
	public static final DeferredHolder<Feature<?>, Feature<?>> RANDOMCHESTSAROUNDSPAWN_FEATURE = REGISTRY.register("randomchestsaroundspawn_feature", RandomchestsaroundspawnFeatureFeature::new);
}

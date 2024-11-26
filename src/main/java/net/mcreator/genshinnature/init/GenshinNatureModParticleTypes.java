
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.genshinnature.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.core.registries.Registries;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

import net.mcreator.genshinnature.GenshinNatureMod;

public class GenshinNatureModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(Registries.PARTICLE_TYPE, GenshinNatureMod.MODID);
	public static final DeferredHolder<ParticleType<?>, SimpleParticleType> MYSTERIOUSBUBBLE = REGISTRY.register("mysteriousbubble", () -> new SimpleParticleType(false));
	public static final DeferredHolder<ParticleType<?>, SimpleParticleType> ELECTROBUBBLE = REGISTRY.register("electrobubble", () -> new SimpleParticleType(false));
	public static final DeferredHolder<ParticleType<?>, SimpleParticleType> WARMBUBBLE = REGISTRY.register("warmbubble", () -> new SimpleParticleType(false));
	public static final DeferredHolder<ParticleType<?>, SimpleParticleType> SAKURAPARTICLE = REGISTRY.register("sakuraparticle", () -> new SimpleParticleType(true));
	public static final DeferredHolder<ParticleType<?>, SimpleParticleType> PARTICLETHUNDERRIFTHOUND = REGISTRY.register("particlethunderrifthound", () -> new SimpleParticleType(true));
	public static final DeferredHolder<ParticleType<?>, SimpleParticleType> PARTICLEGEORIFTHOUND = REGISTRY.register("particlegeorifthound", () -> new SimpleParticleType(true));
	public static final DeferredHolder<ParticleType<?>, SimpleParticleType> PARTICLEHITWOLFLORD = REGISTRY.register("particlehitwolflord", () -> new SimpleParticleType(true));
	public static final DeferredHolder<ParticleType<?>, SimpleParticleType> LUMINOUSBUBBLE = REGISTRY.register("luminousbubble", () -> new SimpleParticleType(false));
	public static final DeferredHolder<ParticleType<?>, SimpleParticleType> SMOKEFOG = REGISTRY.register("smokefog", () -> new SimpleParticleType(true));
	public static final DeferredHolder<ParticleType<?>, SimpleParticleType> DARKFOG = REGISTRY.register("darkfog", () -> new SimpleParticleType(true));
}

package net.mcreator.genshinnature.procedures;

import net.neoforged.neoforge.event.entity.living.LivingIncomingDamageEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.tags.TagKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

import net.mcreator.genshinnature.init.GenshinNatureModMobEffects;

import javax.annotation.Nullable;

@EventBusSubscriber
public class DendroelectrifiedProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingIncomingDamageEvent event) {
		if (event.getEntity() != null) {
			execute(event, event.getEntity(), event.getSource().getEntity());
		}
	}

	public static void execute(Entity entity, Entity sourceentity) {
		execute(null, entity, sourceentity);
	}

	private static void execute(@Nullable Event event, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("genshin_nature:enemyofnatureaffected")))) {
			if (entity instanceof LivingEntity _livEnt1 && _livEnt1.hasEffect(GenshinNatureModMobEffects.ELECTRIFIED)) {
				if (sourceentity.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("genshin_nature:electricabsorbaffected")))) {
					if (sourceentity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 140, 1));
				}
				if (sourceentity.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("genshin_nature:enemyofnatureaffected")))) {
					if (sourceentity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 140, 1));
				}
				if (sourceentity instanceof LivingEntity _livEnt6 && _livEnt6.hasEffect(GenshinNatureModMobEffects.DENDROVISIONEFFECT)) {
					if (sourceentity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 140, 1));
				}
				if (sourceentity instanceof LivingEntity _livEnt8 && _livEnt8.hasEffect(GenshinNatureModMobEffects.DENDRODELUSIONEFFECT)) {
					if (sourceentity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 140, 1));
				}
				if (sourceentity instanceof LivingEntity _livEnt10 && _livEnt10.hasEffect(GenshinNatureModMobEffects.ELECTROVISIONEFFECT)) {
					if (sourceentity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 140, 1));
				}
				if (sourceentity instanceof LivingEntity _livEnt12 && _livEnt12.hasEffect(GenshinNatureModMobEffects.ELECTRODELUSIONEFFECT)) {
					if (sourceentity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 140, 1));
				}
			}
		}
		if (entity instanceof LivingEntity _livEnt14 && _livEnt14.hasEffect(GenshinNatureModMobEffects.DENDROVISIONEFFECT)) {
			if (entity instanceof LivingEntity _livEnt15 && _livEnt15.hasEffect(GenshinNatureModMobEffects.ELECTRIFIED)) {
				if (sourceentity.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("genshin_nature:electricabsorbaffected")))) {
					if (sourceentity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 140, 1));
				}
				if (sourceentity.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("genshin_nature:enemyofnatureaffected")))) {
					if (sourceentity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 140, 1));
				}
				if (sourceentity instanceof LivingEntity _livEnt20 && _livEnt20.hasEffect(GenshinNatureModMobEffects.DENDROVISIONEFFECT)) {
					if (sourceentity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 140, 1));
				}
				if (sourceentity instanceof LivingEntity _livEnt22 && _livEnt22.hasEffect(GenshinNatureModMobEffects.DENDRODELUSIONEFFECT)) {
					if (sourceentity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 140, 1));
				}
				if (sourceentity instanceof LivingEntity _livEnt24 && _livEnt24.hasEffect(GenshinNatureModMobEffects.ELECTROVISIONEFFECT)) {
					if (sourceentity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 140, 1));
				}
				if (sourceentity instanceof LivingEntity _livEnt26 && _livEnt26.hasEffect(GenshinNatureModMobEffects.ELECTRODELUSIONEFFECT)) {
					if (sourceentity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 140, 1));
				}
			}
		}
		if (entity instanceof LivingEntity _livEnt28 && _livEnt28.hasEffect(GenshinNatureModMobEffects.DENDRODELUSIONEFFECT)) {
			if (entity instanceof LivingEntity _livEnt29 && _livEnt29.hasEffect(GenshinNatureModMobEffects.ELECTRIFIED)) {
				if (sourceentity.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("genshin_nature:electricabsorbaffected")))) {
					if (sourceentity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 140, 1));
				}
				if (sourceentity.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("genshin_nature:enemyofnatureaffected")))) {
					if (sourceentity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 140, 1));
				}
				if (sourceentity instanceof LivingEntity _livEnt34 && _livEnt34.hasEffect(GenshinNatureModMobEffects.DENDROVISIONEFFECT)) {
					if (sourceentity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 140, 1));
				}
				if (sourceentity instanceof LivingEntity _livEnt36 && _livEnt36.hasEffect(GenshinNatureModMobEffects.DENDRODELUSIONEFFECT)) {
					if (sourceentity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 140, 1));
				}
				if (sourceentity instanceof LivingEntity _livEnt38 && _livEnt38.hasEffect(GenshinNatureModMobEffects.ELECTROVISIONEFFECT)) {
					if (sourceentity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 140, 1));
				}
				if (sourceentity instanceof LivingEntity _livEnt40 && _livEnt40.hasEffect(GenshinNatureModMobEffects.ELECTRODELUSIONEFFECT)) {
					if (sourceentity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 140, 1));
				}
			}
		}
	}
}

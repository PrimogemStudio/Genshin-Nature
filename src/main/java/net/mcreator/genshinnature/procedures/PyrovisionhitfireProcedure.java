package net.mcreator.genshinnature.procedures;

import net.neoforged.neoforge.event.entity.living.LivingIncomingDamageEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.tags.TagKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

import net.mcreator.genshinnature.init.GenshinNatureModMobEffects;

import javax.annotation.Nullable;

@EventBusSubscriber
public class PyrovisionhitfireProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingIncomingDamageEvent event) {
		if (event.getEntity() != null) {
			execute(event, event.getEntity().level(), event.getEntity(), event.getSource().getEntity());
		}
	}

	public static void execute(LevelAccessor world, Entity entity, Entity sourceentity) {
		execute(null, world, entity, sourceentity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (sourceentity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(GenshinNatureModMobEffects.PYROVISIONEFFECT)) {
			if (Math.random() > 0.8) {
				entity.igniteForSeconds(10);
			}
			if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("genshin_nature:icebreakeraffected")))) {
				if (sourceentity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 60, 0));
			}
			if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("genshin_nature:enemyofnatureaffected")))) {
				entity.igniteForSeconds(15);
			}
			if (entity instanceof LivingEntity _livEnt6 && _livEnt6.hasEffect(GenshinNatureModMobEffects.DENDROVISIONEFFECT)) {
				entity.igniteForSeconds(15);
			}
			if (entity instanceof LivingEntity _livEnt8 && _livEnt8.hasEffect(GenshinNatureModMobEffects.DENDRODELUSIONEFFECT)) {
				entity.igniteForSeconds(15);
			}
		}
		if (sourceentity instanceof LivingEntity _livEnt10 && _livEnt10.hasEffect(GenshinNatureModMobEffects.PYRODELUSIONEFFECT)) {
			if (Math.random() > 0.7) {
				entity.igniteForSeconds(10);
				sourceentity.hurt(new DamageSource(world.holderOrThrow(DamageTypes.GENERIC)), 1);
			}
			if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("genshin_nature:icebreakeraffected")))) {
				if (sourceentity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 100, 1));
				sourceentity.hurt(new DamageSource(world.holderOrThrow(DamageTypes.GENERIC)), 1);
			}
			if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("genshin_nature:enemyofnatureaffected")))) {
				entity.igniteForSeconds(15);
				sourceentity.hurt(new DamageSource(world.holderOrThrow(DamageTypes.GENERIC)), 1);
			}
			if (entity instanceof LivingEntity _livEnt22 && _livEnt22.hasEffect(GenshinNatureModMobEffects.DENDROVISIONEFFECT)) {
				entity.igniteForSeconds(15);
				sourceentity.hurt(new DamageSource(world.holderOrThrow(DamageTypes.GENERIC)), 1);
			}
			if (entity instanceof LivingEntity _livEnt26 && _livEnt26.hasEffect(GenshinNatureModMobEffects.DENDRODELUSIONEFFECT)) {
				entity.igniteForSeconds(15);
				sourceentity.hurt(new DamageSource(world.holderOrThrow(DamageTypes.GENERIC)), 2);
			}
		}
	}
}

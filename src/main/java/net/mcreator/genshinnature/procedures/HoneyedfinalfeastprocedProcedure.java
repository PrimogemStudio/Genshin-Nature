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
public class HoneyedfinalfeastprocedProcedure {
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
		if (sourceentity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(GenshinNatureModMobEffects.HONEYEDFINALFEASTEFFECT)) {
			if (sourceentity instanceof LivingEntity _livEnt1 && _livEnt1.hasEffect(GenshinNatureModMobEffects.PYROVISIONEFFECT)) {
				if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("genshin_nature:fireextinguiseraffected")))) {
					if (sourceentity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 130, 2));
				}
			}
			if (sourceentity instanceof LivingEntity _livEnt4 && _livEnt4.hasEffect(GenshinNatureModMobEffects.PYRODELUSIONEFFECT)) {
				if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("genshin_nature:fireextinguiseraffected")))) {
					if (sourceentity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 130, 2));
				}
			}
			if (sourceentity instanceof LivingEntity _livEnt7 && _livEnt7.hasEffect(GenshinNatureModMobEffects.HYDROVISIONEFFECT)) {
				if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("genshin_nature:hydrophobiaaffected")))) {
					if (sourceentity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 130, 2));
				}
			}
			if (sourceentity instanceof LivingEntity _livEnt10 && _livEnt10.hasEffect(GenshinNatureModMobEffects.HYDRODELUSIONEFFECT)) {
				if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("genshin_nature:hydrophobiaaffected")))) {
					if (sourceentity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 130, 2));
				}
			}
			if (sourceentity instanceof LivingEntity _livEnt13 && _livEnt13.hasEffect(GenshinNatureModMobEffects.ANEMOVISIONEFFECT)) {
				if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("genshin_nature:windbloweraffected")))) {
					if (sourceentity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 130, 2));
				}
			}
			if (sourceentity instanceof LivingEntity _livEnt16 && _livEnt16.hasEffect(GenshinNatureModMobEffects.ANEMODELUSIONEFFECT)) {
				if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("genshin_nature:windbloweraffected")))) {
					if (sourceentity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 130, 2));
				}
			}
			if (sourceentity instanceof LivingEntity _livEnt19 && _livEnt19.hasEffect(GenshinNatureModMobEffects.ELECTROVISIONEFFECT)) {
				if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("genshin_nature:electricabsorbaffected")))) {
					if (sourceentity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 130, 2));
				}
			}
			if (sourceentity instanceof LivingEntity _livEnt22 && _livEnt22.hasEffect(GenshinNatureModMobEffects.ELECTRODELUSIONEFFECT)) {
				if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("genshin_nature:electricabsorbaffected")))) {
					if (sourceentity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 130, 2));
				}
			}
			if (sourceentity instanceof LivingEntity _livEnt25 && _livEnt25.hasEffect(GenshinNatureModMobEffects.CRYOVISIONEFFECT)) {
				if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("genshin_nature:icebreakeraffected")))) {
					if (sourceentity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 130, 2));
				}
			}
			if (sourceentity instanceof LivingEntity _livEnt28 && _livEnt28.hasEffect(GenshinNatureModMobEffects.CRYODELUSIONEFFECT)) {
				if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("genshin_nature:icebreakeraffected")))) {
					if (sourceentity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 130, 2));
				}
			}
			if (sourceentity instanceof LivingEntity _livEnt31 && _livEnt31.hasEffect(GenshinNatureModMobEffects.GEOVISIONEFFECT)) {
				if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("genshin_nature:rocksmasheraffected")))) {
					if (sourceentity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 130, 2));
				}
			}
			if (sourceentity instanceof LivingEntity _livEnt34 && _livEnt34.hasEffect(GenshinNatureModMobEffects.GEODELUSIONEFFECT)) {
				if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("genshin_nature:rocksmasheraffected")))) {
					if (sourceentity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 130, 2));
				}
			}
			if (sourceentity instanceof LivingEntity _livEnt37 && _livEnt37.hasEffect(GenshinNatureModMobEffects.DENDROVISIONEFFECT)) {
				if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("genshin_nature:enemyofnatureaffected")))) {
					if (sourceentity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 130, 2));
				}
			}
			if (sourceentity instanceof LivingEntity _livEnt40 && _livEnt40.hasEffect(GenshinNatureModMobEffects.DENDRODELUSIONEFFECT)) {
				if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("genshin_nature:enemyofnatureaffected")))) {
					if (sourceentity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 130, 2));
				}
			}
		}
	}
}

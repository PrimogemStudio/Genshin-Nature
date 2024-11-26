package net.mcreator.genshinnature.procedures;

import net.neoforged.neoforge.event.entity.living.LivingIncomingDamageEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.tags.ItemTags;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.genshinnature.init.GenshinNatureModMobEffects;

import javax.annotation.Nullable;

@EventBusSubscriber
public class CatalystsfunctionProcedure {
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
		if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).is(ItemTags.create(ResourceLocation.parse("genshin_nature:iscatalyst")))) {
			if (sourceentity instanceof LivingEntity _livEnt2 && _livEnt2.hasEffect(GenshinNatureModMobEffects.PYROVISIONEFFECT)) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(GenshinNatureModMobEffects.PYROVISIONEFFECT, 140, 0));
			}
			if (sourceentity instanceof LivingEntity _livEnt4 && _livEnt4.hasEffect(GenshinNatureModMobEffects.HYDROVISIONEFFECT)) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(GenshinNatureModMobEffects.HYDROVISIONEFFECT, 140, 0));
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(GenshinNatureModMobEffects.WET, 140, 0));
			}
			if (sourceentity instanceof LivingEntity _livEnt7 && _livEnt7.hasEffect(GenshinNatureModMobEffects.ANEMOVISIONEFFECT)) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(GenshinNatureModMobEffects.ANEMOVISIONEFFECT, 140, 0));
			}
			if (sourceentity instanceof LivingEntity _livEnt9 && _livEnt9.hasEffect(GenshinNatureModMobEffects.ELECTROVISIONEFFECT)) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(GenshinNatureModMobEffects.ELECTROVISIONEFFECT, 140, 0));
			}
			if (sourceentity instanceof LivingEntity _livEnt11 && _livEnt11.hasEffect(GenshinNatureModMobEffects.CRYOVISIONEFFECT)) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(GenshinNatureModMobEffects.CRYOVISIONEFFECT, 140, 0));
			}
			if (sourceentity instanceof LivingEntity _livEnt13 && _livEnt13.hasEffect(GenshinNatureModMobEffects.GEOVISIONEFFECT)) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(GenshinNatureModMobEffects.GEOVISIONEFFECT, 140, 0));
			}
			if (sourceentity instanceof LivingEntity _livEnt15 && _livEnt15.hasEffect(GenshinNatureModMobEffects.DENDROVISIONEFFECT)) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(GenshinNatureModMobEffects.DENDROVISIONEFFECT, 140, 0));
			}
			if (sourceentity instanceof LivingEntity _livEnt17 && _livEnt17.hasEffect(GenshinNatureModMobEffects.PYRODELUSIONEFFECT)) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(GenshinNatureModMobEffects.PYROVISIONEFFECT, 140, 0));
			}
			if (sourceentity instanceof LivingEntity _livEnt19 && _livEnt19.hasEffect(GenshinNatureModMobEffects.ANEMODELUSIONEFFECT)) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(GenshinNatureModMobEffects.ANEMOVISIONEFFECT, 140, 0));
			}
			if (sourceentity instanceof LivingEntity _livEnt21 && _livEnt21.hasEffect(GenshinNatureModMobEffects.CRYODELUSIONEFFECT)) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(GenshinNatureModMobEffects.CRYOVISIONEFFECT, 140, 0));
			}
			if (sourceentity instanceof LivingEntity _livEnt23 && _livEnt23.hasEffect(GenshinNatureModMobEffects.ELECTRODELUSIONEFFECT)) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(GenshinNatureModMobEffects.ELECTROVISIONEFFECT, 140, 0));
			}
			if (sourceentity instanceof LivingEntity _livEnt25 && _livEnt25.hasEffect(GenshinNatureModMobEffects.GEODELUSIONEFFECT)) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(GenshinNatureModMobEffects.GEOVISIONEFFECT, 140, 0));
			}
			if (sourceentity instanceof LivingEntity _livEnt27 && _livEnt27.hasEffect(GenshinNatureModMobEffects.HYDRODELUSIONEFFECT)) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(GenshinNatureModMobEffects.WET, 140, 0));
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(GenshinNatureModMobEffects.HYDROVISIONEFFECT, 140, 0));
			}
			if (sourceentity instanceof LivingEntity _livEnt30 && _livEnt30.hasEffect(GenshinNatureModMobEffects.DENDRODELUSIONEFFECT)) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(GenshinNatureModMobEffects.DENDROVISIONEFFECT, 140, 0));
			}
		}
	}
}

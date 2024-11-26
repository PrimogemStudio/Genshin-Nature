package net.mcreator.genshinnature.procedures;

import net.neoforged.neoforge.event.entity.living.LivingIncomingDamageEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;

import net.mcreator.genshinnature.init.GenshinNatureModMobEffects;

import javax.annotation.Nullable;

@EventBusSubscriber
public class HydrovisionturnfireoffProcedure {
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
		if (sourceentity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(GenshinNatureModMobEffects.HYDROVISIONEFFECT)) {
			if (entity.isOnFire()) {
				entity.clearFire();
			}
		}
		if (sourceentity instanceof LivingEntity _livEnt3 && _livEnt3.hasEffect(GenshinNatureModMobEffects.HYDRODELUSIONEFFECT)) {
			if (entity.isOnFire()) {
				entity.clearFire();
				sourceentity.hurt(new DamageSource(world.holderOrThrow(DamageTypes.GENERIC)), 1);
			}
		}
	}
}

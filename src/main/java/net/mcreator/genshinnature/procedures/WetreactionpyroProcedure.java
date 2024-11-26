package net.mcreator.genshinnature.procedures;

import net.neoforged.neoforge.event.entity.living.LivingIncomingDamageEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.genshinnature.init.GenshinNatureModMobEffects;

import javax.annotation.Nullable;

@EventBusSubscriber
public class WetreactionpyroProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingIncomingDamageEvent event) {
		if (event.getEntity() != null) {
			execute(event, event.getEntity());
		}
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (entity.isOnFire()) {
			if (entity instanceof LivingEntity _livEnt1 && _livEnt1.hasEffect(GenshinNatureModMobEffects.WET)) {
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(GenshinNatureModMobEffects.WET);
				entity.clearFire();
			}
		}
	}
}

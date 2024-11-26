package net.mcreator.genshinnature.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.genshinnature.init.GenshinNatureModMobEffects;

public class CandleoflifeOnBlockRightClickedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(GenshinNatureModMobEffects.WITHERINGPROTECTION, 800, 0));
	}
}
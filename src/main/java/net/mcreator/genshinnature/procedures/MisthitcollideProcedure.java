package net.mcreator.genshinnature.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;

public class MisthitcollideProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		entity.hurt(new DamageSource(world.holderOrThrow(DamageTypes.GENERIC)), 1);
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 40, 0));
	}
}

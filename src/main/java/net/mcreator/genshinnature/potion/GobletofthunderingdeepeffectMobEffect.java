
package net.mcreator.genshinnature.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.genshinnature.procedures.GobletofthunderingdeepprocedProcedure;

public class GobletofthunderingdeepeffectMobEffect extends MobEffect {
	public GobletofthunderingdeepeffectMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -10865633);
	}

	@Override
	public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
		return true;
	}

	@Override
	public boolean applyEffectTick(LivingEntity entity, int amplifier) {
		GobletofthunderingdeepprocedProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity);
		return super.applyEffectTick(entity, amplifier);
	}
}

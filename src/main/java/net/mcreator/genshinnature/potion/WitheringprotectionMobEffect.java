
package net.mcreator.genshinnature.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.genshinnature.procedures.WitheringprotectionprocedProcedure;

public class WitheringprotectionMobEffect extends MobEffect {
	public WitheringprotectionMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -6652819);
	}

	@Override
	public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
		return true;
	}

	@Override
	public boolean applyEffectTick(LivingEntity entity, int amplifier) {
		WitheringprotectionprocedProcedure.execute(entity);
		return super.applyEffectTick(entity, amplifier);
	}
}

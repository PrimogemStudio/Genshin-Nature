
package net.mcreator.genshinnature.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.genshinnature.procedures.SummerbloomshieldProcedure;

public class SummernightsbloomeffectMobEffect extends MobEffect {
	public SummernightsbloomeffectMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -14537402);
	}

	@Override
	public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
		return true;
	}

	@Override
	public boolean applyEffectTick(LivingEntity entity, int amplifier) {
		SummerbloomshieldProcedure.execute(entity);
		return super.applyEffectTick(entity, amplifier);
	}
}

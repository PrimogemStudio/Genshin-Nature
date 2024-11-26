
package net.mcreator.genshinnature.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.genshinnature.procedures.SummernightsmomentshieldProcedure;

public class SummernightsmomenteffectMobEffect extends MobEffect {
	public SummernightsmomenteffectMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -10875118);
	}

	@Override
	public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
		return true;
	}

	@Override
	public boolean applyEffectTick(LivingEntity entity, int amplifier) {
		SummernightsmomentshieldProcedure.execute(entity);
		return super.applyEffectTick(entity, amplifier);
	}
}
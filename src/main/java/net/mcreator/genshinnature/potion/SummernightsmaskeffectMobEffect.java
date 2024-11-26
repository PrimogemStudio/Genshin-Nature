
package net.mcreator.genshinnature.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.genshinnature.procedures.SummernightsmaskshieldProcedure;

public class SummernightsmaskeffectMobEffect extends MobEffect {
	public SummernightsmaskeffectMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -14537402);
	}

	@Override
	public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
		return true;
	}

	@Override
	public boolean applyEffectTick(LivingEntity entity, int amplifier) {
		SummernightsmaskshieldProcedure.execute(entity);
		return super.applyEffectTick(entity, amplifier);
	}
}


package net.mcreator.genshinnature.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.genshinnature.procedures.WanderersstringkettleeffectOnEffectActiveTickProcedure;

public class WanderersstringkettleeffectMobEffect extends MobEffect {
	public WanderersstringkettleeffectMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -8563675);
	}

	@Override
	public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
		return true;
	}

	@Override
	public boolean applyEffectTick(LivingEntity entity, int amplifier) {
		WanderersstringkettleeffectOnEffectActiveTickProcedure.execute(entity);
		return super.applyEffectTick(entity, amplifier);
	}
}

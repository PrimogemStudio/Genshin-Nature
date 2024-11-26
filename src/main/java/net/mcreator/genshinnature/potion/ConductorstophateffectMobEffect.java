
package net.mcreator.genshinnature.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.genshinnature.procedures.ConductortophatprocedProcedure;

public class ConductorstophateffectMobEffect extends MobEffect {
	public ConductorstophateffectMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -8563675);
	}

	@Override
	public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
		return true;
	}

	@Override
	public boolean applyEffectTick(LivingEntity entity, int amplifier) {
		ConductortophatprocedProcedure.execute(entity);
		return super.applyEffectTick(entity, amplifier);
	}
}

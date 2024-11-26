
package net.mcreator.genshinnature.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.genshinnature.procedures.AnemovisionactivetickProcedure;

public class AnemovisioneffectMobEffect extends MobEffect {
	public AnemovisioneffectMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -6620165);
	}

	@Override
	public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
		return true;
	}

	@Override
	public boolean applyEffectTick(LivingEntity entity, int amplifier) {
		AnemovisionactivetickProcedure.execute(entity);
		return super.applyEffectTick(entity, amplifier);
	}
}


package net.mcreator.genshinnature.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.genshinnature.procedures.GeodelusionactivetickProcedure;

public class GeodelusioneffectMobEffect extends MobEffect {
	public GeodelusioneffectMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -10858198);
	}

	@Override
	public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
		return true;
	}

	@Override
	public boolean applyEffectTick(LivingEntity entity, int amplifier) {
		GeodelusionactivetickProcedure.execute(entity);
		return super.applyEffectTick(entity, amplifier);
	}
}

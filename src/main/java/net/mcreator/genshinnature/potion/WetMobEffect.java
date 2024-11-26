
package net.mcreator.genshinnature.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.genshinnature.procedures.WetreactionelectroProcedure;

public class WetMobEffect extends MobEffect {
	public WetMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -8143125);
	}

	@Override
	public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
		return true;
	}

	@Override
	public boolean applyEffectTick(LivingEntity entity, int amplifier) {
		WetreactionelectroProcedure.execute(entity.level(), entity);
		return super.applyEffectTick(entity, amplifier);
	}
}

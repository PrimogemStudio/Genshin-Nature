
package net.mcreator.genshinnature.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.genshinnature.procedures.GustofnostalgiaprocedProcedure;

public class GustofnostalgiaeffectMobEffect extends MobEffect {
	public GustofnostalgiaeffectMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -10865633);
	}

	@Override
	public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
		return true;
	}

	@Override
	public boolean applyEffectTick(LivingEntity entity, int amplifier) {
		GustofnostalgiaprocedProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity);
		return super.applyEffectTick(entity, amplifier);
	}
}

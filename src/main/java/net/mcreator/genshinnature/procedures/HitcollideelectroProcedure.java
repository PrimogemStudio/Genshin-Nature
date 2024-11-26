package net.mcreator.genshinnature.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.tags.TagKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

import net.mcreator.genshinnature.init.GenshinNatureModMobEffects;

public class HitcollideelectroProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("genshin_nature:electricabsorbaffected"))) == false) {
			if ((entity instanceof LivingEntity _livEnt1 && _livEnt1.hasEffect(GenshinNatureModMobEffects.ELECTROVISIONEFFECT)) == false) {
				if ((entity instanceof LivingEntity _livEnt2 && _livEnt2.hasEffect(GenshinNatureModMobEffects.ELECTRODELUSIONEFFECT)) == false) {
					entity.hurt(new DamageSource(world.holderOrThrow(DamageTypes.GENERIC)), 1);
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(GenshinNatureModMobEffects.ELECTRIFIED, 40, 0));
				}
			}
		}
	}
}

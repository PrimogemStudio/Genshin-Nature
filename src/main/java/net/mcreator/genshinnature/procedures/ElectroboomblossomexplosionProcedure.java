package net.mcreator.genshinnature.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.core.BlockPos;

import net.mcreator.genshinnature.init.GenshinNatureModMobEffects;

public class ElectroboomblossomexplosionProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (world instanceof Level _level && !_level.isClientSide())
			_level.explode(null, x, y, z, 1, Level.ExplosionInteraction.NONE);
		world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
		if ((entity instanceof LivingEntity _livEnt2 && _livEnt2.hasEffect(GenshinNatureModMobEffects.ELECTROVISIONEFFECT)) == false) {
			if ((entity instanceof LivingEntity _livEnt3 && _livEnt3.hasEffect(GenshinNatureModMobEffects.ELECTRODELUSIONEFFECT)) == false) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(GenshinNatureModMobEffects.ELECTRIFIED, 100, 0));
			}
		}
	}
}

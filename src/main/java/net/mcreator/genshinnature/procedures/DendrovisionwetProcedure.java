package net.mcreator.genshinnature.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.genshinnature.init.GenshinNatureModMobEffects;
import net.mcreator.genshinnature.init.GenshinNatureModBlocks;

public class DendrovisionwetProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(GenshinNatureModMobEffects.WET)) {
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.AIR) {
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(GenshinNatureModMobEffects.WET);
				world.setBlock(BlockPos.containing(x, y, z), GenshinNatureModBlocks.DENDROCORE.get().defaultBlockState(), 3);
			}
		}
	}
}

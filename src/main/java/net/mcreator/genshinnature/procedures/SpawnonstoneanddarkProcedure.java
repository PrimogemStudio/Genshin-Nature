package net.mcreator.genshinnature.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class SpawnonstoneanddarkProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x + 0.5, y - 1, z + 0.5))).getBlock() == Blocks.STONE) {
			if (world.getMaxLocalRawBrightness(BlockPos.containing(x, y, z)) < 7) {
				return true;
			}
		}
		return false;
	}
}

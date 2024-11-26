package net.mcreator.genshinnature.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class PlaceleavesmagicProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (Math.random() >= 0.3) {
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.AIR) {
				world.setBlock(BlockPos.containing(x, y, z), Blocks.ACACIA_LEAVES.defaultBlockState(), 3);
			}
			if ((world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == Blocks.AIR) {
				world.setBlock(BlockPos.containing(x + 1, y, z), Blocks.ACACIA_LEAVES.defaultBlockState(), 3);
			}
			if ((world.getBlockState(BlockPos.containing(x + 2, y, z))).getBlock() == Blocks.AIR) {
				world.setBlock(BlockPos.containing(x + 2, y, z), Blocks.ACACIA_LEAVES.defaultBlockState(), 3);
			}
		}
	}
}

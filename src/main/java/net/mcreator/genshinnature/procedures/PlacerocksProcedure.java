package net.mcreator.genshinnature.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.genshinnature.init.GenshinNatureModBlocks;

public class PlacerocksProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (Math.random() >= 0.2) {
			if ((world.getBlockState(BlockPos.containing(x, y, z + 2))).getBlock() == Blocks.AIR) {
				world.setBlock(BlockPos.containing(x, y, z + 2), GenshinNatureModBlocks.PILLARSTONE.get().defaultBlockState(), 3);
			}
			if ((world.getBlockState(BlockPos.containing(x, y + 1, z + 2))).getBlock() == Blocks.AIR) {
				world.setBlock(BlockPos.containing(x, y + 1, z + 2), GenshinNatureModBlocks.PILLARSTONE.get().defaultBlockState(), 3);
			}
			if ((world.getBlockState(BlockPos.containing(x, y + 2, z + 2))).getBlock() == Blocks.AIR) {
				world.setBlock(BlockPos.containing(x, y + 2, z + 2), GenshinNatureModBlocks.PILLARSTONE.get().defaultBlockState(), 3);
			}
		}
	}
}

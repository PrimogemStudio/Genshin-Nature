package net.mcreator.genshinnature.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.genshinnature.init.GenshinNatureModBlocks;

public class Witheringexpand4Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
		world.setBlock(BlockPos.containing(x, y, z), GenshinNatureModBlocks.WITHERINGSTOPPED.get().defaultBlockState(), 3);
		if (world.getBlockState(BlockPos.containing(x + 1, y, z)).canOcclude()) {
			world.setBlock(BlockPos.containing(x + 1, y, z), GenshinNatureModBlocks.WITHERINGSTOPPED.get().defaultBlockState(), 3);
		}
		if (world.getBlockState(BlockPos.containing(x - 1, y, z)).canOcclude()) {
			world.setBlock(BlockPos.containing(x - 1, y, z), GenshinNatureModBlocks.WITHERINGSTOPPED.get().defaultBlockState(), 3);
		}
		if (world.getBlockState(BlockPos.containing(x, y, z + 1)).canOcclude()) {
			world.setBlock(BlockPos.containing(x, y, z + 1), GenshinNatureModBlocks.WITHERINGSTOPPED.get().defaultBlockState(), 3);
		}
		if (world.getBlockState(BlockPos.containing(x, y, z - 1)).canOcclude()) {
			world.setBlock(BlockPos.containing(x, y, z - 1), GenshinNatureModBlocks.WITHERINGSTOPPED.get().defaultBlockState(), 3);
		}
		if (world.getBlockState(BlockPos.containing(x, y + 1, z)).canOcclude()) {
			world.setBlock(BlockPos.containing(x, y + 1, z), GenshinNatureModBlocks.WITHERINGSTOPPED.get().defaultBlockState(), 3);
		}
		if (world.getBlockState(BlockPos.containing(x, y - 1, z)).canOcclude()) {
			world.setBlock(BlockPos.containing(x, y - 1, z), GenshinNatureModBlocks.WITHERINGSTOPPED.get().defaultBlockState(), 3);
		}
	}
}

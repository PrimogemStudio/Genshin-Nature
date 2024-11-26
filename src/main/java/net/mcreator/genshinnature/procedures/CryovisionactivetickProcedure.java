package net.mcreator.genshinnature.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.genshinnature.init.GenshinNatureModBlocks;

public class CryovisionactivetickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.WATER) {
			world.setBlock(BlockPos.containing(x, y - 1, z), GenshinNatureModBlocks.TIMEDICE.get().defaultBlockState(), 3);
		}
		if ((world.getBlockState(BlockPos.containing(x - 1, y - 1, z))).getBlock() == Blocks.WATER) {
			world.setBlock(BlockPos.containing(x - 1, y - 1, z), GenshinNatureModBlocks.TIMEDICE.get().defaultBlockState(), 3);
		}
		if ((world.getBlockState(BlockPos.containing(x + 1, y - 1, z))).getBlock() == Blocks.WATER) {
			world.setBlock(BlockPos.containing(x + 1, y - 1, z), GenshinNatureModBlocks.TIMEDICE.get().defaultBlockState(), 3);
		}
		if ((world.getBlockState(BlockPos.containing(x, y - 1, z + 1))).getBlock() == Blocks.WATER) {
			world.setBlock(BlockPos.containing(x, y - 1, z + 1), GenshinNatureModBlocks.TIMEDICE.get().defaultBlockState(), 3);
		}
		if ((world.getBlockState(BlockPos.containing(x, y - 1, z - 1))).getBlock() == Blocks.WATER) {
			world.setBlock(BlockPos.containing(x, y - 1, z - 1), GenshinNatureModBlocks.TIMEDICE.get().defaultBlockState(), 3);
		}
	}
}

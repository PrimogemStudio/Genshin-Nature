package net.mcreator.genshinnature.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class HydroabyssmagerocksProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.LAVA) {
			world.setBlock(BlockPos.containing(x, y - 1, z), Blocks.OBSIDIAN.defaultBlockState(), 3);
		}
		if ((world.getBlockState(BlockPos.containing(x - 1, y - 1, z))).getBlock() == Blocks.LAVA) {
			world.setBlock(BlockPos.containing(x - 1, y - 1, z), Blocks.OBSIDIAN.defaultBlockState(), 3);
		}
		if ((world.getBlockState(BlockPos.containing(x + 1, y - 1, z))).getBlock() == Blocks.LAVA) {
			world.setBlock(BlockPos.containing(x + 1, y - 1, z), Blocks.OBSIDIAN.defaultBlockState(), 3);
		}
		if ((world.getBlockState(BlockPos.containing(x, y - 1, z + 1))).getBlock() == Blocks.LAVA) {
			world.setBlock(BlockPos.containing(x, y - 1, z + 1), Blocks.OBSIDIAN.defaultBlockState(), 3);
		}
		if ((world.getBlockState(BlockPos.containing(x, y - 1, z - 1))).getBlock() == Blocks.LAVA) {
			world.setBlock(BlockPos.containing(x, y - 1, z - 1), Blocks.OBSIDIAN.defaultBlockState(), 3);
		}
	}
}

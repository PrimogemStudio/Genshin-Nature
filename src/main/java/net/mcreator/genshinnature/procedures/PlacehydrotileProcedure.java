package net.mcreator.genshinnature.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.genshinnature.init.GenshinNatureModBlocks;

public class PlacehydrotileProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (Math.random() <= 0.5) {
			if (world.getBlockState(BlockPos.containing(x, y - 1, z)).canOcclude() == true) {
				if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.AIR) {
					world.setBlock(BlockPos.containing(x, y, z), GenshinNatureModBlocks.HYDROTILE.get().defaultBlockState(), 3);
				}
			}
		}
	}
}

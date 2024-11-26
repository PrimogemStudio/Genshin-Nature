package net.mcreator.genshinnature.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.genshinnature.init.GenshinNatureModBlocks;

public class Witheringexpand3Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
		world.setBlock(BlockPos.containing(x, y, z), GenshinNatureModBlocks.WITHERINGSTOPPED.get().defaultBlockState(), 3);
		if (world.getBlockState(BlockPos.containing(x + 1, y, z)).canOcclude()) {
			if (((world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == GenshinNatureModBlocks.WITHERINGSTOPPED.get()) == false) {
				world.setBlock(BlockPos.containing(x + 1, y, z), GenshinNatureModBlocks.WITHERINGEXPANDING_4.get().defaultBlockState(), 3);
			}
		}
		if (world.getBlockState(BlockPos.containing(x - 1, y, z)).canOcclude()) {
			if (((world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == GenshinNatureModBlocks.WITHERINGSTOPPED.get()) == false) {
				world.setBlock(BlockPos.containing(x - 1, y, z), GenshinNatureModBlocks.WITHERINGEXPANDING_4.get().defaultBlockState(), 3);
			}
		}
		if (world.getBlockState(BlockPos.containing(x, y, z + 1)).canOcclude()) {
			if (((world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == GenshinNatureModBlocks.WITHERINGSTOPPED.get()) == false) {
				world.setBlock(BlockPos.containing(x, y, z + 1), GenshinNatureModBlocks.WITHERINGEXPANDING_4.get().defaultBlockState(), 3);
			}
		}
		if (world.getBlockState(BlockPos.containing(x, y, z - 1)).canOcclude()) {
			if (((world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == GenshinNatureModBlocks.WITHERINGSTOPPED.get()) == false) {
				world.setBlock(BlockPos.containing(x, y, z - 1), GenshinNatureModBlocks.WITHERINGEXPANDING_4.get().defaultBlockState(), 3);
			}
		}
		if (world.getBlockState(BlockPos.containing(x, y + 1, z)).canOcclude()) {
			if (((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == GenshinNatureModBlocks.WITHERINGSTOPPED.get()) == false) {
				world.setBlock(BlockPos.containing(x, y + 1, z), GenshinNatureModBlocks.WITHERINGEXPANDING_4.get().defaultBlockState(), 3);
			}
		}
		if (world.getBlockState(BlockPos.containing(x, y - 1, z)).canOcclude()) {
			if (((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == GenshinNatureModBlocks.WITHERINGSTOPPED.get()) == false) {
				world.setBlock(BlockPos.containing(x, y - 1, z), GenshinNatureModBlocks.WITHERINGEXPANDING_4.get().defaultBlockState(), 3);
			}
		}
	}
}

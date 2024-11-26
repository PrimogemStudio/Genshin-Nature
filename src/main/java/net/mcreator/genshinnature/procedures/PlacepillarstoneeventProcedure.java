package net.mcreator.genshinnature.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.genshinnature.init.GenshinNatureModBlocks;

public class PlacepillarstoneeventProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, ItemStack itemstack) {
		if (world instanceof ServerLevel _level) {
			itemstack.hurtAndBreak(1, _level, null, _stkprov -> {
			});
		}
		if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.AIR) {
			world.setBlock(BlockPos.containing(x, y + 1, z), GenshinNatureModBlocks.PILLARSTONE.get().defaultBlockState(), 3);
		}
		if ((world.getBlockState(BlockPos.containing(x, y + 2, z))).getBlock() == Blocks.AIR) {
			world.setBlock(BlockPos.containing(x, y + 2, z), GenshinNatureModBlocks.PILLARSTONE.get().defaultBlockState(), 3);
		}
		if ((world.getBlockState(BlockPos.containing(x, y + 3, z))).getBlock() == Blocks.AIR) {
			world.setBlock(BlockPos.containing(x, y + 3, z), GenshinNatureModBlocks.PILLARSTONE.get().defaultBlockState(), 3);
		}
	}
}

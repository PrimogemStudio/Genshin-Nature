package net.mcreator.genshinnature.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

public class HoarfrostcoreRightClickedInAirProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, ItemStack itemstack) {
		world.destroyBlock(BlockPos.containing(x, y - 1, z), false);
		world.setBlock(BlockPos.containing(x, y - 1, z), Blocks.BLUE_ICE.defaultBlockState(), 3);
		if (world instanceof ServerLevel _level) {
			itemstack.hurtAndBreak(1, _level, null, _stkprov -> {
			});
		}
	}
}

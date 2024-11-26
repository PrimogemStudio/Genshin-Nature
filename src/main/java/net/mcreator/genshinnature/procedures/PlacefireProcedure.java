package net.mcreator.genshinnature.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.GameRules;
import net.minecraft.core.BlockPos;

public class PlacefireProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world.getLevelData().getGameRules().getBoolean(GameRules.RULE_MOBGRIEFING) == true) {
			if (world.getBlockState(BlockPos.containing(x, y - 1, z)).canOcclude() == true) {
				if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.AIR) {
					world.setBlock(BlockPos.containing(x, y, z), Blocks.FIRE.defaultBlockState(), 3);
				}
			}
		}
	}
}

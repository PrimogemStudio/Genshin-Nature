package net.mcreator.genshinnature.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.genshinnature.init.GenshinNatureModBlocks;

public class Pyrochallengeblock2updateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.destroyBlock(BlockPos.containing(x, y, z), false);
		world.setBlock(BlockPos.containing(x, y, z), GenshinNatureModBlocks.CHALLENGEBLOCKPYRO_2.get().defaultBlockState(), 3);
	}
}

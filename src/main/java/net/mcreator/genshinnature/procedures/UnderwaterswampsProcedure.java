package net.mcreator.genshinnature.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class UnderwaterswampsProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("swamp")) == true) {
			if (Math.random() < 0.9) {
				return false;
			}
		}
		if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("plains")) == true) {
			if (Math.random() < 0.9) {
				return false;
			}
		}
		return true;
	}
}

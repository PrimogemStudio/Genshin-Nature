package net.mcreator.genshinnature.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;

import net.mcreator.genshinnature.GenshinNatureMod;

public class BoompyrohypostasisProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		GenshinNatureMod.queueServerWork(90, () -> {
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, x, y, z, 2, Level.ExplosionInteraction.NONE);
		});
	}
}

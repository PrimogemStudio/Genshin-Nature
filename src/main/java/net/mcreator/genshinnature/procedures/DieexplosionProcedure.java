package net.mcreator.genshinnature.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;

import net.mcreator.genshinnature.GenshinNatureMod;

public class DieexplosionProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		GenshinNatureMod.queueServerWork(60, () -> {
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, x, y, z, 1, Level.ExplosionInteraction.NONE);
		});
	}
}

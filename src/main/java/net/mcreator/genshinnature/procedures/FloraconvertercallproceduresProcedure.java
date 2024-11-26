package net.mcreator.genshinnature.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

public class FloraconvertercallproceduresProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		FloraconverterfunctionProcedure.execute(world, x, y, z, entity);
		Floraconverterfunction2Procedure.execute(world, x, y, z, entity);
	}
}

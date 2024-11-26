package net.mcreator.genshinnature.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

public class CallbothartifactsProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		TestartifactProcedure.execute(world, entity);
		Testartifact2Procedure.execute(world, entity);
		Testartifact3Procedure.execute(world, entity);
		Testartifact4Procedure.execute(world, entity);
		Testartifact5Procedure.execute(world, entity);
		Testartifacts6Procedure.execute(entity);
		Testartifact7Procedure.execute(entity);
		Testartifact8Procedure.execute(entity);
		Testartifact9Procedure.execute(entity);
		Testartifact10Procedure.execute(entity);
	}
}

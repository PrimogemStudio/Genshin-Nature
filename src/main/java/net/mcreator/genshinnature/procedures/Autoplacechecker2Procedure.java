package net.mcreator.genshinnature.procedures;

import net.minecraft.world.entity.Entity;

public class Autoplacechecker2Procedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		AutoplaceserpentspineProcedure.execute(entity);
		AutoplaceblackcliffpoleProcedure.execute(entity);
		AutoplacestaffofhomaProcedure.execute(entity);
		AutoplacefesteringdesireProcedure.execute(entity);
		AutoplaceprototyperancourProcedure.execute(entity);
	}
}

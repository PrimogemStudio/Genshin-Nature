package net.mcreator.genshinnature.procedures;

import net.minecraft.world.entity.Entity;

public class Ascensionchecker2Procedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		AscendserpentspineProcedure.execute(entity);
		AscendblackcliffpoleProcedure.execute(entity);
		AscendstaffofhomaProcedure.execute(entity);
		AscendfesteringdesireProcedure.execute(entity);
		AscendprototyperancourProcedure.execute(entity);
	}
}

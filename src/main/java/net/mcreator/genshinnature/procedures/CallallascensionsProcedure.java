package net.mcreator.genshinnature.procedures;

import net.minecraft.world.entity.Entity;

public class CallallascensionsProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		AscensioncheckerProcedure.execute(entity);
		Ascensionchecker2Procedure.execute(entity);
	}
}

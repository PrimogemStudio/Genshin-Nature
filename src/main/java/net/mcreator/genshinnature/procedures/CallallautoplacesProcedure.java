package net.mcreator.genshinnature.procedures;

import net.minecraft.world.entity.Entity;

public class CallallautoplacesProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		AutoplacecheckerProcedure.execute(entity);
		Autoplacechecker2Procedure.execute(entity);
	}
}

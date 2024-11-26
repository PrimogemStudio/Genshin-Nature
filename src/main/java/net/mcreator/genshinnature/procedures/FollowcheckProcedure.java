package net.mcreator.genshinnature.procedures;

import net.minecraft.world.entity.Entity;

public class FollowcheckProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (entity.getPersistentData().getBoolean("Follow") == true) {
			return true;
		}
		return false;
	}
}

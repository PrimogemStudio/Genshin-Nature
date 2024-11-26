package net.mcreator.genshinnature.procedures;

import net.minecraft.world.entity.Entity;

public class BurncollideProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.igniteForSeconds(9);
	}
}

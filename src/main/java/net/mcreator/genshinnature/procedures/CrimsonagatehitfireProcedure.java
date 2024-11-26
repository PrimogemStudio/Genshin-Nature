package net.mcreator.genshinnature.procedures;

import net.minecraft.world.entity.Entity;

public class CrimsonagatehitfireProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (Math.random() < 0.3) {
			entity.igniteForSeconds(10);
		}
	}
}

package net.mcreator.genshinnature.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.genshinnature.GenshinNatureMod;

public class Despawnin300ticksProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		GenshinNatureMod.queueServerWork(300, () -> {
			if (!entity.level().isClientSide())
				entity.discard();
		});
	}
}

package net.mcreator.genshinnature.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.genshinnature.init.GenshinNatureModEntities;

public class SpawnglacialminesProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (Math.random() < 0.2) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = GenshinNatureModEntities.GLACIALMINE.get().spawn(_level, BlockPos.containing(x + 3, y + 1, z), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
				}
			}
		}
		if (Math.random() < 0.2) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = GenshinNatureModEntities.GLACIALMINE.get().spawn(_level, BlockPos.containing(x - 3, y + 1, z), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
				}
			}
		}
		if (Math.random() < 0.2) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = GenshinNatureModEntities.GLACIALMINE.get().spawn(_level, BlockPos.containing(x, y + 1, z - 3), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
				}
			}
		}
		if (Math.random() < 0.2) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = GenshinNatureModEntities.GLACIALMINE.get().spawn(_level, BlockPos.containing(x, y + 1, z + 3), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
				}
			}
		}
	}
}
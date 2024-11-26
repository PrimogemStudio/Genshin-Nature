package net.mcreator.genshinnature.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.genshinnature.init.GenshinNatureModEntities;
import net.mcreator.genshinnature.GenshinNatureMod;

public class ShaggybeastspawningProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		GenshinNatureMod.queueServerWork(20, () -> {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = GenshinNatureModEntities.SHAGGYSUMPTERBEASTADULT.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
				}
			}
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = GenshinNatureModEntities.SHAGGYSUMPTERBEASTADULT.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
				}
			}
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = GenshinNatureModEntities.SHAGGYSUMPTERBEASTBABY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
				}
			}
			if (Math.random() < 0.4) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = GenshinNatureModEntities.SHAGGYSUMPTERBEASTBABY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
			}
			if (!entity.level().isClientSide())
				entity.discard();
		});
	}
}
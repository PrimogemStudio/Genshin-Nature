package net.mcreator.genshinnature.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.genshinnature.GenshinNatureMod;

public class CryojawsattackProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (Math.random() < 0.4) {
			GenshinNatureMod.queueServerWork(24, () -> {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = EntityType.EVOKER_FANGS.spawn(_level, BlockPos.containing(x + 1, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = EntityType.EVOKER_FANGS.spawn(_level, BlockPos.containing(x - 4, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = EntityType.EVOKER_FANGS.spawn(_level, BlockPos.containing(x, y, z - 4), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = EntityType.EVOKER_FANGS.spawn(_level, BlockPos.containing(x, y, z + 1), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
			});
			GenshinNatureMod.queueServerWork(50, () -> {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = EntityType.EVOKER_FANGS.spawn(_level, BlockPos.containing(x + 4, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = EntityType.EVOKER_FANGS.spawn(_level, BlockPos.containing(x - 3, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = EntityType.EVOKER_FANGS.spawn(_level, BlockPos.containing(x, y, z - 4), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = EntityType.EVOKER_FANGS.spawn(_level, BlockPos.containing(x, y, z + 3), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
			});
			GenshinNatureMod.queueServerWork(60, () -> {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = EntityType.EVOKER_FANGS.spawn(_level, BlockPos.containing(x + 3, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = EntityType.EVOKER_FANGS.spawn(_level, BlockPos.containing(x - 8, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = EntityType.EVOKER_FANGS.spawn(_level, BlockPos.containing(x, y, z - 2), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = EntityType.EVOKER_FANGS.spawn(_level, BlockPos.containing(x, y, z + 6), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
			});
			GenshinNatureMod.queueServerWork(100, () -> {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = EntityType.EVOKER_FANGS.spawn(_level, BlockPos.containing(x + 4, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = EntityType.EVOKER_FANGS.spawn(_level, BlockPos.containing(x - 4, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = EntityType.EVOKER_FANGS.spawn(_level, BlockPos.containing(x, y, z - 4), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = EntityType.EVOKER_FANGS.spawn(_level, BlockPos.containing(x, y, z + 4), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
			});
			GenshinNatureMod.queueServerWork(131, () -> {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = EntityType.EVOKER_FANGS.spawn(_level, BlockPos.containing(x + 3, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = EntityType.EVOKER_FANGS.spawn(_level, BlockPos.containing(x - 2, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = EntityType.EVOKER_FANGS.spawn(_level, BlockPos.containing(x, y, z - 2), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = EntityType.EVOKER_FANGS.spawn(_level, BlockPos.containing(x, y, z + 3), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
			});
			GenshinNatureMod.queueServerWork(150, () -> {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = EntityType.EVOKER_FANGS.spawn(_level, BlockPos.containing(x + 5, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = EntityType.EVOKER_FANGS.spawn(_level, BlockPos.containing(x - 6, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = EntityType.EVOKER_FANGS.spawn(_level, BlockPos.containing(x, y, z - 4), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = EntityType.EVOKER_FANGS.spawn(_level, BlockPos.containing(x, y, z + 5), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
			});
		}
	}
}

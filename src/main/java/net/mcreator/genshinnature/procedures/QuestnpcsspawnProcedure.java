package net.mcreator.genshinnature.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.genshinnature.init.GenshinNatureModGameRules;
import net.mcreator.genshinnature.init.GenshinNatureModEntities;
import net.mcreator.genshinnature.GenshinNatureMod;

public class QuestnpcsspawnProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (world.getLevelData().getGameRules().getBoolean(GenshinNatureModGameRules.ALLOWQUESTS) == false) {
			if (!entity.level().isClientSide())
				entity.discard();
		}
		if (world.getLevelData().getGameRules().getBoolean(GenshinNatureModGameRules.ALLOWQUESTS) == true) {
			GenshinNatureMod.queueServerWork(2, () -> {
				if (!entity.level().isClientSide())
					entity.discard();
				if (Math.random() > 0.93) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = GenshinNatureModEntities.QUESTNPC_1.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
				}
				if (Math.random() > 0.93) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = GenshinNatureModEntities.QUESTNPC_2.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
				}
				if (Math.random() > 0.93) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = GenshinNatureModEntities.QUESTNPC_3.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
				}
				if (Math.random() > 0.93) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = GenshinNatureModEntities.QUESTNPC_4.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
				}
				if (Math.random() > 0.93) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = GenshinNatureModEntities.QUESTNPC_5.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
				}
				if (Math.random() > 0.93) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = GenshinNatureModEntities.QUESTNPC_6.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
				}
				if (Math.random() > 0.93) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = GenshinNatureModEntities.QUESTNPC_7.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
				}
				if (Math.random() > 0.93) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = GenshinNatureModEntities.QUESTNPC_8.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
				}
				if (Math.random() > 0.93) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = GenshinNatureModEntities.QUESTNPC_9.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
				}
				if (Math.random() > 0.93) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = GenshinNatureModEntities.QUESTNPC_10.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
				}
				if (Math.random() > 0.93) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = GenshinNatureModEntities.QUESTNPC_11.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
				}
				if (Math.random() > 0.93) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = GenshinNatureModEntities.QUESTNPC_12.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
				}
				if (Math.random() > 0.93) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = GenshinNatureModEntities.QUESTNPC_13.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
				}
				if (Math.random() > 0.93) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = GenshinNatureModEntities.QUESTNPC_14.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
				}
				if (Math.random() > 0.93) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = GenshinNatureModEntities.QUESTNPC_15.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
				}
				if (Math.random() > 0.93) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = GenshinNatureModEntities.QUESTNPC_16.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
				}
				if (Math.random() > 0.93) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = GenshinNatureModEntities.QUESTNPC_17.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
				}
				if (Math.random() > 0.93) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = GenshinNatureModEntities.QUESTNPC_18.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
				}
				if (Math.random() > 0.93) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = GenshinNatureModEntities.QUESTNPC_19.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
				}
				if (Math.random() > 0.93) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = GenshinNatureModEntities.QUESTNPC_20.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
				}
			});
		}
	}
}

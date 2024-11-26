package net.mcreator.genshinnature.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.genshinnature.init.GenshinNatureModEntities;

public class GenshinspawnermobsProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
		if (Math.random() <= 0.5) {
			if (Math.random() > 0.95) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = GenshinNatureModEntities.HYDROSLIME.get().spawn(_level, BlockPos.containing(x + 0.5, y + 1, z + 0.5), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
			}
			if (Math.random() > 0.95) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = GenshinNatureModEntities.FATUIPYROAGENT.get().spawn(_level, BlockPos.containing(x + 0.5, y + 1, z + 0.5), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
			}
			if (Math.random() > 0.95) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = GenshinNatureModEntities.FLOATINGHYDROFUNGI.get().spawn(_level, BlockPos.containing(x + 0.5, y + 1, z + 0.5), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
			}
			if (Math.random() > 0.95) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = GenshinNatureModEntities.FLOATINGDENDROFUNGUS.get().spawn(_level, BlockPos.containing(x + 0.5, y + 1, z + 0.5), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
			}
			if (Math.random() > 0.95) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = GenshinNatureModEntities.WHIRLINGELECTROFUNGUS.get().spawn(_level, BlockPos.containing(x + 0.5, y + 1, z + 0.5), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
			}
			if (Math.random() > 0.95) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = GenshinNatureModEntities.STRETCHYANEMOFUNGUS.get().spawn(_level, BlockPos.containing(x + 0.5, y + 1, z + 0.5), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
			}
			if (Math.random() > 0.95) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = GenshinNatureModEntities.STRETCHYGEOFUNGUS.get().spawn(_level, BlockPos.containing(x + 0.5, y + 1, z + 0.5), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
			}
			if (Math.random() > 0.95) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = GenshinNatureModEntities.STRETCHYPYROFUNGUS.get().spawn(_level, BlockPos.containing(x + 0.5, y + 1, z + 0.5), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
			}
			if (Math.random() > 0.95) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = GenshinNatureModEntities.ANEMOSPECTER.get().spawn(_level, BlockPos.containing(x + 0.5, y + 1, z + 0.5), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
			}
			if (Math.random() > 0.95) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = GenshinNatureModEntities.HYDROSPECTER.get().spawn(_level, BlockPos.containing(x + 0.5, y + 1, z + 0.5), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
			}
			if (Math.random() > 0.95) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = GenshinNatureModEntities.GEOSPECTER.get().spawn(_level, BlockPos.containing(x + 0.5, y + 1, z + 0.5), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
			}
			if (Math.random() > 0.95) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = GenshinNatureModEntities.PYROSPECTER.get().spawn(_level, BlockPos.containing(x + 0.5, y + 1, z + 0.5), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
			}
			if (Math.random() > 0.95) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = GenshinNatureModEntities.CRYOSPECTER.get().spawn(_level, BlockPos.containing(x + 0.5, y + 1, z + 0.5), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
			}
			if (Math.random() > 0.95) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = GenshinNatureModEntities.ELECTROSPECTER.get().spawn(_level, BlockPos.containing(x + 0.5, y + 1, z + 0.5), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
			}
			if (Math.random() > 0.95) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = GenshinNatureModEntities.DENDROSPECTER.get().spawn(_level, BlockPos.containing(x + 0.5, y + 1, z + 0.5), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
			}
			if (Math.random() > 0.95) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = GenshinNatureModEntities.GEOVISHAPHATCHLING.get().spawn(_level, BlockPos.containing(x + 0.5, y + 1, z + 0.5), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
			}
			if (Math.random() > 0.95) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = GenshinNatureModEntities.CRYOWHOPPERFLOWER.get().spawn(_level, BlockPos.containing(x + 0.5, y + 1, z + 0.5), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
			}
		}
	}
}

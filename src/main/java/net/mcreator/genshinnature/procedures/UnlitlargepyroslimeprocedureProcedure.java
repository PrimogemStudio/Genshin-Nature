package net.mcreator.genshinnature.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.genshinnature.init.GenshinNatureModGameRules;
import net.mcreator.genshinnature.init.GenshinNatureModEntities;

public class UnlitlargepyroslimeprocedureProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity.isInWater()) {
			if (!entity.level().isClientSide())
				entity.discard();
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = GenshinNatureModEntities.UNLITLARGEPYROSLIME.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
				}
			}
		}
		if (world.getLevelData().isRaining()) {
			if (entity.isInLava() == true) {
				if (!entity.level().isClientSide())
					entity.discard();
			}
			if (entity.isOnFire() == true) {
				if (!entity.level().isClientSide())
					entity.discard();
			}
		}
		if (world.getLevelData().isRaining()) {
			if (entity.isInLava() == false) {
				if (!entity.level().isClientSide())
					entity.discard();
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = GenshinNatureModEntities.UNLITLARGEPYROSLIME.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
			}
		}
		if (world.getLevelData().getGameRules().getBoolean(GenshinNatureModGameRules.ALLOWLITPYROSLIMES) == false) {
			if (!entity.level().isClientSide())
				entity.discard();
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = GenshinNatureModEntities.UNLITLARGEPYROSLIME.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
				}
			}
		}
	}
}

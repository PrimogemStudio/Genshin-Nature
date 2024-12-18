package net.mcreator.genshinnature.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.genshinnature.init.GenshinNatureModEntities;

public class ElectrowhopperflowerEntityIsHurtProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (Math.random() > 0.4) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = GenshinNatureModEntities.ELECTRICBALL.get().spawn(_level, BlockPos.containing(x + 3, y + 1, z), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
				}
			}
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = GenshinNatureModEntities.ELECTRICBALL.get().spawn(_level, BlockPos.containing(x - 3, y + 1, z), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
				}
			}
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = GenshinNatureModEntities.ELECTRICBALL.get().spawn(_level, BlockPos.containing(x, y + 1, z - 3), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
				}
			}
		}
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.WITCH, x, y, z, 2, 3, 3, 3, 1);
	}
}

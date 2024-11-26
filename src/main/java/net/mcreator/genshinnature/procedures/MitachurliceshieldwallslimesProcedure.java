package net.mcreator.genshinnature.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.genshinnature.init.GenshinNatureModEntities;
import net.mcreator.genshinnature.init.GenshinNatureModBlocks;

public class MitachurliceshieldwallslimesProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == GenshinNatureModBlocks.ELECTROCRYSTAL.get()) == false) {
			if (Math.random() < 0.1) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = GenshinNatureModEntities.CRYOSLIME.get().spawn(_level, BlockPos.containing(x, y + 1, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
			}
		}
	}
}
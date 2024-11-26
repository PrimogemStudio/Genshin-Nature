package net.mcreator.genshinnature.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.genshinnature.init.GenshinNatureModEntities;
import net.mcreator.genshinnature.init.GenshinNatureModBlocks;

public class GoldenminioncountfinalProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.destroyBlock(BlockPos.containing(x, y, z), false);
		world.setBlock(BlockPos.containing(x, y, z), GenshinNatureModBlocks.GOLDENATTACKERSPAWNER.get().defaultBlockState(), 3);
		if (world instanceof ServerLevel _level) {
			Entity entityToSpawn = GenshinNatureModEntities.GOLDENATTACKER.get().spawn(_level, BlockPos.containing(x + 0.5, y + 1, z + 0.5), MobSpawnType.MOB_SUMMONED);
			if (entityToSpawn != null) {
				entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
			}
		}
	}
}

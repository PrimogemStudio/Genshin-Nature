package net.mcreator.genshinnature.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.genshinnature.init.GenshinNatureModEntities;

public class PyrowhopperflowerEntityIsHurtProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world.getBlockState(BlockPos.containing(x, y - 1, z)).canOcclude()) {
			if (Math.random() < 0.3) {
				if ((world.getBlockState(BlockPos.containing(x + 2, y, z))).getBlock() == Blocks.AIR) {
					if (((world.getBlockState(BlockPos.containing(x + 2, y - 1, z))).getBlock() == Blocks.AIR) == false) {
						world.setBlock(BlockPos.containing(x + 2, y, z), Blocks.FIRE.defaultBlockState(), 3);
					}
				}
				if ((world.getBlockState(BlockPos.containing(x + 3, y, z))).getBlock() == Blocks.AIR) {
					if (((world.getBlockState(BlockPos.containing(x + 3, y - 1, z))).getBlock() == Blocks.AIR) == false) {
						world.setBlock(BlockPos.containing(x + 3, y, z), Blocks.FIRE.defaultBlockState(), 3);
					}
				}
				if ((world.getBlockState(BlockPos.containing(x - 2, y, z))).getBlock() == Blocks.AIR) {
					if (((world.getBlockState(BlockPos.containing(x - 2, y - 1, z))).getBlock() == Blocks.AIR) == false) {
						world.setBlock(BlockPos.containing(x - 2, y, z), Blocks.FIRE.defaultBlockState(), 3);
					}
				}
				if ((world.getBlockState(BlockPos.containing(x - 3, y, z))).getBlock() == Blocks.AIR) {
					if (((world.getBlockState(BlockPos.containing(x - 3, y - 1, z))).getBlock() == Blocks.AIR) == false) {
						world.setBlock(BlockPos.containing(x - 3, y, z), Blocks.FIRE.defaultBlockState(), 3);
					}
				}
				if ((world.getBlockState(BlockPos.containing(x, y, z + 2))).getBlock() == Blocks.AIR) {
					if (((world.getBlockState(BlockPos.containing(x, y - 1, z + 2))).getBlock() == Blocks.AIR) == false) {
						world.setBlock(BlockPos.containing(x, y, z + 2), Blocks.FIRE.defaultBlockState(), 3);
					}
				}
				if ((world.getBlockState(BlockPos.containing(x, y, z + 3))).getBlock() == Blocks.AIR) {
					if (((world.getBlockState(BlockPos.containing(x, y - 1, z + 3))).getBlock() == Blocks.AIR) == false) {
						world.setBlock(BlockPos.containing(x, y, z + 3), Blocks.FIRE.defaultBlockState(), 3);
					}
				}
				if ((world.getBlockState(BlockPos.containing(x, y, z - 2))).getBlock() == Blocks.AIR) {
					if (((world.getBlockState(BlockPos.containing(x, y - 1, z - 2))).getBlock() == Blocks.AIR) == false) {
						world.setBlock(BlockPos.containing(x, y, z - 2), Blocks.FIRE.defaultBlockState(), 3);
					}
				}
				if ((world.getBlockState(BlockPos.containing(x, y, z - 3))).getBlock() == Blocks.AIR) {
					if (((world.getBlockState(BlockPos.containing(x, y - 1, z - 3))).getBlock() == Blocks.AIR) == false) {
						world.setBlock(BlockPos.containing(x, y, z - 3), Blocks.FIRE.defaultBlockState(), 3);
					}
				}
			}
		}
		if (Math.random() < 0.1) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = GenshinNatureModEntities.WISP.get().spawn(_level, BlockPos.containing(x, y, z + 3), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
				}
			}
		}
	}
}

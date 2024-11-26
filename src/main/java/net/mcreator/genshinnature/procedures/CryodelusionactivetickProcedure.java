package net.mcreator.genshinnature.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.core.BlockPos;

import net.mcreator.genshinnature.init.GenshinNatureModBlocks;

public class CryodelusionactivetickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.WATER) {
			world.setBlock(BlockPos.containing(x, y - 1, z), GenshinNatureModBlocks.TIMEDICE.get().defaultBlockState(), 3);
			entity.hurt(new DamageSource(world.holderOrThrow(DamageTypes.GENERIC)), 1);
		}
		if ((world.getBlockState(BlockPos.containing(x - 1, y - 1, z))).getBlock() == Blocks.WATER) {
			world.setBlock(BlockPos.containing(x - 1, y - 1, z), GenshinNatureModBlocks.TIMEDICE.get().defaultBlockState(), 3);
			entity.hurt(new DamageSource(world.holderOrThrow(DamageTypes.GENERIC)), 1);
		}
		if ((world.getBlockState(BlockPos.containing(x + 1, y - 1, z))).getBlock() == Blocks.WATER) {
			world.setBlock(BlockPos.containing(x + 1, y - 1, z), GenshinNatureModBlocks.TIMEDICE.get().defaultBlockState(), 3);
		}
		if ((world.getBlockState(BlockPos.containing(x, y - 1, z + 1))).getBlock() == Blocks.WATER) {
			world.setBlock(BlockPos.containing(x, y - 1, z + 1), GenshinNatureModBlocks.TIMEDICE.get().defaultBlockState(), 3);
		}
		if ((world.getBlockState(BlockPos.containing(x, y - 1, z - 1))).getBlock() == Blocks.WATER) {
			world.setBlock(BlockPos.containing(x, y - 1, z - 1), GenshinNatureModBlocks.TIMEDICE.get().defaultBlockState(), 3);
		}
	}
}

package net.mcreator.genshinnature.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.genshinnature.init.GenshinNatureModBlocks;

public class Challengeblockhydro1countProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		world.destroyBlock(BlockPos.containing(x, y, z), false);
		world.setBlock(BlockPos.containing(x, y, z), GenshinNatureModBlocks.CHALLENGEBLOCKHYDRO_3.get().defaultBlockState(), 3);
		if (entity instanceof Player _player)
			_player.closeContainer();
	}
}

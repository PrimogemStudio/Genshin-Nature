package net.mcreator.genshinnature.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.core.BlockPos;

public class UnderwatertickupdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.AIR) {
			if (world.getBlockState(BlockPos.containing(x, y - 1, z)).canOcclude() == false) {
				{
					Entity _ent = entity;
					_ent.teleportTo(x, (y - 1), z);
					if (_ent instanceof ServerPlayer _serverPlayer)
						_serverPlayer.connection.teleport(x, (y - 1), z, _ent.getYRot(), _ent.getXRot());
				}
			}
		}
		if (((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.WATER) == false) {
			if (world.getBlockState(BlockPos.containing(x, y - 1, z)).canOcclude() == false) {
				{
					Entity _ent = entity;
					_ent.teleportTo(x, (y - 1), z);
					if (_ent instanceof ServerPlayer _serverPlayer)
						_serverPlayer.connection.teleport(x, (y - 1), z, _ent.getYRot(), _ent.getXRot());
				}
			}
		}
		if (world.getBlockState(BlockPos.containing(x, y, z)).canOcclude()) {
			{
				Entity _ent = entity;
				_ent.teleportTo(x, (y + 1), z);
				if (_ent instanceof ServerPlayer _serverPlayer)
					_serverPlayer.connection.teleport(x, (y + 1), z, _ent.getYRot(), _ent.getXRot());
			}
		}
		if (((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.AIR) == true) {
			if (((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.WATER) == true) {
				{
					Entity _ent = entity;
					_ent.teleportTo(x, (y - 1), z);
					if (_ent instanceof ServerPlayer _serverPlayer)
						_serverPlayer.connection.teleport(x, (y - 1), z, _ent.getYRot(), _ent.getXRot());
				}
			}
		}
	}
}

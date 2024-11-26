package net.mcreator.genshinnature.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.core.BlockPos;

public class OsialEntityIsHurtProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity sourceentity) {
		if (sourceentity == null)
			return;
		if (Math.random() < 0.9) {
			if (sourceentity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.WATER_BREATHING);
		}
		if (Math.random() < 0.3) {
			if (sourceentity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.LEVITATION, 60, 8));
		}
		if (Math.random() < 0.2) {
			if (world.getBlockState(BlockPos.containing(x, y - 1, z)).canOcclude() == false) {
				{
					Entity _ent = sourceentity;
					_ent.teleportTo(x, (y - 1), z);
					if (_ent instanceof ServerPlayer _serverPlayer)
						_serverPlayer.connection.teleport(x, (y - 1), z, _ent.getYRot(), _ent.getXRot());
				}
			}
		}
	}
}

package net.mcreator.genshinnature.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

public class SmolderinglavaProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (world instanceof ServerLevel _level) {
			itemstack.hurtAndBreak(1, _level, null, _stkprov -> {
			});
		}
		world.setBlock(BlockPos.containing(x + 1, y + 1, z + 1), Blocks.LAVA.defaultBlockState(), 3);
		world.setBlock(BlockPos.containing(x - 1, y + 1, z + 1), Blocks.LAVA.defaultBlockState(), 3);
		world.setBlock(BlockPos.containing(x + 1, y + 1, z - 1), Blocks.LAVA.defaultBlockState(), 3);
		world.setBlock(BlockPos.containing(x - 1, y + 1, z - 1), Blocks.LAVA.defaultBlockState(), 3);
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 600, 0));
	}
}

package net.mcreator.genshinnature.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.genshinnature.init.GenshinNatureModBlocks;

public class HydrodelusionactivetickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.WATER_BREATHING, 60, 0));
		if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.LAVA) {
			world.setBlock(BlockPos.containing(x, y - 1, z), GenshinNatureModBlocks.TIMEDOBSIDIAN.get().defaultBlockState(), 3);
			entity.hurt(new DamageSource(world.holderOrThrow(DamageTypes.GENERIC)), 1);
		}
		if ((world.getBlockState(BlockPos.containing(x - 1, y - 1, z))).getBlock() == Blocks.LAVA) {
			world.setBlock(BlockPos.containing(x - 1, y - 1, z), GenshinNatureModBlocks.TIMEDOBSIDIAN.get().defaultBlockState(), 3);
			entity.hurt(new DamageSource(world.holderOrThrow(DamageTypes.GENERIC)), 1);
		}
		if ((world.getBlockState(BlockPos.containing(x + 1, y - 1, z))).getBlock() == Blocks.LAVA) {
			world.setBlock(BlockPos.containing(x + 1, y - 1, z), GenshinNatureModBlocks.TIMEDOBSIDIAN.get().defaultBlockState(), 3);
		}
		if ((world.getBlockState(BlockPos.containing(x, y - 1, z + 1))).getBlock() == Blocks.LAVA) {
			world.setBlock(BlockPos.containing(x, y - 1, z + 1), GenshinNatureModBlocks.TIMEDOBSIDIAN.get().defaultBlockState(), 3);
		}
		if ((world.getBlockState(BlockPos.containing(x, y - 1, z - 1))).getBlock() == Blocks.LAVA) {
			world.setBlock(BlockPos.containing(x, y - 1, z - 1), GenshinNatureModBlocks.TIMEDOBSIDIAN.get().defaultBlockState(), 3);
		}
		if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).is(BlockTags.create(ResourceLocation.parse("minecraft:fire")))) {
			world.setBlock(BlockPos.containing(x, y - 1, z), Blocks.AIR.defaultBlockState(), 3);
		}
		if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).is(BlockTags.create(ResourceLocation.parse("minecraft:fire")))) {
			world.setBlock(BlockPos.containing(x, y + 1, z), Blocks.AIR.defaultBlockState(), 3);
		}
		if ((world.getBlockState(BlockPos.containing(x + 1, y, z))).is(BlockTags.create(ResourceLocation.parse("minecraft:fire")))) {
			world.setBlock(BlockPos.containing(x + 1, y, z), Blocks.AIR.defaultBlockState(), 3);
		}
		if ((world.getBlockState(BlockPos.containing(x - 1, y, z))).is(BlockTags.create(ResourceLocation.parse("minecraft:fire")))) {
			world.setBlock(BlockPos.containing(x - 1, y, z), Blocks.AIR.defaultBlockState(), 3);
		}
		if ((world.getBlockState(BlockPos.containing(x, y, z - 1))).is(BlockTags.create(ResourceLocation.parse("minecraft:fire")))) {
			world.setBlock(BlockPos.containing(x, y, z - 1), Blocks.AIR.defaultBlockState(), 3);
		}
		if ((world.getBlockState(BlockPos.containing(x, y, z + 1))).is(BlockTags.create(ResourceLocation.parse("minecraft:fire")))) {
			world.setBlock(BlockPos.containing(x, y, z + 1), Blocks.AIR.defaultBlockState(), 3);
		}
		if ((world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(ResourceLocation.parse("minecraft:fire")))) {
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
		}
	}
}

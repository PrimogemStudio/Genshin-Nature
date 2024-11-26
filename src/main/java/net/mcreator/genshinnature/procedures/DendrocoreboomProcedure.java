package net.mcreator.genshinnature.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.TagKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;

import net.mcreator.genshinnature.init.GenshinNatureModMobEffects;

public class DendrocoreboomProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("genshin_nature:enemyofnatureaffected"))) == false) {
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, x, y, z, 1, Level.ExplosionInteraction.NONE);
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
		}
		if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("genshin_nature:isaplayer")))) {
			if ((entity instanceof LivingEntity _livEnt4 && _livEnt4.hasEffect(GenshinNatureModMobEffects.DENDROVISIONEFFECT)) == false) {
				if (world instanceof Level _level && !_level.isClientSide())
					_level.explode(null, x, y, z, 1, Level.ExplosionInteraction.NONE);
				world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			}
			if ((entity instanceof LivingEntity _livEnt7 && _livEnt7.hasEffect(GenshinNatureModMobEffects.DENDRODELUSIONEFFECT)) == false) {
				if (world instanceof Level _level && !_level.isClientSide())
					_level.explode(null, x, y, z, 1, Level.ExplosionInteraction.NONE);
				world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			}
		}
	}
}
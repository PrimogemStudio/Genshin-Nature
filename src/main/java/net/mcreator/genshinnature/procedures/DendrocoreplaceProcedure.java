package net.mcreator.genshinnature.procedures;

import net.neoforged.neoforge.event.entity.living.LivingIncomingDamageEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.TagKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;

import net.mcreator.genshinnature.init.GenshinNatureModMobEffects;
import net.mcreator.genshinnature.init.GenshinNatureModBlocks;

import javax.annotation.Nullable;

@EventBusSubscriber
public class DendrocoreplaceProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingIncomingDamageEvent event) {
		if (event.getEntity() != null) {
			execute(event, event.getEntity().level(), event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity(), event.getSource().getEntity());
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		execute(null, world, x, y, z, entity, sourceentity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (sourceentity.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("genshin_nature:hydrophobiaaffected")))) {
			if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("genshin_nature:enemyofnatureaffected")))) {
				if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.AIR) {
					world.setBlock(BlockPos.containing(x, y, z), GenshinNatureModBlocks.DENDROCORE.get().defaultBlockState(), 3);
				}
			}
			if (entity instanceof LivingEntity _livEnt5 && _livEnt5.hasEffect(GenshinNatureModMobEffects.DENDROVISIONEFFECT)) {
				if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.AIR) {
					world.setBlock(BlockPos.containing(x, y, z), GenshinNatureModBlocks.DENDROCORE.get().defaultBlockState(), 3);
				}
			}
			if (entity instanceof LivingEntity _livEnt9 && _livEnt9.hasEffect(GenshinNatureModMobEffects.DENDRODELUSIONEFFECT)) {
				if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.AIR) {
					world.setBlock(BlockPos.containing(x, y, z), GenshinNatureModBlocks.DENDROCORE.get().defaultBlockState(), 3);
				}
			}
		}
		if (sourceentity instanceof LivingEntity _livEnt13 && _livEnt13.hasEffect(GenshinNatureModMobEffects.HYDROVISIONEFFECT)) {
			if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("genshin_nature:enemyofnatureaffected")))) {
				if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.AIR) {
					world.setBlock(BlockPos.containing(x, y, z), GenshinNatureModBlocks.DENDROCORE.get().defaultBlockState(), 3);
				}
			}
			if (entity instanceof LivingEntity _livEnt18 && _livEnt18.hasEffect(GenshinNatureModMobEffects.DENDROVISIONEFFECT)) {
				if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.AIR) {
					world.setBlock(BlockPos.containing(x, y, z), GenshinNatureModBlocks.DENDROCORE.get().defaultBlockState(), 3);
				}
			}
			if (entity instanceof LivingEntity _livEnt22 && _livEnt22.hasEffect(GenshinNatureModMobEffects.DENDRODELUSIONEFFECT)) {
				if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.AIR) {
					world.setBlock(BlockPos.containing(x, y, z), GenshinNatureModBlocks.DENDROCORE.get().defaultBlockState(), 3);
				}
			}
		}
		if (sourceentity instanceof LivingEntity _livEnt26 && _livEnt26.hasEffect(GenshinNatureModMobEffects.HYDRODELUSIONEFFECT)) {
			if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("genshin_nature:enemyofnatureaffected")))) {
				if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.AIR) {
					world.setBlock(BlockPos.containing(x, y, z), GenshinNatureModBlocks.DENDROCORE.get().defaultBlockState(), 3);
				}
			}
			if (entity instanceof LivingEntity _livEnt31 && _livEnt31.hasEffect(GenshinNatureModMobEffects.DENDROVISIONEFFECT)) {
				if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.AIR) {
					world.setBlock(BlockPos.containing(x, y, z), GenshinNatureModBlocks.DENDROCORE.get().defaultBlockState(), 3);
				}
			}
			if (entity instanceof LivingEntity _livEnt35 && _livEnt35.hasEffect(GenshinNatureModMobEffects.DENDRODELUSIONEFFECT)) {
				if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.AIR) {
					world.setBlock(BlockPos.containing(x, y, z), GenshinNatureModBlocks.DENDROCORE.get().defaultBlockState(), 3);
				}
			}
		}
		if (sourceentity.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("genshin_nature:enemyofnatureaffected")))) {
			if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("genshin_nature:hydrophobiaaffected")))) {
				if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.AIR) {
					world.setBlock(BlockPos.containing(x, y, z), GenshinNatureModBlocks.DENDROCORE.get().defaultBlockState(), 3);
				}
			}
			if (entity instanceof LivingEntity _livEnt44 && _livEnt44.hasEffect(GenshinNatureModMobEffects.HYDROVISIONEFFECT)) {
				if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.AIR) {
					world.setBlock(BlockPos.containing(x, y, z), GenshinNatureModBlocks.DENDROCORE.get().defaultBlockState(), 3);
				}
			}
			if (entity instanceof LivingEntity _livEnt48 && _livEnt48.hasEffect(GenshinNatureModMobEffects.HYDRODELUSIONEFFECT)) {
				if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.AIR) {
					world.setBlock(BlockPos.containing(x, y, z), GenshinNatureModBlocks.DENDROCORE.get().defaultBlockState(), 3);
				}
			}
		}
		if (sourceentity instanceof LivingEntity _livEnt52 && _livEnt52.hasEffect(GenshinNatureModMobEffects.DENDROVISIONEFFECT)) {
			if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("genshin_nature:hydrophobiaaffected")))) {
				if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.AIR) {
					world.setBlock(BlockPos.containing(x, y, z), GenshinNatureModBlocks.DENDROCORE.get().defaultBlockState(), 3);
				}
			}
			if (entity instanceof LivingEntity _livEnt57 && _livEnt57.hasEffect(GenshinNatureModMobEffects.HYDROVISIONEFFECT)) {
				if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.AIR) {
					world.setBlock(BlockPos.containing(x, y, z), GenshinNatureModBlocks.DENDROCORE.get().defaultBlockState(), 3);
				}
			}
			if (entity instanceof LivingEntity _livEnt61 && _livEnt61.hasEffect(GenshinNatureModMobEffects.HYDRODELUSIONEFFECT)) {
				if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.AIR) {
					world.setBlock(BlockPos.containing(x, y, z), GenshinNatureModBlocks.DENDROCORE.get().defaultBlockState(), 3);
				}
			}
		}
		if (sourceentity instanceof LivingEntity _livEnt65 && _livEnt65.hasEffect(GenshinNatureModMobEffects.DENDRODELUSIONEFFECT)) {
			if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("genshin_nature:hydrophobiaaffected")))) {
				if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.AIR) {
					world.setBlock(BlockPos.containing(x, y, z), GenshinNatureModBlocks.DENDROCORE.get().defaultBlockState(), 3);
				}
			}
			if (entity instanceof LivingEntity _livEnt70 && _livEnt70.hasEffect(GenshinNatureModMobEffects.HYDROVISIONEFFECT)) {
				if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.AIR) {
					world.setBlock(BlockPos.containing(x, y, z), GenshinNatureModBlocks.DENDROCORE.get().defaultBlockState(), 3);
				}
			}
			if (entity instanceof LivingEntity _livEnt74 && _livEnt74.hasEffect(GenshinNatureModMobEffects.HYDRODELUSIONEFFECT)) {
				if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.AIR) {
					world.setBlock(BlockPos.containing(x, y, z), GenshinNatureModBlocks.DENDROCORE.get().defaultBlockState(), 3);
				}
			}
		}
	}
}

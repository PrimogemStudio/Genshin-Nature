package net.mcreator.genshinnature.procedures;

import net.neoforged.neoforge.event.tick.PlayerTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.tags.TagKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;

import net.mcreator.genshinnature.init.GenshinNatureModMobEffects;
import net.mcreator.genshinnature.init.GenshinNatureModItems;
import net.mcreator.genshinnature.init.GenshinNatureModGameRules;
import net.mcreator.genshinnature.init.GenshinNatureModBlocks;

import javax.annotation.Nullable;

@EventBusSubscriber
public class ReceivesheercoldProcedure {
	@SubscribeEvent
	public static void onPlayerTick(PlayerTickEvent.Post event) {
		execute(event, event.getEntity().level(), event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (world.getLevelData().getGameRules().getBoolean(GenshinNatureModGameRules.ALLOWSHEERCOLD) == true) {
			if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("genshin_nature:isaplayer")))) {
				if (entity.isOnFire() == false) {
					if ((entity instanceof LivingEntity _livEnt3 && _livEnt3.hasEffect(GenshinNatureModMobEffects.COLDPROTECTION)) == false) {
						if ((entity instanceof LivingEntity _livEnt4 && _livEnt4.hasEffect(GenshinNatureModMobEffects.CRYOVISIONEFFECT)) == false) {
							if ((entity instanceof LivingEntity _livEnt5 && _livEnt5.hasEffect(GenshinNatureModMobEffects.CRYODELUSIONEFFECT)) == false) {
								if ((entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(GenshinNatureModItems.WARMINGBOTTLE.get())) : false) == false) {
									if ((entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(GenshinNatureModBlocks.CRIMSONAGATEBLOCK.get())) : false) == false) {
										if ((entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(GenshinNatureModItems.VITALIZEDDRAGONTOOTH.get())) : false) == false) {
											if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.SNOW_BLOCK) {
												if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
													_entity.addEffect(new MobEffectInstance(GenshinNatureModMobEffects.SHEERCOLD, 60, 0));
											}
											if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.ICE) {
												if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
													_entity.addEffect(new MobEffectInstance(GenshinNatureModMobEffects.SHEERCOLD, 60, 0));
											}
											if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.PACKED_ICE) {
												if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
													_entity.addEffect(new MobEffectInstance(GenshinNatureModMobEffects.SHEERCOLD, 60, 0));
											}
											if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.BLUE_ICE) {
												if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
													_entity.addEffect(new MobEffectInstance(GenshinNatureModMobEffects.SHEERCOLD, 60, 0));
											}
											if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("deep_frozen_ocean"))) {
												if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
													_entity.addEffect(new MobEffectInstance(GenshinNatureModMobEffects.SHEERCOLD, 60, 0));
											}
											if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("frozen_ocean"))) {
												if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
													_entity.addEffect(new MobEffectInstance(GenshinNatureModMobEffects.SHEERCOLD, 60, 0));
											}
											if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("frozen_river"))) {
												if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
													_entity.addEffect(new MobEffectInstance(GenshinNatureModMobEffects.SHEERCOLD, 60, 0));
											}
											if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("ice_spikes"))) {
												if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
													_entity.addEffect(new MobEffectInstance(GenshinNatureModMobEffects.SHEERCOLD, 60, 0));
											}
											if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("snowy_beach"))) {
												if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
													_entity.addEffect(new MobEffectInstance(GenshinNatureModMobEffects.SHEERCOLD, 60, 0));
											}
											if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("snowy_taiga"))) {
												if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
													_entity.addEffect(new MobEffectInstance(GenshinNatureModMobEffects.SHEERCOLD, 60, 0));
											}
											if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("plains"))) {
												if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
													_entity.addEffect(new MobEffectInstance(GenshinNatureModMobEffects.SHEERCOLD, 60, 0));
											}
											if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("plains"))) {
												if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
													_entity.addEffect(new MobEffectInstance(GenshinNatureModMobEffects.SHEERCOLD, 60, 0));
											}
											if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("snowy_plains"))) {
												if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
													_entity.addEffect(new MobEffectInstance(GenshinNatureModMobEffects.SHEERCOLD, 60, 0));
											}
											if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("plains"))) {
												if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
													_entity.addEffect(new MobEffectInstance(GenshinNatureModMobEffects.SHEERCOLD, 60, 0));
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		if (world.getLevelData().getGameRules().getBoolean(GenshinNatureModGameRules.ALLOWSHEERCOLD) == false) {
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.SHEERCOLD);
		}
	}
}

package net.mcreator.genshinnature.procedures;

import net.neoforged.neoforge.event.entity.player.PlayerInteractEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.core.BlockPos;

import net.mcreator.genshinnature.init.GenshinNatureModMobEffects;
import net.mcreator.genshinnature.init.GenshinNatureModBlocks;

import javax.annotation.Nullable;

@EventBusSubscriber
public class Geovisionproced1Procedure {
	@SubscribeEvent
	public static void onRightClickBlock(PlayerInteractEvent.RightClickBlock event) {
		if (event.getHand() != event.getEntity().getUsedItemHand())
			return;
		execute(event, event.getLevel(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), event.getEntity());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(GenshinNatureModMobEffects.GEOVISIONEFFECT)) {
			if (entity.isShiftKeyDown()) {
				if (((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.AIR) == true) {
					if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()) {
						world.setBlock(BlockPos.containing(x, y + 1, z), GenshinNatureModBlocks.PILLARSTONE.get().defaultBlockState(), 3);
					}
				}
			}
		}
		if (entity instanceof LivingEntity _livEnt7 && _livEnt7.hasEffect(GenshinNatureModMobEffects.GEODELUSIONEFFECT)) {
			if (entity.isShiftKeyDown()) {
				if (((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.AIR) == true) {
					if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()) {
						world.setBlock(BlockPos.containing(x, y + 1, z), GenshinNatureModBlocks.PILLARSTONE.get().defaultBlockState(), 3);
						entity.hurt(new DamageSource(world.holderOrThrow(DamageTypes.GENERIC)), 2);
					}
				}
			}
		}
	}
}

package net.mcreator.genshinnature.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;

import net.mcreator.genshinnature.init.GenshinNatureModItems;

public class MiasmictumorRightClickedOnEntityProcedure {
	public static void execute(LevelAccessor world, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == GenshinNatureModItems.HURTMIASMICTUMOR.get()) {
			entity.hurt(new DamageSource(world.holderOrThrow(DamageTypes.GENERIC)), 5);
			if (Math.random() < 0.5) {
				entity.hurt(new DamageSource(world.holderOrThrow(DamageTypes.GENERIC)), 11);
			}
			if (Math.random() < 0.25) {
				entity.hurt(new DamageSource(world.holderOrThrow(DamageTypes.GENERIC)), 16);
			}
			if (Math.random() < 0.1) {
				entity.hurt(new DamageSource(world.holderOrThrow(DamageTypes.GENERIC)), 23);
			}
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(GenshinNatureModItems.HURTMIASMICTUMOR.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
		}
	}
}

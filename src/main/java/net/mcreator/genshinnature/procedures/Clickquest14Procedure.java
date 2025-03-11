package net.mcreator.genshinnature.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.genshinnature.init.GenshinNatureModItems;
import net.mcreator.genshinnature.init.GenshinNatureModBlocks;

import java.util.function.Supplier;
import java.util.Map;

public class Clickquest14Procedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
			ItemStack _setstack = new ItemStack(GenshinNatureModItems.LITTLEDRIEDFLOWER.get()).copy();
			_setstack.setCount(1);
			((Slot) _slots.get(11)).set(_setstack);
			_player.containerMenu.broadcastChanges();
		}
		if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
			ItemStack _setstack = new ItemStack(GenshinNatureModBlocks.GLAZELILY.get()).copy();
			_setstack.setCount(18);
			((Slot) _slots.get(5)).set(_setstack);
			_player.containerMenu.broadcastChanges();
		}
		if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
			ItemStack _setstack = new ItemStack(GenshinNatureModItems.BERRY.get()).copy();
			_setstack.setCount(44);
			((Slot) _slots.get(6)).set(_setstack);
			_player.containerMenu.broadcastChanges();
		}
		if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
			ItemStack _setstack = new ItemStack(GenshinNatureModBlocks.JUEYUNCHILI.get()).copy();
			_setstack.setCount(22);
			((Slot) _slots.get(7)).set(_setstack);
			_player.containerMenu.broadcastChanges();
		}
		if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
			ItemStack _setstack = new ItemStack(GenshinNatureModBlocks.THROUGHTHEWHITEFOAMTHEJADEBUTTERFLYSOARS.get()).copy();
			_setstack.setCount(16);
			((Slot) _slots.get(8)).set(_setstack);
			_player.containerMenu.broadcastChanges();
		}
		if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
			ItemStack _setstack = new ItemStack(GenshinNatureModBlocks.SANDBEARERWOOD.get()).copy();
			_setstack.setCount(33);
			((Slot) _slots.get(9)).set(_setstack);
			_player.containerMenu.broadcastChanges();
		}
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem() == GenshinNatureModBlocks.GLAZELILY.get()
				.asItem()) {
			if (getAmountInGUISlot(entity, 0) >= 18) {
				if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY).getItem() == GenshinNatureModItems.BERRY
						.get()) {
					if (getAmountInGUISlot(entity, 1) >= 44) {
						if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(2)).getItem() : ItemStack.EMPTY)
								.getItem() == GenshinNatureModBlocks.JUEYUNCHILI.get().asItem()) {
							if (getAmountInGUISlot(entity, 2) >= 22) {
								if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(3)).getItem() : ItemStack.EMPTY)
										.getItem() == GenshinNatureModBlocks.THROUGHTHEWHITEFOAMTHEJADEBUTTERFLYSOARS.get().asItem()) {
									if (getAmountInGUISlot(entity, 3) >= 16) {
										if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(4)).getItem() : ItemStack.EMPTY)
												.getItem() == GenshinNatureModBlocks.SANDBEARERWOOD.get().asItem()) {
											if (getAmountInGUISlot(entity, 4) >= 33) {
												if (getAmountInGUISlot(entity, 10) == 0) {
													if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
														((Slot) _slots.get(0)).remove(18);
														_player.containerMenu.broadcastChanges();
													}
													if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
														((Slot) _slots.get(1)).remove(44);
														_player.containerMenu.broadcastChanges();
													}
													if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
														((Slot) _slots.get(2)).remove(22);
														_player.containerMenu.broadcastChanges();
													}
													if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
														((Slot) _slots.get(3)).remove(16);
														_player.containerMenu.broadcastChanges();
													}
													if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
														((Slot) _slots.get(4)).remove(33);
														_player.containerMenu.broadcastChanges();
													}
													if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
														ItemStack _setstack = new ItemStack(GenshinNatureModItems.LITTLEDRIEDFLOWER.get()).copy();
														_setstack.setCount(1);
														((Slot) _slots.get(10)).set(_setstack);
														_player.containerMenu.broadcastChanges();
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
			}
		}
	}

	private static int getAmountInGUISlot(Entity entity, int sltid) {
		if (entity instanceof Player player && player.containerMenu instanceof Supplier slotSupplier && slotSupplier.get() instanceof Map guiSlots) {
			ItemStack stack = ((Slot) guiSlots.get(sltid)).getItem();
			if (stack != null)
				return stack.getCount();
		}
		return 0;
	}
}

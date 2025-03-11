package net.mcreator.genshinnature.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.genshinnature.init.GenshinNatureModItems;
import net.mcreator.genshinnature.init.GenshinNatureModBlocks;

import java.util.function.Supplier;
import java.util.Map;

public class Clickquest6Procedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
			ItemStack _setstack = new ItemStack(GenshinNatureModItems.CONDENSEDRESIN.get()).copy();
			_setstack.setCount(1);
			((Slot) _slots.get(11)).set(_setstack);
			_player.containerMenu.broadcastChanges();
		}
		if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
			ItemStack _setstack = new ItemStack(GenshinNatureModItems.ORIGINALRESIN.get()).copy();
			_setstack.setCount(15);
			((Slot) _slots.get(5)).set(_setstack);
			_player.containerMenu.broadcastChanges();
		}
		if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
			ItemStack _setstack = new ItemStack(GenshinNatureModItems.CRYSTALCORE.get()).copy();
			_setstack.setCount(8);
			((Slot) _slots.get(6)).set(_setstack);
			_player.containerMenu.broadcastChanges();
		}
		if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
			ItemStack _setstack = new ItemStack(GenshinNatureModBlocks.STARSILVER.get()).copy();
			_setstack.setCount(19);
			((Slot) _slots.get(7)).set(_setstack);
			_player.containerMenu.broadcastChanges();
		}
		if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
			ItemStack _setstack = new ItemStack(GenshinNatureModBlocks.NOCTILUCOUSJADE.get()).copy();
			_setstack.setCount(3);
			((Slot) _slots.get(8)).set(_setstack);
			_player.containerMenu.broadcastChanges();
		}
		if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
			ItemStack _setstack = new ItemStack(GenshinNatureModBlocks.FLUORESCENTFUNGUS.get()).copy();
			_setstack.setCount(26);
			((Slot) _slots.get(9)).set(_setstack);
			_player.containerMenu.broadcastChanges();
		}
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem() == GenshinNatureModItems.ORIGINALRESIN
				.get()) {
			if (getAmountInGUISlot(entity, 0) >= 15) {
				if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY).getItem() == GenshinNatureModItems.CRYSTALCORE
						.get()) {
					if (getAmountInGUISlot(entity, 1) >= 8) {
						if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(2)).getItem() : ItemStack.EMPTY)
								.getItem() == GenshinNatureModBlocks.STARSILVER.get().asItem()) {
							if (getAmountInGUISlot(entity, 2) >= 19) {
								if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(3)).getItem() : ItemStack.EMPTY)
										.getItem() == GenshinNatureModBlocks.NOCTILUCOUSJADE.get().asItem()) {
									if (getAmountInGUISlot(entity, 3) >= 3) {
										if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(4)).getItem() : ItemStack.EMPTY)
												.getItem() == GenshinNatureModBlocks.FLUORESCENTFUNGUS.get().asItem()) {
											if (getAmountInGUISlot(entity, 4) >= 26) {
												if (getAmountInGUISlot(entity, 10) == 0) {
													if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
														((Slot) _slots.get(0)).remove(15);
														_player.containerMenu.broadcastChanges();
													}
													if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
														((Slot) _slots.get(1)).remove(8);
														_player.containerMenu.broadcastChanges();
													}
													if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
														((Slot) _slots.get(2)).remove(19);
														_player.containerMenu.broadcastChanges();
													}
													if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
														((Slot) _slots.get(3)).remove(3);
														_player.containerMenu.broadcastChanges();
													}
													if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
														((Slot) _slots.get(4)).remove(26);
														_player.containerMenu.broadcastChanges();
													}
													if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
														ItemStack _setstack = new ItemStack(GenshinNatureModItems.CONDENSEDRESIN.get()).copy();
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

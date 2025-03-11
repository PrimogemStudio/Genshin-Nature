package net.mcreator.genshinnature.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.genshinnature.init.GenshinNatureModItems;

import java.util.function.Supplier;
import java.util.Map;

public class AutoplacepocketgrimoireProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem() == GenshinNatureModItems.POCKETGRIMOIRE
				.get()) {
			if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(GenshinNatureModItems.MORA.get())) : false) {
				if ((getAmountInGUISlot(entity, 1) == 0) == true) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(GenshinNatureModItems.MORA.get());
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
					if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(GenshinNatureModItems.MORA.get()).copy();
						_setstack.setCount(1);
						((Slot) _slots.get(1)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				}
			}
			if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(GenshinNatureModItems.TILEOFDECARABIANSTOWER.get())) : false) {
				if ((getAmountInGUISlot(entity, 2) == 0) == true) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(GenshinNatureModItems.TILEOFDECARABIANSTOWER.get());
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
					if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(GenshinNatureModItems.TILEOFDECARABIANSTOWER.get()).copy();
						_setstack.setCount(1);
						((Slot) _slots.get(2)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				}
			}
			if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(GenshinNatureModItems.DEBRISOFDECARABIANSCITY.get())) : false) {
				if ((getAmountInGUISlot(entity, 3) == 0) == true) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(GenshinNatureModItems.DEBRISOFDECARABIANSCITY.get());
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
					if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(GenshinNatureModItems.DEBRISOFDECARABIANSCITY.get()).copy();
						_setstack.setCount(1);
						((Slot) _slots.get(3)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				}
			}
			if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(GenshinNatureModItems.FRAGMENTOFDECARABIANSEPIC.get())) : false) {
				if ((getAmountInGUISlot(entity, 4) == 0) == true) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(GenshinNatureModItems.FRAGMENTOFDECARABIANSEPIC.get());
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
					if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(GenshinNatureModItems.FRAGMENTOFDECARABIANSEPIC.get()).copy();
						_setstack.setCount(1);
						((Slot) _slots.get(4)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				}
			}
			if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(GenshinNatureModItems.HEAVYHORN.get())) : false) {
				if ((getAmountInGUISlot(entity, 5) == 0) == true) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(GenshinNatureModItems.HEAVYHORN.get());
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
					if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(GenshinNatureModItems.HEAVYHORN.get()).copy();
						_setstack.setCount(1);
						((Slot) _slots.get(5)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				}
			}
			if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(GenshinNatureModItems.BLACKBRONZEHORN.get())) : false) {
				if ((getAmountInGUISlot(entity, 6) == 0) == true) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(GenshinNatureModItems.BLACKBRONZEHORN.get());
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
					if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(GenshinNatureModItems.BLACKBRONZEHORN.get()).copy();
						_setstack.setCount(1);
						((Slot) _slots.get(6)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				}
			}
			if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(GenshinNatureModItems.DAMAGEDMASK.get())) : false) {
				if ((getAmountInGUISlot(entity, 7) == 0) == true) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(GenshinNatureModItems.DAMAGEDMASK.get());
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
					if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(GenshinNatureModItems.DAMAGEDMASK.get()).copy();
						_setstack.setCount(1);
						((Slot) _slots.get(7)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				}
			}
			if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(GenshinNatureModItems.STAINEDMASK.get())) : false) {
				if ((getAmountInGUISlot(entity, 8) == 0) == true) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(GenshinNatureModItems.STAINEDMASK.get());
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
					if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(GenshinNatureModItems.STAINEDMASK.get()).copy();
						_setstack.setCount(1);
						((Slot) _slots.get(8)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				}
			}
			if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(Blocks.AIR)) : false) {
				if ((getAmountInGUISlot(entity, 9) == 0) == true) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.AIR);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
					if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						((Slot) _slots.get(9)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				}
			}
			if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(Blocks.AIR)) : false) {
				if ((getAmountInGUISlot(entity, 10) == 0) == true) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.AIR);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
					if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						((Slot) _slots.get(10)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				}
			}
			if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(Blocks.AIR)) : false) {
				if ((getAmountInGUISlot(entity, 11) == 0) == true) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.AIR);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
					if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						((Slot) _slots.get(11)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				}
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(GenshinNatureModItems.MORA.get()).copy();
				_setstack.setCount(1);
				((Slot) _slots.get(12)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(GenshinNatureModItems.TILEOFDECARABIANSTOWER.get()).copy();
				_setstack.setCount(1);
				((Slot) _slots.get(13)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(GenshinNatureModItems.DEBRISOFDECARABIANSCITY.get()).copy();
				_setstack.setCount(1);
				((Slot) _slots.get(14)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(GenshinNatureModItems.FRAGMENTOFDECARABIANSEPIC.get()).copy();
				_setstack.setCount(1);
				((Slot) _slots.get(15)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(GenshinNatureModItems.HEAVYHORN.get()).copy();
				_setstack.setCount(1);
				((Slot) _slots.get(16)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(GenshinNatureModItems.BLACKBRONZEHORN.get()).copy();
				_setstack.setCount(1);
				((Slot) _slots.get(17)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(GenshinNatureModItems.DAMAGEDMASK.get()).copy();
				_setstack.setCount(1);
				((Slot) _slots.get(18)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(GenshinNatureModItems.STAINEDMASK.get()).copy();
				_setstack.setCount(1);
				((Slot) _slots.get(19)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				((Slot) _slots.get(20)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				((Slot) _slots.get(21)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				((Slot) _slots.get(22)).set(_setstack);
				_player.containerMenu.broadcastChanges();
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

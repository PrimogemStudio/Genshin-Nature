package net.mcreator.genshinnature.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.genshinnature.init.GenshinNatureModItems;

import java.util.function.Supplier;
import java.util.Map;

public class AscendserpentspineProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem() == GenshinNatureModItems.SERPENTSPINE.get()) {
			if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY).getItem() == GenshinNatureModItems.MORA.get()) {
				if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(2)).getItem() : ItemStack.EMPTY)
						.getItem() == GenshinNatureModItems.GRAINOFAEROSIDERITE.get()) {
					if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(3)).getItem() : ItemStack.EMPTY)
							.getItem() == GenshinNatureModItems.PIECEOFAEROSIDERITE.get()) {
						if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(4)).getItem() : ItemStack.EMPTY)
								.getItem() == GenshinNatureModItems.BITOFAEROSIDERITE.get()) {
							if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(5)).getItem() : ItemStack.EMPTY)
									.getItem() == GenshinNatureModItems.CHUNKOFAEROSIDERITE.get()) {
								if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(6)).getItem() : ItemStack.EMPTY)
										.getItem() == GenshinNatureModItems.FRAGILEBONESHARD.get()) {
									if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(7)).getItem() : ItemStack.EMPTY)
											.getItem() == GenshinNatureModItems.STURDYBONESHARD.get()) {
										if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(8)).getItem() : ItemStack.EMPTY)
												.getItem() == GenshinNatureModItems.FOSSILIZEDBONESHARD.get()) {
											if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(9)).getItem() : ItemStack.EMPTY)
													.getItem() == GenshinNatureModItems.WHOPPERFLOWERNECTAR.get()) {
												if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(10)).getItem() : ItemStack.EMPTY)
														.getItem() == GenshinNatureModItems.SHIMMERINGNECTAR.get()) {
													if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(11)).getItem() : ItemStack.EMPTY)
															.getItem() == GenshinNatureModItems.ENERGYNECTAR.get()) {
														if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
															ItemStack _setstack = new ItemStack(GenshinNatureModItems.SERPENTSPINEASCENDED.get()).copy();
															_setstack.setCount(1);
															((Slot) _slots.get(0)).set(_setstack);
															_player.containerMenu.broadcastChanges();
														}
														if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
															((Slot) _slots.get(1)).set(ItemStack.EMPTY);
															_player.containerMenu.broadcastChanges();
														}
														if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
															((Slot) _slots.get(2)).set(ItemStack.EMPTY);
															_player.containerMenu.broadcastChanges();
														}
														if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
															((Slot) _slots.get(3)).set(ItemStack.EMPTY);
															_player.containerMenu.broadcastChanges();
														}
														if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
															((Slot) _slots.get(4)).set(ItemStack.EMPTY);
															_player.containerMenu.broadcastChanges();
														}
														if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
															((Slot) _slots.get(5)).set(ItemStack.EMPTY);
															_player.containerMenu.broadcastChanges();
														}
														if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
															((Slot) _slots.get(6)).set(ItemStack.EMPTY);
															_player.containerMenu.broadcastChanges();
														}
														if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
															((Slot) _slots.get(7)).set(ItemStack.EMPTY);
															_player.containerMenu.broadcastChanges();
														}
														if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
															((Slot) _slots.get(8)).set(ItemStack.EMPTY);
															_player.containerMenu.broadcastChanges();
														}
														if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
															((Slot) _slots.get(9)).set(ItemStack.EMPTY);
															_player.containerMenu.broadcastChanges();
														}
														if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
															((Slot) _slots.get(10)).set(ItemStack.EMPTY);
															_player.containerMenu.broadcastChanges();
														}
														if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
															((Slot) _slots.get(11)).set(ItemStack.EMPTY);
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
	}
}

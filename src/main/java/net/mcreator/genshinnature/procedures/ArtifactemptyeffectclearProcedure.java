package net.mcreator.genshinnature.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import java.util.function.Supplier;
import java.util.Map;

public class ArtifactemptyeffectclearProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (getAmountInGUISlot(entity, 0) == 0) {
			if (getAmountInGUISlot(entity, 1) == 0) {
				if (getAmountInGUISlot(entity, 2) == 0) {
					if (getAmountInGUISlot(entity, 3) == 0) {
						if (getAmountInGUISlot(entity, 4) == 0) {
							if (entity instanceof LivingEntity _entity)
								_entity.removeAllEffects();
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


package net.mcreator.genshinnature.item;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class GhostlymarchItem extends Item {
	public GhostlymarchItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(7).saturationModifier(0.6f).build()));
	}

	@Override
	public float getDestroySpeed(ItemStack itemstack, BlockState state) {
		return 0f;
	}
}
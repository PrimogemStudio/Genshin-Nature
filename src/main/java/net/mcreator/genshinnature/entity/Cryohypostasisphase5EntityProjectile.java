
package net.mcreator.genshinnature.entity;

import net.neoforged.api.distmarker.OnlyIn;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.ItemSupplier;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;

@OnlyIn(value = Dist.CLIENT, _interface = ItemSupplier.class)
public class Cryohypostasisphase5EntityProjectile extends AbstractArrow implements ItemSupplier {
	public static final ItemStack PROJECTILE_ITEM = new ItemStack(Items.SNOWBALL);

	public Cryohypostasisphase5EntityProjectile(EntityType<? extends Cryohypostasisphase5EntityProjectile> type, Level world) {
		super(type, world);
	}

	public Cryohypostasisphase5EntityProjectile(EntityType<? extends Cryohypostasisphase5EntityProjectile> type, double x, double y, double z, Level world) {
		super(type, x, y, z, world, PROJECTILE_ITEM, null);
	}

	public Cryohypostasisphase5EntityProjectile(EntityType<? extends Cryohypostasisphase5EntityProjectile> type, LivingEntity entity, Level world) {
		super(type, entity, world, PROJECTILE_ITEM, null);
	}

	@Override
	protected void doPostHurtEffects(LivingEntity livingEntity) {
		super.doPostHurtEffects(livingEntity);
		livingEntity.setArrowCount(livingEntity.getArrowCount() - 1);
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public ItemStack getItem() {
		return PROJECTILE_ITEM;
	}

	@Override
	protected ItemStack getDefaultPickupItem() {
		return new ItemStack(Items.SNOWBALL);
	}
}

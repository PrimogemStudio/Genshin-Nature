package net.mcreator.genshinnature.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.genshinnature.init.GenshinNatureModMobEffects;
import net.mcreator.genshinnature.init.GenshinNatureModItems;

import java.util.function.Supplier;
import java.util.Map;

public class DetectvisionsProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (new Object() {
			public int getAmount(int sltid) {
				if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
					ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
					if (stack != null)
						return stack.getCount();
				}
				return 0;
			}
		}.getAmount(0) == 0) {
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.PYROVISIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.HYDROVISIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.ANEMOVISIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.ELECTROVISIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.CRYOVISIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.GEOVISIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.DENDROVISIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.ANEMODELUSIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.CRYODELUSIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.ELECTRODELUSIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.GEODELUSIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.HYDRODELUSIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.PYRODELUSIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.DENDRODELUSIONEFFECT);
		}
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem() == GenshinNatureModItems.PYROVISION.get()) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(GenshinNatureModMobEffects.PYROVISIONEFFECT, 99999, 0));
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.HYDROVISIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.ANEMOVISIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.ELECTROVISIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.CRYOVISIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.GEOVISIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.DENDROVISIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.ANEMODELUSIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.CRYODELUSIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.ELECTRODELUSIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.GEODELUSIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.HYDRODELUSIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.PYRODELUSIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.DENDRODELUSIONEFFECT);
		}
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem() == GenshinNatureModItems.HYDROVISION.get()) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(GenshinNatureModMobEffects.HYDROVISIONEFFECT, 99999, 0));
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.PYROVISIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.ANEMOVISIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.ELECTROVISIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.CRYOVISIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.GEOVISIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.DENDROVISIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.ANEMODELUSIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.CRYODELUSIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.ELECTRODELUSIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.GEODELUSIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.HYDRODELUSIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.PYRODELUSIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.DENDRODELUSIONEFFECT);
		}
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem() == GenshinNatureModItems.ANEMOVISION.get()) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(GenshinNatureModMobEffects.ANEMOVISIONEFFECT, 99999, 0));
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.PYROVISIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.HYDROVISIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.ELECTROVISIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.CRYOVISIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.GEOVISIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.DENDROVISIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.ANEMODELUSIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.CRYODELUSIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.ELECTRODELUSIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.GEODELUSIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.HYDRODELUSIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.PYRODELUSIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.DENDRODELUSIONEFFECT);
		}
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem() == GenshinNatureModItems.ELECTROVISION
				.get()) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(GenshinNatureModMobEffects.ELECTROVISIONEFFECT, 99999, 0));
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.PYROVISIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.HYDROVISIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.ANEMOVISIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.CRYOVISIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.GEOVISIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.DENDROVISIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.ANEMODELUSIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.CRYODELUSIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.ELECTRODELUSIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.GEODELUSIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.HYDRODELUSIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.PYRODELUSIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.DENDRODELUSIONEFFECT);
		}
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem() == GenshinNatureModItems.CRYOVISION.get()) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(GenshinNatureModMobEffects.CRYOVISIONEFFECT, 99999, 0));
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.PYROVISIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.HYDROVISIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.ANEMOVISIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.ELECTROVISIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.GEOVISIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.DENDROVISIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.ANEMODELUSIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.CRYODELUSIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.ELECTRODELUSIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.GEODELUSIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.HYDRODELUSIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.PYRODELUSIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.DENDRODELUSIONEFFECT);
		}
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem() == GenshinNatureModItems.GEOVISION.get()) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(GenshinNatureModMobEffects.GEOVISIONEFFECT, 99999, 0));
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.PYROVISIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.HYDROVISIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.ANEMOVISIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.ELECTROVISIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.CRYOVISIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.DENDROVISIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.ANEMODELUSIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.CRYODELUSIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.ELECTRODELUSIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.GEODELUSIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.HYDRODELUSIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.PYRODELUSIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.DENDRODELUSIONEFFECT);
		}
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem() == GenshinNatureModItems.DENDROVISION.get()) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(GenshinNatureModMobEffects.DENDROVISIONEFFECT, 99999, 0));
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.PYROVISIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.HYDROVISIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.ANEMOVISIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.ELECTROVISIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.CRYOVISIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.GEOVISIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.ANEMODELUSIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.CRYODELUSIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.ELECTRODELUSIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.GEODELUSIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.HYDRODELUSIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.PYRODELUSIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.DENDRODELUSIONEFFECT);
		}
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem() == GenshinNatureModItems.ANEMODELUSION
				.get()) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(GenshinNatureModMobEffects.ANEMODELUSIONEFFECT, 99999, 0));
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.PYROVISIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.HYDROVISIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.ANEMOVISIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.ELECTROVISIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.CRYOVISIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.GEOVISIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.DENDROVISIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.CRYODELUSIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.ELECTRODELUSIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.GEODELUSIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.HYDRODELUSIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.PYRODELUSIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.DENDRODELUSIONEFFECT);
		}
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem() == GenshinNatureModItems.CRYODELUSION.get()) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(GenshinNatureModMobEffects.CRYODELUSIONEFFECT, 99999, 0));
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.PYROVISIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.HYDROVISIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.ANEMOVISIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.ELECTROVISIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.CRYOVISIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.GEOVISIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.DENDROVISIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.ANEMODELUSIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.ELECTRODELUSIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.GEODELUSIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.HYDRODELUSIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.PYRODELUSIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.DENDRODELUSIONEFFECT);
		}
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem() == GenshinNatureModItems.ELECTRODELUSION
				.get()) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(GenshinNatureModMobEffects.ELECTRODELUSIONEFFECT, 99999, 0));
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.PYROVISIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.HYDROVISIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.ANEMOVISIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.ELECTROVISIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.CRYOVISIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.GEOVISIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.DENDROVISIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.ANEMODELUSIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.CRYODELUSIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.GEODELUSIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.HYDRODELUSIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.PYRODELUSIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.DENDRODELUSIONEFFECT);
		}
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem() == GenshinNatureModItems.GEODELUSION.get()) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(GenshinNatureModMobEffects.GEODELUSIONEFFECT, 99999, 0));
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.PYROVISIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.HYDROVISIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.ANEMOVISIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.ELECTROVISIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.CRYOVISIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.GEOVISIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.DENDROVISIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.ANEMODELUSIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.CRYODELUSIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.ELECTRODELUSIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.HYDRODELUSIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.PYRODELUSIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.DENDRODELUSIONEFFECT);
		}
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem() == GenshinNatureModItems.HYDRODELUSION
				.get()) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(GenshinNatureModMobEffects.HYDRODELUSIONEFFECT, 99999, 0));
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.PYROVISIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.HYDROVISIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.ANEMOVISIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.ELECTROVISIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.CRYOVISIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.GEOVISIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.DENDROVISIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.ANEMODELUSIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.CRYODELUSIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.ELECTRODELUSIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.GEODELUSIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.PYRODELUSIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.DENDRODELUSIONEFFECT);
		}
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem() == GenshinNatureModItems.PYRODELUSION.get()) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(GenshinNatureModMobEffects.PYRODELUSIONEFFECT, 99999, 0));
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.PYROVISIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.HYDROVISIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.ANEMOVISIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.ELECTROVISIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.CRYOVISIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.GEOVISIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.DENDROVISIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.ANEMODELUSIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.CRYODELUSIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.ELECTRODELUSIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.GEODELUSIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.HYDRODELUSIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.DENDRODELUSIONEFFECT);
		}
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem() == GenshinNatureModItems.DENDRODELUSION
				.get()) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(GenshinNatureModMobEffects.DENDRODELUSIONEFFECT, 99999, 0));
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.PYROVISIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.HYDROVISIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.ANEMOVISIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.ELECTROVISIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.CRYOVISIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.GEOVISIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.DENDROVISIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.ANEMODELUSIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.CRYODELUSIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.ELECTRODELUSIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.GEODELUSIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.HYDRODELUSIONEFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(GenshinNatureModMobEffects.PYRODELUSIONEFFECT);
		}
	}
}

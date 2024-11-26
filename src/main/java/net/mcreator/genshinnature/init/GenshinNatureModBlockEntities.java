
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.genshinnature.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.capabilities.RegisterCapabilitiesEvent;
import net.neoforged.neoforge.capabilities.Capabilities;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;
import net.minecraft.core.registries.BuiltInRegistries;

import net.mcreator.genshinnature.block.entity.FishingblockBlockEntity;
import net.mcreator.genshinnature.block.entity.BloattyfloattyexplodedBlockEntity;
import net.mcreator.genshinnature.block.entity.ArtifactsblockBlockEntity;
import net.mcreator.genshinnature.GenshinNatureMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class GenshinNatureModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(BuiltInRegistries.BLOCK_ENTITY_TYPE, GenshinNatureMod.MODID);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> ARTIFACTSBLOCK = register("artifactsblock", GenshinNatureModBlocks.ARTIFACTSBLOCK, ArtifactsblockBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> FISHINGBLOCK = register("fishingblock", GenshinNatureModBlocks.FISHINGBLOCK, FishingblockBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> BLOATTYFLOATTYEXPLODED = register("bloattyfloattyexploded", GenshinNatureModBlocks.BLOATTYFLOATTYEXPLODED, BloattyfloattyexplodedBlockEntity::new);

	// Start of user code block custom block entities
	// End of user code block custom block entities
	private static DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> register(String registryname, DeferredHolder<Block, Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}

	@SubscribeEvent
	public static void registerCapabilities(RegisterCapabilitiesEvent event) {
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, ARTIFACTSBLOCK.get(), (blockEntity, side) -> ((ArtifactsblockBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, FISHINGBLOCK.get(), (blockEntity, side) -> ((FishingblockBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, BLOATTYFLOATTYEXPLODED.get(), (blockEntity, side) -> ((BloattyfloattyexplodedBlockEntity) blockEntity).getItemHandler());
	}
}

package net.mcreator.genshinnature.procedures;

import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class PlacegeohypostasispillarsProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof ServerLevel _serverworld) {
			StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("genshin_nature", "hypostasis_geo_pillar_fixed"));
			if (template != null) {
				template.placeInWorld(_serverworld, BlockPos.containing(x + 7, y, z), BlockPos.containing(x + 7, y, z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
			}
		}
		if (world instanceof ServerLevel _serverworld) {
			StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("genshin_nature", "hypostasis_geo_pillar_fixed"));
			if (template != null) {
				template.placeInWorld(_serverworld, BlockPos.containing(x - 7, y, z), BlockPos.containing(x - 7, y, z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
			}
		}
		if (world instanceof ServerLevel _serverworld) {
			StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("genshin_nature", "hypostasis_geo_pillar_fixed"));
			if (template != null) {
				template.placeInWorld(_serverworld, BlockPos.containing(x, y, z - 7), BlockPos.containing(x, y, z - 7), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
			}
		}
		if (world instanceof ServerLevel _serverworld) {
			StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("genshin_nature", "hypostasis_geo_pillar_fixed"));
			if (template != null) {
				template.placeInWorld(_serverworld, BlockPos.containing(x, y, z + 7), BlockPos.containing(x, y, z + 7), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
			}
		}
	}
}

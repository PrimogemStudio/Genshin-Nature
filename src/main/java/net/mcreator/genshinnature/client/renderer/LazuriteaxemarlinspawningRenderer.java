
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.LazuriteaxemarlinspawningEntity;
import net.mcreator.genshinnature.client.model.Modelaxe_marlin;

public class LazuriteaxemarlinspawningRenderer extends MobRenderer<LazuriteaxemarlinspawningEntity, Modelaxe_marlin<LazuriteaxemarlinspawningEntity>> {
	public LazuriteaxemarlinspawningRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelaxe_marlin<LazuriteaxemarlinspawningEntity>(context.bakeLayer(Modelaxe_marlin.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(LazuriteaxemarlinspawningEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/blank_texture.png");
	}
}

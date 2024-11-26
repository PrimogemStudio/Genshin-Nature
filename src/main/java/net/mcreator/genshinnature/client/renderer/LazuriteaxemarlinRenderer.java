
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.LazuriteaxemarlinEntity;
import net.mcreator.genshinnature.client.model.Modelaxe_marlin;

public class LazuriteaxemarlinRenderer extends MobRenderer<LazuriteaxemarlinEntity, Modelaxe_marlin<LazuriteaxemarlinEntity>> {
	public LazuriteaxemarlinRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelaxe_marlin<LazuriteaxemarlinEntity>(context.bakeLayer(Modelaxe_marlin.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(LazuriteaxemarlinEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/lazurite_axe_marlin.png");
	}
}

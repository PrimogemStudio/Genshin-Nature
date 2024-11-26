
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.DivdarayspawningEntity;
import net.mcreator.genshinnature.client.model.Modelray;

public class DivdarayspawningRenderer extends MobRenderer<DivdarayspawningEntity, Modelray<DivdarayspawningEntity>> {
	public DivdarayspawningRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelray<DivdarayspawningEntity>(context.bakeLayer(Modelray.LAYER_LOCATION)), 1.2f);
	}

	@Override
	public ResourceLocation getTextureLocation(DivdarayspawningEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/blank_texture.png");
	}
}

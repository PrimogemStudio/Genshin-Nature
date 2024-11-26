
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.RaimeiangelfishspawningEntity;
import net.mcreator.genshinnature.client.model.Modelshirakodai;

public class RaimeiangelfishspawningRenderer extends MobRenderer<RaimeiangelfishspawningEntity, Modelshirakodai<RaimeiangelfishspawningEntity>> {
	public RaimeiangelfishspawningRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelshirakodai<RaimeiangelfishspawningEntity>(context.bakeLayer(Modelshirakodai.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(RaimeiangelfishspawningEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/blank_texture.png");
	}
}

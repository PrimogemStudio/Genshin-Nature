
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.BluebutterflyEntity;
import net.mcreator.genshinnature.client.model.Modelbutterfly;

public class BluebutterflyRenderer extends MobRenderer<BluebutterflyEntity, Modelbutterfly<BluebutterflyEntity>> {
	public BluebutterflyRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelbutterfly<BluebutterflyEntity>(context.bakeLayer(Modelbutterfly.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(BluebutterflyEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/blue_butterfly.png");
	}
}

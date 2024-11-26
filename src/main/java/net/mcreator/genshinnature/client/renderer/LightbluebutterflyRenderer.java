
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.LightbluebutterflyEntity;
import net.mcreator.genshinnature.client.model.Modelbutterfly;

public class LightbluebutterflyRenderer extends MobRenderer<LightbluebutterflyEntity, Modelbutterfly<LightbluebutterflyEntity>> {
	public LightbluebutterflyRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelbutterfly<LightbluebutterflyEntity>(context.bakeLayer(Modelbutterfly.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(LightbluebutterflyEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/lightblue_butterfly.png");
	}
}

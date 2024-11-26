
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.MiniseelieroseEntity;
import net.mcreator.genshinnature.client.model.Modelmini_seelie;

public class MiniseelieroseRenderer extends MobRenderer<MiniseelieroseEntity, Modelmini_seelie<MiniseelieroseEntity>> {
	public MiniseelieroseRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmini_seelie<MiniseelieroseEntity>(context.bakeLayer(Modelmini_seelie.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(MiniseelieroseEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/mini_seelie_rose.png");
	}
}

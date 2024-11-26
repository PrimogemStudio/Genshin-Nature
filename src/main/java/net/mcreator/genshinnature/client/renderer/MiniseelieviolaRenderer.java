
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.MiniseelieviolaEntity;
import net.mcreator.genshinnature.client.model.Modelmini_seelie;

public class MiniseelieviolaRenderer extends MobRenderer<MiniseelieviolaEntity, Modelmini_seelie<MiniseelieviolaEntity>> {
	public MiniseelieviolaRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmini_seelie<MiniseelieviolaEntity>(context.bakeLayer(Modelmini_seelie.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(MiniseelieviolaEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/mini_seelie_viola.png");
	}
}

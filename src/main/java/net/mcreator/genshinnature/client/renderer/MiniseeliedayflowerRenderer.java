
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.MiniseeliedayflowerEntity;
import net.mcreator.genshinnature.client.model.Modelmini_seelie;

public class MiniseeliedayflowerRenderer extends MobRenderer<MiniseeliedayflowerEntity, Modelmini_seelie<MiniseeliedayflowerEntity>> {
	public MiniseeliedayflowerRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmini_seelie<MiniseeliedayflowerEntity>(context.bakeLayer(Modelmini_seelie.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(MiniseeliedayflowerEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/mini_seelie_dayflower.png");
	}
}

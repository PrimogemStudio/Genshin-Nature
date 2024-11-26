
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.MiniseeliecurcumaEntity;
import net.mcreator.genshinnature.client.model.Modelmini_seelie;

public class MiniseeliecurcumaRenderer extends MobRenderer<MiniseeliecurcumaEntity, Modelmini_seelie<MiniseeliecurcumaEntity>> {
	public MiniseeliecurcumaRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmini_seelie<MiniseeliecurcumaEntity>(context.bakeLayer(Modelmini_seelie.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(MiniseeliecurcumaEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/mini_seelie_curcuma.png");
	}
}


package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.AramaEntity;
import net.mcreator.genshinnature.client.model.Modelarama;

public class AramaRenderer extends MobRenderer<AramaEntity, Modelarama<AramaEntity>> {
	public AramaRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelarama<AramaEntity>(context.bakeLayer(Modelarama.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(AramaEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/arama.png");
	}
}

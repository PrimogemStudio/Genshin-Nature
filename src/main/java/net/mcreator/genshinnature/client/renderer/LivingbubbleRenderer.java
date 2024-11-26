
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.LivingbubbleEntity;
import net.mcreator.genshinnature.client.model.Modelliving_bubble;

public class LivingbubbleRenderer extends MobRenderer<LivingbubbleEntity, Modelliving_bubble<LivingbubbleEntity>> {
	public LivingbubbleRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelliving_bubble<LivingbubbleEntity>(context.bakeLayer(Modelliving_bubble.LAYER_LOCATION)), 0.7f);
	}

	@Override
	public ResourceLocation getTextureLocation(LivingbubbleEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/living_bubble.png");
	}
}

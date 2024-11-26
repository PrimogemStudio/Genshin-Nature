
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.FloattybubbleEntity;
import net.mcreator.genshinnature.client.model.Modelfloatty_bubble;

public class FloattybubbleRenderer extends MobRenderer<FloattybubbleEntity, Modelfloatty_bubble<FloattybubbleEntity>> {
	public FloattybubbleRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelfloatty_bubble<FloattybubbleEntity>(context.bakeLayer(Modelfloatty_bubble.LAYER_LOCATION)), 1f);
	}

	@Override
	public ResourceLocation getTextureLocation(FloattybubbleEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/floatty_bubble.png");
	}
}

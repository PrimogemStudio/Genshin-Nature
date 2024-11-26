
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.ShadowyhusklinebreakerEntity;
import net.mcreator.genshinnature.client.model.Modelshadowy_husk_fixed;

public class ShadowyhusklinebreakerRenderer extends MobRenderer<ShadowyhusklinebreakerEntity, Modelshadowy_husk_fixed<ShadowyhusklinebreakerEntity>> {
	public ShadowyhusklinebreakerRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelshadowy_husk_fixed<ShadowyhusklinebreakerEntity>(context.bakeLayer(Modelshadowy_husk_fixed.LAYER_LOCATION)), 1f);
	}

	@Override
	public ResourceLocation getTextureLocation(ShadowyhusklinebreakerEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/shadowy_husk_line_breaker.png");
	}
}

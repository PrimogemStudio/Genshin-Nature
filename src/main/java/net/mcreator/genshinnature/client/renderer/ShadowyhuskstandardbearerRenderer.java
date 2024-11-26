
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.ShadowyhuskstandardbearerEntity;
import net.mcreator.genshinnature.client.model.Modelshadowy_husk_fixed;

public class ShadowyhuskstandardbearerRenderer extends MobRenderer<ShadowyhuskstandardbearerEntity, Modelshadowy_husk_fixed<ShadowyhuskstandardbearerEntity>> {
	public ShadowyhuskstandardbearerRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelshadowy_husk_fixed<ShadowyhuskstandardbearerEntity>(context.bakeLayer(Modelshadowy_husk_fixed.LAYER_LOCATION)), 1f);
	}

	@Override
	public ResourceLocation getTextureLocation(ShadowyhuskstandardbearerEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/shadowy_husk_standard_bearer.png");
	}
}

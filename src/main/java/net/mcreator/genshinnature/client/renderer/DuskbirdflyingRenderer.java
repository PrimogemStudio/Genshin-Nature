
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.DuskbirdflyingEntity;
import net.mcreator.genshinnature.client.model.Modeldusk_bird_flying;

public class DuskbirdflyingRenderer extends MobRenderer<DuskbirdflyingEntity, Modeldusk_bird_flying<DuskbirdflyingEntity>> {
	public DuskbirdflyingRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeldusk_bird_flying<DuskbirdflyingEntity>(context.bakeLayer(Modeldusk_bird_flying.LAYER_LOCATION)), 0.7f);
	}

	@Override
	public ResourceLocation getTextureLocation(DuskbirdflyingEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/dusk_bird.png");
	}
}

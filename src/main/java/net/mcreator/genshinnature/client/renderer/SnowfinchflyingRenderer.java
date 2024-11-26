
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.SnowfinchflyingEntity;
import net.mcreator.genshinnature.client.model.Modelfinches_flying;

public class SnowfinchflyingRenderer extends MobRenderer<SnowfinchflyingEntity, Modelfinches_flying<SnowfinchflyingEntity>> {
	public SnowfinchflyingRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelfinches_flying<SnowfinchflyingEntity>(context.bakeLayer(Modelfinches_flying.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(SnowfinchflyingEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/snow_finch.png");
	}
}

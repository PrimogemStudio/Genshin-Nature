
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.GoldenfinchflyingEntity;
import net.mcreator.genshinnature.client.model.Modelfinches_flying;

public class GoldenfinchflyingRenderer extends MobRenderer<GoldenfinchflyingEntity, Modelfinches_flying<GoldenfinchflyingEntity>> {
	public GoldenfinchflyingRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelfinches_flying<GoldenfinchflyingEntity>(context.bakeLayer(Modelfinches_flying.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(GoldenfinchflyingEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/golden_finch.png");
	}
}

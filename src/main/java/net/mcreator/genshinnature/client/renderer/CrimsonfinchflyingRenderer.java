
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.CrimsonfinchflyingEntity;
import net.mcreator.genshinnature.client.model.Modelfinches_flying;

public class CrimsonfinchflyingRenderer extends MobRenderer<CrimsonfinchflyingEntity, Modelfinches_flying<CrimsonfinchflyingEntity>> {
	public CrimsonfinchflyingRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelfinches_flying<CrimsonfinchflyingEntity>(context.bakeLayer(Modelfinches_flying.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(CrimsonfinchflyingEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/crimson_finch.png");
	}
}

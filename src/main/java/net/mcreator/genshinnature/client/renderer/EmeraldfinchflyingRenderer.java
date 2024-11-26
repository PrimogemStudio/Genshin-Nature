
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.EmeraldfinchflyingEntity;
import net.mcreator.genshinnature.client.model.Modelfinches_flying;

public class EmeraldfinchflyingRenderer extends MobRenderer<EmeraldfinchflyingEntity, Modelfinches_flying<EmeraldfinchflyingEntity>> {
	public EmeraldfinchflyingRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelfinches_flying<EmeraldfinchflyingEntity>(context.bakeLayer(Modelfinches_flying.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(EmeraldfinchflyingEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/emerald_finch.png");
	}
}


package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.GoldenfinchEntity;
import net.mcreator.genshinnature.client.model.Modelfinches;

public class GoldenfinchRenderer extends MobRenderer<GoldenfinchEntity, Modelfinches<GoldenfinchEntity>> {
	public GoldenfinchRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelfinches<GoldenfinchEntity>(context.bakeLayer(Modelfinches.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(GoldenfinchEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/golden_finch.png");
	}
}

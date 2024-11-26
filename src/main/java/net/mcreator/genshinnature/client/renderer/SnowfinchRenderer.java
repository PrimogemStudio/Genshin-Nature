
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.SnowfinchEntity;
import net.mcreator.genshinnature.client.model.Modelfinches;

public class SnowfinchRenderer extends MobRenderer<SnowfinchEntity, Modelfinches<SnowfinchEntity>> {
	public SnowfinchRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelfinches<SnowfinchEntity>(context.bakeLayer(Modelfinches.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(SnowfinchEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/snow_finch.png");
	}
}

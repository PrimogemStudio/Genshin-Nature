
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.CrimsonfinchEntity;
import net.mcreator.genshinnature.client.model.Modelfinches;

public class CrimsonfinchRenderer extends MobRenderer<CrimsonfinchEntity, Modelfinches<CrimsonfinchEntity>> {
	public CrimsonfinchRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelfinches<CrimsonfinchEntity>(context.bakeLayer(Modelfinches.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(CrimsonfinchEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/crimson_finch.png");
	}
}

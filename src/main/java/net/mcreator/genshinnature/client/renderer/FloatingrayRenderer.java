
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.FloatingrayEntity;
import net.mcreator.genshinnature.client.model.Modelray;

public class FloatingrayRenderer extends MobRenderer<FloatingrayEntity, Modelray<FloatingrayEntity>> {
	public FloatingrayRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelray<FloatingrayEntity>(context.bakeLayer(Modelray.LAYER_LOCATION)), 1.2f);
	}

	@Override
	public ResourceLocation getTextureLocation(FloatingrayEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/floating_ray.png");
	}
}

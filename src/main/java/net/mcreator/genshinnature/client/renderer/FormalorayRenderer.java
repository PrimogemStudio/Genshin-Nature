
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.FormalorayEntity;
import net.mcreator.genshinnature.client.model.Modelray;

public class FormalorayRenderer extends MobRenderer<FormalorayEntity, Modelray<FormalorayEntity>> {
	public FormalorayRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelray<FormalorayEntity>(context.bakeLayer(Modelray.LAYER_LOCATION)), 1.2f);
	}

	@Override
	public ResourceLocation getTextureLocation(FormalorayEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/divda_ray.png");
	}
}

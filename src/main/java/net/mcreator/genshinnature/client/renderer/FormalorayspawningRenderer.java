
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.FormalorayspawningEntity;
import net.mcreator.genshinnature.client.model.Modelray;

public class FormalorayspawningRenderer extends MobRenderer<FormalorayspawningEntity, Modelray<FormalorayspawningEntity>> {
	public FormalorayspawningRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelray<FormalorayspawningEntity>(context.bakeLayer(Modelray.LAYER_LOCATION)), 1.2f);
	}

	@Override
	public ResourceLocation getTextureLocation(FormalorayspawningEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/blank_texture.png");
	}
}

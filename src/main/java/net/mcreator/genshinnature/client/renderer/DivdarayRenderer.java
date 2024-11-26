
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.DivdarayEntity;
import net.mcreator.genshinnature.client.model.Modelray;

public class DivdarayRenderer extends MobRenderer<DivdarayEntity, Modelray<DivdarayEntity>> {
	public DivdarayRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelray<DivdarayEntity>(context.bakeLayer(Modelray.LAYER_LOCATION)), 1.2f);
	}

	@Override
	public ResourceLocation getTextureLocation(DivdarayEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/formalo_ray.png");
	}
}

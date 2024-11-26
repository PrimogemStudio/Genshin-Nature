
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.UmbertailfalconEntity;
import net.mcreator.genshinnature.client.model.Modelfalcon;

public class UmbertailfalconRenderer extends MobRenderer<UmbertailfalconEntity, Modelfalcon<UmbertailfalconEntity>> {
	public UmbertailfalconRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelfalcon<UmbertailfalconEntity>(context.bakeLayer(Modelfalcon.LAYER_LOCATION)), 0.7f);
	}

	@Override
	public ResourceLocation getTextureLocation(UmbertailfalconEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/umbertail_falcon.png");
	}
}

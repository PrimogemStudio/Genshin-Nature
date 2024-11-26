
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.UmbertailfalconflyingEntity;
import net.mcreator.genshinnature.client.model.Modelfalcon_flying;

public class UmbertailfalconflyingRenderer extends MobRenderer<UmbertailfalconflyingEntity, Modelfalcon_flying<UmbertailfalconflyingEntity>> {
	public UmbertailfalconflyingRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelfalcon_flying<UmbertailfalconflyingEntity>(context.bakeLayer(Modelfalcon_flying.LAYER_LOCATION)), 0.7f);
	}

	@Override
	public ResourceLocation getTextureLocation(UmbertailfalconflyingEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/umbertail_falcon.png");
	}
}

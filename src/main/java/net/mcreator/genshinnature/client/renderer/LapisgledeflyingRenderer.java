
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.LapisgledeflyingEntity;
import net.mcreator.genshinnature.client.model.Modelfalcon_flying;

public class LapisgledeflyingRenderer extends MobRenderer<LapisgledeflyingEntity, Modelfalcon_flying<LapisgledeflyingEntity>> {
	public LapisgledeflyingRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelfalcon_flying<LapisgledeflyingEntity>(context.bakeLayer(Modelfalcon_flying.LAYER_LOCATION)), 0.7f);
	}

	@Override
	public ResourceLocation getTextureLocation(LapisgledeflyingEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/lapis_glede.png");
	}
}

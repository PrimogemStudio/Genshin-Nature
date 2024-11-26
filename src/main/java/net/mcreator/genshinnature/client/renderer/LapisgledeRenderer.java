
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.LapisgledeEntity;
import net.mcreator.genshinnature.client.model.Modelfalcon;

public class LapisgledeRenderer extends MobRenderer<LapisgledeEntity, Modelfalcon<LapisgledeEntity>> {
	public LapisgledeRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelfalcon<LapisgledeEntity>(context.bakeLayer(Modelfalcon.LAYER_LOCATION)), 0.7f);
	}

	@Override
	public ResourceLocation getTextureLocation(LapisgledeEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/lapis_glede.png");
	}
}

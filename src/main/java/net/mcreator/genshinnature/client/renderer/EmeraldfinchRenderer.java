
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.EmeraldfinchEntity;
import net.mcreator.genshinnature.client.model.Modelfinches;

public class EmeraldfinchRenderer extends MobRenderer<EmeraldfinchEntity, Modelfinches<EmeraldfinchEntity>> {
	public EmeraldfinchRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelfinches<EmeraldfinchEntity>(context.bakeLayer(Modelfinches.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(EmeraldfinchEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/emerald_finch.png");
	}
}

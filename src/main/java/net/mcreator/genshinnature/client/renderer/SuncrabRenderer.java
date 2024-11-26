
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.SuncrabEntity;
import net.mcreator.genshinnature.client.model.Modelcrab;

public class SuncrabRenderer extends MobRenderer<SuncrabEntity, Modelcrab<SuncrabEntity>> {
	public SuncrabRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcrab<SuncrabEntity>(context.bakeLayer(Modelcrab.LAYER_LOCATION)), 0.6f);
	}

	@Override
	public ResourceLocation getTextureLocation(SuncrabEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/sun_crab.png");
	}
}

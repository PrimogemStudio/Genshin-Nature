
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.RaimeiangelfishEntity;
import net.mcreator.genshinnature.client.model.Modelshirakodai;

public class RaimeiangelfishRenderer extends MobRenderer<RaimeiangelfishEntity, Modelshirakodai<RaimeiangelfishEntity>> {
	public RaimeiangelfishRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelshirakodai<RaimeiangelfishEntity>(context.bakeLayer(Modelshirakodai.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(RaimeiangelfishEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/raimei_angelfish.png");
	}
}

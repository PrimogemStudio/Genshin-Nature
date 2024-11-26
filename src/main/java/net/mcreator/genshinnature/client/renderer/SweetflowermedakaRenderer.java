
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.SweetflowermedakaEntity;
import net.mcreator.genshinnature.client.model.Modelmedaka;

public class SweetflowermedakaRenderer extends MobRenderer<SweetflowermedakaEntity, Modelmedaka<SweetflowermedakaEntity>> {
	public SweetflowermedakaRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmedaka<SweetflowermedakaEntity>(context.bakeLayer(Modelmedaka.LAYER_LOCATION)), 0.6f);
	}

	@Override
	public ResourceLocation getTextureLocation(SweetflowermedakaEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/sweet_flower_medaka.png");
	}
}

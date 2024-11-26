
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.GlazemedakaEntity;
import net.mcreator.genshinnature.client.model.Modelmedaka;

public class GlazemedakaRenderer extends MobRenderer<GlazemedakaEntity, Modelmedaka<GlazemedakaEntity>> {
	public GlazemedakaRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmedaka<GlazemedakaEntity>(context.bakeLayer(Modelmedaka.LAYER_LOCATION)), 0.6f);
	}

	@Override
	public ResourceLocation getTextureLocation(GlazemedakaEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/glaze_medaka.png");
	}
}


package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.AizenmedakaEntity;
import net.mcreator.genshinnature.client.model.Modelmedaka;

public class AizenmedakaRenderer extends MobRenderer<AizenmedakaEntity, Modelmedaka<AizenmedakaEntity>> {
	public AizenmedakaRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmedaka<AizenmedakaEntity>(context.bakeLayer(Modelmedaka.LAYER_LOCATION)), 0.6f);
	}

	@Override
	public ResourceLocation getTextureLocation(AizenmedakaEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/aizen_medaka.png");
	}
}

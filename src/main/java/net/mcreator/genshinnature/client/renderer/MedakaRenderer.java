
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.MedakaEntity;
import net.mcreator.genshinnature.client.model.Modelmedaka;

public class MedakaRenderer extends MobRenderer<MedakaEntity, Modelmedaka<MedakaEntity>> {
	public MedakaRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmedaka<MedakaEntity>(context.bakeLayer(Modelmedaka.LAYER_LOCATION)), 0.6f);
	}

	@Override
	public ResourceLocation getTextureLocation(MedakaEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/medaka.png");
	}
}


package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.GeneralcrabEntity;
import net.mcreator.genshinnature.client.model.Modelcrab;

public class GeneralcrabRenderer extends MobRenderer<GeneralcrabEntity, Modelcrab<GeneralcrabEntity>> {
	public GeneralcrabRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcrab<GeneralcrabEntity>(context.bakeLayer(Modelcrab.LAYER_LOCATION)), 0.6f);
	}

	@Override
	public ResourceLocation getTextureLocation(GeneralcrabEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/general_crab.png");
	}
}


package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.GoldencrabEntity;
import net.mcreator.genshinnature.client.model.Modelcrab;

public class GoldencrabRenderer extends MobRenderer<GoldencrabEntity, Modelcrab<GoldencrabEntity>> {
	public GoldencrabRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcrab<GoldencrabEntity>(context.bakeLayer(Modelcrab.LAYER_LOCATION)), 0.6f);
	}

	@Override
	public ResourceLocation getTextureLocation(GoldencrabEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/golden_crab.png");
	}
}


package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.mcreator.genshinnature.entity.LightbluebutterflyEntity;

public class LightbluebutterflyRenderer extends HumanoidMobRenderer<LightbluebutterflyEntity, HumanoidModel<LightbluebutterflyEntity>> {
	public LightbluebutterflyRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel<LightbluebutterflyEntity>(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));
	}

	@Override
	public ResourceLocation getTextureLocation(LightbluebutterflyEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/lightblue_butterfly.png");
	}
}


package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.mcreator.genshinnature.entity.SunsetcloudanglerEntity;

public class SunsetcloudanglerRenderer extends HumanoidMobRenderer<SunsetcloudanglerEntity, HumanoidModel<SunsetcloudanglerEntity>> {
	public SunsetcloudanglerRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel<SunsetcloudanglerEntity>(context.bakeLayer(ModelLayers.PLAYER)), 0.7f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));
	}

	@Override
	public ResourceLocation getTextureLocation(SunsetcloudanglerEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/sunset_cloud_angler.png");
	}
}

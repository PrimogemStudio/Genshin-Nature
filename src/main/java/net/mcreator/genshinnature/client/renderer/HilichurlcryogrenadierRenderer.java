
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.mcreator.genshinnature.entity.HilichurlcryogrenadierEntity;

public class HilichurlcryogrenadierRenderer extends HumanoidMobRenderer<HilichurlcryogrenadierEntity, HumanoidModel<HilichurlcryogrenadierEntity>> {
	public HilichurlcryogrenadierRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel<HilichurlcryogrenadierEntity>(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));
	}

	@Override
	public ResourceLocation getTextureLocation(HilichurlcryogrenadierEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/hilichurl_cryo_grenadier.png");
	}
}

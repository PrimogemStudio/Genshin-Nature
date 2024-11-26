
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.mcreator.genshinnature.entity.RuincruiserEntity;

public class RuincruiserRenderer extends HumanoidMobRenderer<RuincruiserEntity, HumanoidModel<RuincruiserEntity>> {
	public RuincruiserRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel<RuincruiserEntity>(context.bakeLayer(ModelLayers.PLAYER)), 1.1f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));
	}

	@Override
	public ResourceLocation getTextureLocation(RuincruiserEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/ruin_cruiser.png");
	}
}
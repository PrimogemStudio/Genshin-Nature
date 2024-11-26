
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.mcreator.genshinnature.entity.Geohypostasisphase7Entity;

public class Geohypostasisphase7Renderer extends HumanoidMobRenderer<Geohypostasisphase7Entity, HumanoidModel<Geohypostasisphase7Entity>> {
	public Geohypostasisphase7Renderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel<Geohypostasisphase7Entity>(context.bakeLayer(ModelLayers.PLAYER)), 2f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));
	}

	@Override
	public ResourceLocation getTextureLocation(Geohypostasisphase7Entity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/geo_hypostasis_hands.png");
	}
}

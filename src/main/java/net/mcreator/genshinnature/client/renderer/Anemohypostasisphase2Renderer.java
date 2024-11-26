
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.mcreator.genshinnature.entity.Anemohypostasisphase2Entity;

public class Anemohypostasisphase2Renderer extends HumanoidMobRenderer<Anemohypostasisphase2Entity, HumanoidModel<Anemohypostasisphase2Entity>> {
	public Anemohypostasisphase2Renderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel<Anemohypostasisphase2Entity>(context.bakeLayer(ModelLayers.PLAYER)), 2f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));
	}

	@Override
	public ResourceLocation getTextureLocation(Anemohypostasisphase2Entity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/anemo_hypostasis_butterfly.png");
	}
}
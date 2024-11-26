
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.mcreator.genshinnature.entity.Electrohypostasisphase3Entity;

public class Electrohypostasisphase3Renderer extends HumanoidMobRenderer<Electrohypostasisphase3Entity, HumanoidModel<Electrohypostasisphase3Entity>> {
	public Electrohypostasisphase3Renderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel<Electrohypostasisphase3Entity>(context.bakeLayer(ModelLayers.PLAYER)), 2f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));
	}

	@Override
	public ResourceLocation getTextureLocation(Electrohypostasisphase3Entity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/electro_hypostasis_hands.png");
	}
}


package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.mcreator.genshinnature.entity.Cryohypostasisphase5Entity;

public class Cryohypostasisphase5Renderer extends HumanoidMobRenderer<Cryohypostasisphase5Entity, HumanoidModel<Cryohypostasisphase5Entity>> {
	public Cryohypostasisphase5Renderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel<Cryohypostasisphase5Entity>(context.bakeLayer(ModelLayers.PLAYER)), 1f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));
	}

	@Override
	public ResourceLocation getTextureLocation(Cryohypostasisphase5Entity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/cryo_hypostasis_icicles.png");
	}
}

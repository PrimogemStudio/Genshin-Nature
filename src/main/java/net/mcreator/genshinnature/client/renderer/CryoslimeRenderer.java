
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.mcreator.genshinnature.entity.CryoslimeEntity;

public class CryoslimeRenderer extends HumanoidMobRenderer<CryoslimeEntity, HumanoidModel<CryoslimeEntity>> {
	public CryoslimeRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel<CryoslimeEntity>(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));
	}

	@Override
	public ResourceLocation getTextureLocation(CryoslimeEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/cryoslime.png");
	}
}

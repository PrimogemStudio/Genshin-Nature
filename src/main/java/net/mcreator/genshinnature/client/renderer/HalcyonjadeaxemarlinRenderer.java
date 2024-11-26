
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.mcreator.genshinnature.entity.HalcyonjadeaxemarlinEntity;

public class HalcyonjadeaxemarlinRenderer extends HumanoidMobRenderer<HalcyonjadeaxemarlinEntity, HumanoidModel<HalcyonjadeaxemarlinEntity>> {
	public HalcyonjadeaxemarlinRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel<HalcyonjadeaxemarlinEntity>(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));
	}

	@Override
	public ResourceLocation getTextureLocation(HalcyonjadeaxemarlinEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/halcyon_jade_axe_marlin.png");
	}
}

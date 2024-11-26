
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.mcreator.genshinnature.entity.RuindefenderEntity;

public class RuindefenderRenderer extends HumanoidMobRenderer<RuindefenderEntity, HumanoidModel<RuindefenderEntity>> {
	public RuindefenderRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel<RuindefenderEntity>(context.bakeLayer(ModelLayers.PLAYER)), 1.2f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));
	}

	@Override
	public ResourceLocation getTextureLocation(RuindefenderEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/ruin_defender.png");
	}
}

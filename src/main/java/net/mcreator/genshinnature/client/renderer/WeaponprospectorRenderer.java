
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.mcreator.genshinnature.entity.WeaponprospectorEntity;

public class WeaponprospectorRenderer extends HumanoidMobRenderer<WeaponprospectorEntity, HumanoidModel<WeaponprospectorEntity>> {
	public WeaponprospectorRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel<WeaponprospectorEntity>(context.bakeLayer(ModelLayers.PLAYER)), 0.4f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));
	}

	@Override
	public ResourceLocation getTextureLocation(WeaponprospectorEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/primal_construct_prospector.png");
	}
}

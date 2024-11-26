
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.mcreator.genshinnature.entity.Perpetualmechanicalarrayphase2Entity;

public class Perpetualmechanicalarrayphase2Renderer extends HumanoidMobRenderer<Perpetualmechanicalarrayphase2Entity, HumanoidModel<Perpetualmechanicalarrayphase2Entity>> {
	public Perpetualmechanicalarrayphase2Renderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel<Perpetualmechanicalarrayphase2Entity>(context.bakeLayer(ModelLayers.PLAYER)), 1f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));
	}

	@Override
	public ResourceLocation getTextureLocation(Perpetualmechanicalarrayphase2Entity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/perpetual_mechanical_array.png");
	}
}

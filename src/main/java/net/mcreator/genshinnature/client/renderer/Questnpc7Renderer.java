
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.mcreator.genshinnature.entity.Questnpc7Entity;

public class Questnpc7Renderer extends HumanoidMobRenderer<Questnpc7Entity, HumanoidModel<Questnpc7Entity>> {
	public Questnpc7Renderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel<Questnpc7Entity>(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));
	}

	@Override
	public ResourceLocation getTextureLocation(Questnpc7Entity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/emperor21.png");
	}
}

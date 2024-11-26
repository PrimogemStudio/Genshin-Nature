
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.OnikabutoEntity;
import net.mcreator.genshinnature.client.model.Modelonikabuto;

public class OnikabutoRenderer extends MobRenderer<OnikabutoEntity, Modelonikabuto<OnikabutoEntity>> {
	public OnikabutoRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelonikabuto<OnikabutoEntity>(context.bakeLayer(Modelonikabuto.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(OnikabutoEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/onikabuto.png");
	}
}

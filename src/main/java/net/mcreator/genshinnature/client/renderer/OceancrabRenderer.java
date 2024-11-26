
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.OceancrabEntity;
import net.mcreator.genshinnature.client.model.Modelcrab;

public class OceancrabRenderer extends MobRenderer<OceancrabEntity, Modelcrab<OceancrabEntity>> {
	public OceancrabRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcrab<OceancrabEntity>(context.bakeLayer(Modelcrab.LAYER_LOCATION)), 0.6f);
	}

	@Override
	public ResourceLocation getTextureLocation(OceancrabEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/ocean_crab.png");
	}
}

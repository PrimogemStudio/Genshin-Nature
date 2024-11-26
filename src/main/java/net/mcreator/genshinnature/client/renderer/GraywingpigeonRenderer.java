
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.GraywingpigeonEntity;
import net.mcreator.genshinnature.client.model.Modelwhite_pigeon;

public class GraywingpigeonRenderer extends MobRenderer<GraywingpigeonEntity, Modelwhite_pigeon<GraywingpigeonEntity>> {
	public GraywingpigeonRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelwhite_pigeon<GraywingpigeonEntity>(context.bakeLayer(Modelwhite_pigeon.LAYER_LOCATION)), 0.6f);
	}

	@Override
	public ResourceLocation getTextureLocation(GraywingpigeonEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/graywing_pigeon.png");
	}
}

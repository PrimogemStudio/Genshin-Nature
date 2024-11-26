
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.GraywingpigeonflyingEntity;
import net.mcreator.genshinnature.client.model.Modelwhite_pigeon_flying;

public class GraywingpigeonflyingRenderer extends MobRenderer<GraywingpigeonflyingEntity, Modelwhite_pigeon_flying<GraywingpigeonflyingEntity>> {
	public GraywingpigeonflyingRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelwhite_pigeon_flying<GraywingpigeonflyingEntity>(context.bakeLayer(Modelwhite_pigeon_flying.LAYER_LOCATION)), 0.6f);
	}

	@Override
	public ResourceLocation getTextureLocation(GraywingpigeonflyingEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/graywing_pigeon.png");
	}
}

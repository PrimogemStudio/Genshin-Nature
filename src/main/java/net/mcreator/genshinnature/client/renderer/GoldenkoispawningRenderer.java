
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.GoldenkoispawningEntity;
import net.mcreator.genshinnature.client.model.Modelkois;

public class GoldenkoispawningRenderer extends MobRenderer<GoldenkoispawningEntity, Modelkois<GoldenkoispawningEntity>> {
	public GoldenkoispawningRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelkois<GoldenkoispawningEntity>(context.bakeLayer(Modelkois.LAYER_LOCATION)), 0.6f);
	}

	@Override
	public ResourceLocation getTextureLocation(GoldenkoispawningEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/blank_texture.png");
	}
}


package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.GoldenkoiEntity;
import net.mcreator.genshinnature.client.model.Modelkois;

public class GoldenkoiRenderer extends MobRenderer<GoldenkoiEntity, Modelkois<GoldenkoiEntity>> {
	public GoldenkoiRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelkois<GoldenkoiEntity>(context.bakeLayer(Modelkois.LAYER_LOCATION)), 0.6f);
	}

	@Override
	public ResourceLocation getTextureLocation(GoldenkoiEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/golden_koi.png");
	}
}


package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.PinkbutterflyEntity;
import net.mcreator.genshinnature.client.model.Modelbutterfly;

public class PinkbutterflyRenderer extends MobRenderer<PinkbutterflyEntity, Modelbutterfly<PinkbutterflyEntity>> {
	public PinkbutterflyRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelbutterfly<PinkbutterflyEntity>(context.bakeLayer(Modelbutterfly.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(PinkbutterflyEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/pink_butterfly.png");
	}
}

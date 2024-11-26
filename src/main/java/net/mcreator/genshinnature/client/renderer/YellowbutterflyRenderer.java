
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.YellowbutterflyEntity;
import net.mcreator.genshinnature.client.model.Modelbutterfly;

public class YellowbutterflyRenderer extends MobRenderer<YellowbutterflyEntity, Modelbutterfly<YellowbutterflyEntity>> {
	public YellowbutterflyRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelbutterfly<YellowbutterflyEntity>(context.bakeLayer(Modelbutterfly.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(YellowbutterflyEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/yellow_butterfly.png");
	}
}

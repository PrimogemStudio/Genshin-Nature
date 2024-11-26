
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.RustykoiEntity;
import net.mcreator.genshinnature.client.model.Modelkois;

public class RustykoiRenderer extends MobRenderer<RustykoiEntity, Modelkois<RustykoiEntity>> {
	public RustykoiRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelkois<RustykoiEntity>(context.bakeLayer(Modelkois.LAYER_LOCATION)), 0.6f);
	}

	@Override
	public ResourceLocation getTextureLocation(RustykoiEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/rusty_koi.png");
	}
}

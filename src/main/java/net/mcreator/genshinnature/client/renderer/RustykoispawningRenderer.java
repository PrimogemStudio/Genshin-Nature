
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.RustykoispawningEntity;
import net.mcreator.genshinnature.client.model.Modelkois;

public class RustykoispawningRenderer extends MobRenderer<RustykoispawningEntity, Modelkois<RustykoispawningEntity>> {
	public RustykoispawningRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelkois<RustykoispawningEntity>(context.bakeLayer(Modelkois.LAYER_LOCATION)), 0.6f);
	}

	@Override
	public ResourceLocation getTextureLocation(RustykoispawningEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/blank_texture.png");
	}
}

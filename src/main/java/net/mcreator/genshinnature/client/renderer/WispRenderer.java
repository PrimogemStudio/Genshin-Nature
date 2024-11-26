
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.WispEntity;
import net.mcreator.genshinnature.client.model.Modelwisp;

public class WispRenderer extends MobRenderer<WispEntity, Modelwisp<WispEntity>> {
	public WispRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelwisp<WispEntity>(context.bakeLayer(Modelwisp.LAYER_LOCATION)), 0.7f);
	}

	@Override
	public ResourceLocation getTextureLocation(WispEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/wisp.png");
	}
}

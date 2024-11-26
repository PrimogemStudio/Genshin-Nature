
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.WhitepigeonEntity;
import net.mcreator.genshinnature.client.model.Modelwhite_pigeon;

public class WhitepigeonRenderer extends MobRenderer<WhitepigeonEntity, Modelwhite_pigeon<WhitepigeonEntity>> {
	public WhitepigeonRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelwhite_pigeon<WhitepigeonEntity>(context.bakeLayer(Modelwhite_pigeon.LAYER_LOCATION)), 0.6f);
	}

	@Override
	public ResourceLocation getTextureLocation(WhitepigeonEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/white_pigeon.png");
	}
}

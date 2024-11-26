
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.WhitepigeonflyingEntity;
import net.mcreator.genshinnature.client.model.Modelwhite_pigeon_flying;

public class WhitepigeonflyingRenderer extends MobRenderer<WhitepigeonflyingEntity, Modelwhite_pigeon_flying<WhitepigeonflyingEntity>> {
	public WhitepigeonflyingRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelwhite_pigeon_flying<WhitepigeonflyingEntity>(context.bakeLayer(Modelwhite_pigeon_flying.LAYER_LOCATION)), 0.6f);
	}

	@Override
	public ResourceLocation getTextureLocation(WhitepigeonflyingEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/white_pigeon.png");
	}
}


package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.BlackkingpigeonflyingEntity;
import net.mcreator.genshinnature.client.model.Modelwhite_pigeon_flying;

public class BlackkingpigeonflyingRenderer extends MobRenderer<BlackkingpigeonflyingEntity, Modelwhite_pigeon_flying<BlackkingpigeonflyingEntity>> {
	public BlackkingpigeonflyingRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelwhite_pigeon_flying<BlackkingpigeonflyingEntity>(context.bakeLayer(Modelwhite_pigeon_flying.LAYER_LOCATION)), 0.6f);
	}

	@Override
	public ResourceLocation getTextureLocation(BlackkingpigeonflyingEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/black_king_pigeon.png");
	}
}

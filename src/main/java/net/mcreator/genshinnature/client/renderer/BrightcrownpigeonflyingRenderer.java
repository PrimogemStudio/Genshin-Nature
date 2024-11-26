
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.BrightcrownpigeonflyingEntity;
import net.mcreator.genshinnature.client.model.Modelwhite_pigeon_flying;

public class BrightcrownpigeonflyingRenderer extends MobRenderer<BrightcrownpigeonflyingEntity, Modelwhite_pigeon_flying<BrightcrownpigeonflyingEntity>> {
	public BrightcrownpigeonflyingRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelwhite_pigeon_flying<BrightcrownpigeonflyingEntity>(context.bakeLayer(Modelwhite_pigeon_flying.LAYER_LOCATION)), 0.6f);
	}

	@Override
	public ResourceLocation getTextureLocation(BrightcrownpigeonflyingEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/brightcrown_pigeon.png");
	}
}

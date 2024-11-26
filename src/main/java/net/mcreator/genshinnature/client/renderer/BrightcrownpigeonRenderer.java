
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.BrightcrownpigeonEntity;
import net.mcreator.genshinnature.client.model.Modelwhite_pigeon;

public class BrightcrownpigeonRenderer extends MobRenderer<BrightcrownpigeonEntity, Modelwhite_pigeon<BrightcrownpigeonEntity>> {
	public BrightcrownpigeonRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelwhite_pigeon<BrightcrownpigeonEntity>(context.bakeLayer(Modelwhite_pigeon.LAYER_LOCATION)), 0.6f);
	}

	@Override
	public ResourceLocation getTextureLocation(BrightcrownpigeonEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/brightcrown_pigeon.png");
	}
}

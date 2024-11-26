
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.ScarletbeakduckEntity;
import net.mcreator.genshinnature.client.model.Modelduck;

public class ScarletbeakduckRenderer extends MobRenderer<ScarletbeakduckEntity, Modelduck<ScarletbeakduckEntity>> {
	public ScarletbeakduckRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelduck<ScarletbeakduckEntity>(context.bakeLayer(Modelduck.LAYER_LOCATION)), 1f);
	}

	@Override
	public ResourceLocation getTextureLocation(ScarletbeakduckEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/scarletbeak_duck.png");
	}
}

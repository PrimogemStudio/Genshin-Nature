
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.SunsetcloudanglerEntity;
import net.mcreator.genshinnature.client.model.Modelangler_fish;

public class SunsetcloudanglerRenderer extends MobRenderer<SunsetcloudanglerEntity, Modelangler_fish<SunsetcloudanglerEntity>> {
	public SunsetcloudanglerRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelangler_fish<SunsetcloudanglerEntity>(context.bakeLayer(Modelangler_fish.LAYER_LOCATION)), 0.7f);
	}

	@Override
	public ResourceLocation getTextureLocation(SunsetcloudanglerEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/sunset_cloud_angler.png");
	}
}

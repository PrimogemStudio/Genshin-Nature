
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.SunsetcloudanglerspawningEntity;
import net.mcreator.genshinnature.client.model.Modelangler_fish;

public class SunsetcloudanglerspawningRenderer extends MobRenderer<SunsetcloudanglerspawningEntity, Modelangler_fish<SunsetcloudanglerspawningEntity>> {
	public SunsetcloudanglerspawningRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelangler_fish<SunsetcloudanglerspawningEntity>(context.bakeLayer(Modelangler_fish.LAYER_LOCATION)), 0.7f);
	}

	@Override
	public ResourceLocation getTextureLocation(SunsetcloudanglerspawningEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/blank_texture.png");
	}
}

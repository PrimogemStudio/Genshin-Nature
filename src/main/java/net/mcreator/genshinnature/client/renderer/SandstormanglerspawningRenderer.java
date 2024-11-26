
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.SandstormanglerspawningEntity;
import net.mcreator.genshinnature.client.model.Modelangler_fish;

public class SandstormanglerspawningRenderer extends MobRenderer<SandstormanglerspawningEntity, Modelangler_fish<SandstormanglerspawningEntity>> {
	public SandstormanglerspawningRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelangler_fish<SandstormanglerspawningEntity>(context.bakeLayer(Modelangler_fish.LAYER_LOCATION)), 0.7f);
	}

	@Override
	public ResourceLocation getTextureLocation(SandstormanglerspawningEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/blank_texture.png");
	}
}

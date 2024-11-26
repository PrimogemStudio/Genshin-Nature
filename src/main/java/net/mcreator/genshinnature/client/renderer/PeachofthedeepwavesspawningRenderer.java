
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.PeachofthedeepwavesspawningEntity;
import net.mcreator.genshinnature.client.model.Modelangler_fish;

public class PeachofthedeepwavesspawningRenderer extends MobRenderer<PeachofthedeepwavesspawningEntity, Modelangler_fish<PeachofthedeepwavesspawningEntity>> {
	public PeachofthedeepwavesspawningRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelangler_fish<PeachofthedeepwavesspawningEntity>(context.bakeLayer(Modelangler_fish.LAYER_LOCATION)), 0.7f);
	}

	@Override
	public ResourceLocation getTextureLocation(PeachofthedeepwavesspawningEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/blank_texture.png");
	}
}

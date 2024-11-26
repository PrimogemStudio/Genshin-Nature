
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.PeachofthedeepwavesEntity;
import net.mcreator.genshinnature.client.model.Modelangler_fish;

public class PeachofthedeepwavesRenderer extends MobRenderer<PeachofthedeepwavesEntity, Modelangler_fish<PeachofthedeepwavesEntity>> {
	public PeachofthedeepwavesRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelangler_fish<PeachofthedeepwavesEntity>(context.bakeLayer(Modelangler_fish.LAYER_LOCATION)), 0.7f);
	}

	@Override
	public ResourceLocation getTextureLocation(PeachofthedeepwavesEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/peach_of_the_deep_waves.png");
	}
}

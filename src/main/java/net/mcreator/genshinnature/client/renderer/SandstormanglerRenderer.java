
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.SandstormanglerEntity;
import net.mcreator.genshinnature.client.model.Modelangler_fish;

public class SandstormanglerRenderer extends MobRenderer<SandstormanglerEntity, Modelangler_fish<SandstormanglerEntity>> {
	public SandstormanglerRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelangler_fish<SandstormanglerEntity>(context.bakeLayer(Modelangler_fish.LAYER_LOCATION)), 0.7f);
	}

	@Override
	public ResourceLocation getTextureLocation(SandstormanglerEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/sandstorm_angler.png");
	}
}

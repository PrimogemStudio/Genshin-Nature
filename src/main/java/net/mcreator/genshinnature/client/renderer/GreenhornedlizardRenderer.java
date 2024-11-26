
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.GreenhornedlizardEntity;
import net.mcreator.genshinnature.client.model.Modellizard;

public class GreenhornedlizardRenderer extends MobRenderer<GreenhornedlizardEntity, Modellizard<GreenhornedlizardEntity>> {
	public GreenhornedlizardRenderer(EntityRendererProvider.Context context) {
		super(context, new Modellizard<GreenhornedlizardEntity>(context.bakeLayer(Modellizard.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(GreenhornedlizardEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/green_horned_lizard.png");
	}
}

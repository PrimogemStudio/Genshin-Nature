
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.RedhornedlizardEntity;
import net.mcreator.genshinnature.client.model.Modellizard;

public class RedhornedlizardRenderer extends MobRenderer<RedhornedlizardEntity, Modellizard<RedhornedlizardEntity>> {
	public RedhornedlizardRenderer(EntityRendererProvider.Context context) {
		super(context, new Modellizard<RedhornedlizardEntity>(context.bakeLayer(Modellizard.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(RedhornedlizardEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/red_horned_lizard.png");
	}
}

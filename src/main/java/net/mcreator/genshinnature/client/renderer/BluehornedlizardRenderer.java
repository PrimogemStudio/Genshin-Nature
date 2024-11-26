
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.BluehornedlizardEntity;
import net.mcreator.genshinnature.client.model.Modellizard;

public class BluehornedlizardRenderer extends MobRenderer<BluehornedlizardEntity, Modellizard<BluehornedlizardEntity>> {
	public BluehornedlizardRenderer(EntityRendererProvider.Context context) {
		super(context, new Modellizard<BluehornedlizardEntity>(context.bakeLayer(Modellizard.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(BluehornedlizardEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/blue_horned_lizard.png");
	}
}

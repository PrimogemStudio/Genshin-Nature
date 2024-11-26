
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.PithlizardEntity;
import net.mcreator.genshinnature.client.model.Modellizard;

public class PithlizardRenderer extends MobRenderer<PithlizardEntity, Modellizard<PithlizardEntity>> {
	public PithlizardRenderer(EntityRendererProvider.Context context) {
		super(context, new Modellizard<PithlizardEntity>(context.bakeLayer(Modellizard.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(PithlizardEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/pith_lizard.png");
	}
}

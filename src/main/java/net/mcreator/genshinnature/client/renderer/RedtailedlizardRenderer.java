
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.RedtailedlizardEntity;
import net.mcreator.genshinnature.client.model.Modellizard;

public class RedtailedlizardRenderer extends MobRenderer<RedtailedlizardEntity, Modellizard<RedtailedlizardEntity>> {
	public RedtailedlizardRenderer(EntityRendererProvider.Context context) {
		super(context, new Modellizard<RedtailedlizardEntity>(context.bakeLayer(Modellizard.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(RedtailedlizardEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/red_tailed_lizard.png");
	}
}

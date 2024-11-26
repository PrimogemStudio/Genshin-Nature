
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.RimebiterbathysmalvishaphatchlingEntity;
import net.mcreator.genshinnature.client.model.Modelrimebiter_bathysmal_vishap_hatchling;

public class RimebiterbathysmalvishaphatchlingRenderer extends MobRenderer<RimebiterbathysmalvishaphatchlingEntity, Modelrimebiter_bathysmal_vishap_hatchling<RimebiterbathysmalvishaphatchlingEntity>> {
	public RimebiterbathysmalvishaphatchlingRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelrimebiter_bathysmal_vishap_hatchling<RimebiterbathysmalvishaphatchlingEntity>(context.bakeLayer(Modelrimebiter_bathysmal_vishap_hatchling.LAYER_LOCATION)), 1.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(RimebiterbathysmalvishaphatchlingEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/rimebiter_bathysmal_vishap_hatchling.png");
	}
}

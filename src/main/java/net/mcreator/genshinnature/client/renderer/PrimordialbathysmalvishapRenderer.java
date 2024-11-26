
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.PrimordialbathysmalvishapEntity;
import net.mcreator.genshinnature.client.model.Modelprimordial_bathysmal_vishap;

public class PrimordialbathysmalvishapRenderer extends MobRenderer<PrimordialbathysmalvishapEntity, Modelprimordial_bathysmal_vishap<PrimordialbathysmalvishapEntity>> {
	public PrimordialbathysmalvishapRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelprimordial_bathysmal_vishap<PrimordialbathysmalvishapEntity>(context.bakeLayer(Modelprimordial_bathysmal_vishap.LAYER_LOCATION)), 1.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(PrimordialbathysmalvishapEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/primordial_bathysmal_vishap.png");
	}
}

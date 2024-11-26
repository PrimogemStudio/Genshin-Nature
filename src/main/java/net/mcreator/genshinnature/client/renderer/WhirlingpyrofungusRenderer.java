
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.WhirlingpyrofungusEntity;
import net.mcreator.genshinnature.client.model.Modelwhirling_pyro_fungus_fixed;

public class WhirlingpyrofungusRenderer extends MobRenderer<WhirlingpyrofungusEntity, Modelwhirling_pyro_fungus_fixed<WhirlingpyrofungusEntity>> {
	public WhirlingpyrofungusRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelwhirling_pyro_fungus_fixed<WhirlingpyrofungusEntity>(context.bakeLayer(Modelwhirling_pyro_fungus_fixed.LAYER_LOCATION)), 0.6f);
	}

	@Override
	public ResourceLocation getTextureLocation(WhirlingpyrofungusEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/whirling_pyro_fungus_fixed.png");
	}
}

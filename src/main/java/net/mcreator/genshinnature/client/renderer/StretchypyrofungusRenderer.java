
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.StretchypyrofungusEntity;
import net.mcreator.genshinnature.client.model.Modelstretchy_pyro_fungus;

public class StretchypyrofungusRenderer extends MobRenderer<StretchypyrofungusEntity, Modelstretchy_pyro_fungus<StretchypyrofungusEntity>> {
	public StretchypyrofungusRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelstretchy_pyro_fungus<StretchypyrofungusEntity>(context.bakeLayer(Modelstretchy_pyro_fungus.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(StretchypyrofungusEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/stretchy_pyro_fungus.png");
	}
}

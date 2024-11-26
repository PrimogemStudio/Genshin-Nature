
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.StretchyelectrofungusEntity;
import net.mcreator.genshinnature.client.model.Modelstretchy_electro_fungus;

public class StretchyelectrofungusRenderer extends MobRenderer<StretchyelectrofungusEntity, Modelstretchy_electro_fungus<StretchyelectrofungusEntity>> {
	public StretchyelectrofungusRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelstretchy_electro_fungus<StretchyelectrofungusEntity>(context.bakeLayer(Modelstretchy_electro_fungus.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(StretchyelectrofungusEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/stretchy_electro_fungus.png");
	}
}


package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.StretchygeofungusEntity;
import net.mcreator.genshinnature.client.model.Modelstretchy_geo_fungus;

public class StretchygeofungusRenderer extends MobRenderer<StretchygeofungusEntity, Modelstretchy_geo_fungus<StretchygeofungusEntity>> {
	public StretchygeofungusRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelstretchy_geo_fungus<StretchygeofungusEntity>(context.bakeLayer(Modelstretchy_geo_fungus.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(StretchygeofungusEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/stretchy_geo_fungus.png");
	}
}

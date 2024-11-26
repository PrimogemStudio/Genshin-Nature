
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.StretchyanemofungusEntity;
import net.mcreator.genshinnature.client.model.Modelstretchy_anemo_fungus_updated;

public class StretchyanemofungusRenderer extends MobRenderer<StretchyanemofungusEntity, Modelstretchy_anemo_fungus_updated<StretchyanemofungusEntity>> {
	public StretchyanemofungusRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelstretchy_anemo_fungus_updated<StretchyanemofungusEntity>(context.bakeLayer(Modelstretchy_anemo_fungus_updated.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(StretchyanemofungusEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/stretchy_anemo_fungus_updated.png");
	}
}


package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.HydrodiscEntity;
import net.mcreator.genshinnature.client.model.Modelhydro_disc;

public class HydrodiscRenderer extends MobRenderer<HydrodiscEntity, Modelhydro_disc<HydrodiscEntity>> {
	public HydrodiscRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelhydro_disc<HydrodiscEntity>(context.bakeLayer(Modelhydro_disc.LAYER_LOCATION)), 0.3f);
	}

	@Override
	public ResourceLocation getTextureLocation(HydrodiscEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/hydro_disc.png");
	}
}

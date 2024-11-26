
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.HydrosamachurlEntity;
import net.mcreator.genshinnature.client.model.Modelsamachurl_hydro;

public class HydrosamachurlRenderer extends MobRenderer<HydrosamachurlEntity, Modelsamachurl_hydro<HydrosamachurlEntity>> {
	public HydrosamachurlRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelsamachurl_hydro<HydrosamachurlEntity>(context.bakeLayer(Modelsamachurl_hydro.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(HydrosamachurlEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/samachurl_hydro.png");
	}
}


package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.GeosamachurlEntity;
import net.mcreator.genshinnature.client.model.Modelsamachurl_geo;

public class GeosamachurlRenderer extends MobRenderer<GeosamachurlEntity, Modelsamachurl_geo<GeosamachurlEntity>> {
	public GeosamachurlRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelsamachurl_geo<GeosamachurlEntity>(context.bakeLayer(Modelsamachurl_geo.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(GeosamachurlEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/samachurl_geo.png");
	}
}

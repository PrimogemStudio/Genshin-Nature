
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.Geohypostasisphase7Entity;
import net.mcreator.genshinnature.client.model.Modelgeo_hypostasis_hands;

public class Geohypostasisphase7Renderer extends MobRenderer<Geohypostasisphase7Entity, Modelgeo_hypostasis_hands<Geohypostasisphase7Entity>> {
	public Geohypostasisphase7Renderer(EntityRendererProvider.Context context) {
		super(context, new Modelgeo_hypostasis_hands<Geohypostasisphase7Entity>(context.bakeLayer(Modelgeo_hypostasis_hands.LAYER_LOCATION)), 2f);
	}

	@Override
	public ResourceLocation getTextureLocation(Geohypostasisphase7Entity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/geo_hypostasis_hands.png");
	}
}

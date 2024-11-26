
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.Hydrohypostasisphase7Entity;
import net.mcreator.genshinnature.client.model.Modelgeo_hypostasis_phase2;

public class Hydrohypostasisphase7Renderer extends MobRenderer<Hydrohypostasisphase7Entity, Modelgeo_hypostasis_phase2<Hydrohypostasisphase7Entity>> {
	public Hydrohypostasisphase7Renderer(EntityRendererProvider.Context context) {
		super(context, new Modelgeo_hypostasis_phase2<Hydrohypostasisphase7Entity>(context.bakeLayer(Modelgeo_hypostasis_phase2.LAYER_LOCATION)), 0.4f);
	}

	@Override
	public ResourceLocation getTextureLocation(Hydrohypostasisphase7Entity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/waterminion_texture.png");
	}
}

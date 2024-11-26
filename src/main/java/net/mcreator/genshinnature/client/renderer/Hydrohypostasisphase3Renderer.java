
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.Hydrohypostasisphase3Entity;
import net.mcreator.genshinnature.client.model.Modelhydro_hypostasis_tornado;

public class Hydrohypostasisphase3Renderer extends MobRenderer<Hydrohypostasisphase3Entity, Modelhydro_hypostasis_tornado<Hydrohypostasisphase3Entity>> {
	public Hydrohypostasisphase3Renderer(EntityRendererProvider.Context context) {
		super(context, new Modelhydro_hypostasis_tornado<Hydrohypostasisphase3Entity>(context.bakeLayer(Modelhydro_hypostasis_tornado.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(Hydrohypostasisphase3Entity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/waterminion_texture.png");
	}
}

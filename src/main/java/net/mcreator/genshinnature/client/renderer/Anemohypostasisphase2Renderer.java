
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.Anemohypostasisphase2Entity;
import net.mcreator.genshinnature.client.model.Modelanemo_hypostasis_butterfly;

public class Anemohypostasisphase2Renderer extends MobRenderer<Anemohypostasisphase2Entity, Modelanemo_hypostasis_butterfly<Anemohypostasisphase2Entity>> {
	public Anemohypostasisphase2Renderer(EntityRendererProvider.Context context) {
		super(context, new Modelanemo_hypostasis_butterfly<Anemohypostasisphase2Entity>(context.bakeLayer(Modelanemo_hypostasis_butterfly.LAYER_LOCATION)), 2f);
	}

	@Override
	public ResourceLocation getTextureLocation(Anemohypostasisphase2Entity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/anemo_hypostasis_butterfly.png");
	}
}

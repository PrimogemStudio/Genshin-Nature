
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.Electrohypostasisphase3Entity;
import net.mcreator.genshinnature.client.model.Modelelectro_hypostasis_hands;

public class Electrohypostasisphase3Renderer extends MobRenderer<Electrohypostasisphase3Entity, Modelelectro_hypostasis_hands<Electrohypostasisphase3Entity>> {
	public Electrohypostasisphase3Renderer(EntityRendererProvider.Context context) {
		super(context, new Modelelectro_hypostasis_hands<Electrohypostasisphase3Entity>(context.bakeLayer(Modelelectro_hypostasis_hands.LAYER_LOCATION)), 2f);
	}

	@Override
	public ResourceLocation getTextureLocation(Electrohypostasisphase3Entity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/electro_hypostasis_hands.png");
	}
}

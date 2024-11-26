
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.Hydrohypostasisphase2Entity;
import net.mcreator.genshinnature.client.model.Modelhydro_hypostasis_dolphin;

public class Hydrohypostasisphase2Renderer extends MobRenderer<Hydrohypostasisphase2Entity, Modelhydro_hypostasis_dolphin<Hydrohypostasisphase2Entity>> {
	public Hydrohypostasisphase2Renderer(EntityRendererProvider.Context context) {
		super(context, new Modelhydro_hypostasis_dolphin<Hydrohypostasisphase2Entity>(context.bakeLayer(Modelhydro_hypostasis_dolphin.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(Hydrohypostasisphase2Entity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/waterminion_texture.png");
	}
}

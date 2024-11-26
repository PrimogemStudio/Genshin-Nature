
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.Hydrohypostasisphase5Entity;
import net.mcreator.genshinnature.client.model.Modelray;

public class Hydrohypostasisphase5Renderer extends MobRenderer<Hydrohypostasisphase5Entity, Modelray<Hydrohypostasisphase5Entity>> {
	public Hydrohypostasisphase5Renderer(EntityRendererProvider.Context context) {
		super(context, new Modelray<Hydrohypostasisphase5Entity>(context.bakeLayer(Modelray.LAYER_LOCATION)), 1.2f);
	}

	@Override
	public ResourceLocation getTextureLocation(Hydrohypostasisphase5Entity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/waterminion_texture.png");
	}
}


package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.Hydrohypostasisphase6Entity;
import net.mcreator.genshinnature.client.model.Modelhydroslime;

public class Hydrohypostasisphase6Renderer extends MobRenderer<Hydrohypostasisphase6Entity, Modelhydroslime<Hydrohypostasisphase6Entity>> {
	public Hydrohypostasisphase6Renderer(EntityRendererProvider.Context context) {
		super(context, new Modelhydroslime<Hydrohypostasisphase6Entity>(context.bakeLayer(Modelhydroslime.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(Hydrohypostasisphase6Entity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/waterminion_texture.png");
	}
}

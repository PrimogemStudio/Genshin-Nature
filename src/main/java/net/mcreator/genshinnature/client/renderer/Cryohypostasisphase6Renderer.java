
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.Cryohypostasisphase6Entity;
import net.mcreator.genshinnature.client.model.Modelcryo_hypostasis_clap;

public class Cryohypostasisphase6Renderer extends MobRenderer<Cryohypostasisphase6Entity, Modelcryo_hypostasis_clap<Cryohypostasisphase6Entity>> {
	public Cryohypostasisphase6Renderer(EntityRendererProvider.Context context) {
		super(context, new Modelcryo_hypostasis_clap<Cryohypostasisphase6Entity>(context.bakeLayer(Modelcryo_hypostasis_clap.LAYER_LOCATION)), 2f);
	}

	@Override
	public ResourceLocation getTextureLocation(Cryohypostasisphase6Entity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/cryo_hypostasis_clap.png");
	}
}


package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.Cryohypostasisphase5Entity;
import net.mcreator.genshinnature.client.model.Modelcryo_hypostasis_icicles;

public class Cryohypostasisphase5Renderer extends MobRenderer<Cryohypostasisphase5Entity, Modelcryo_hypostasis_icicles<Cryohypostasisphase5Entity>> {
	public Cryohypostasisphase5Renderer(EntityRendererProvider.Context context) {
		super(context, new Modelcryo_hypostasis_icicles<Cryohypostasisphase5Entity>(context.bakeLayer(Modelcryo_hypostasis_icicles.LAYER_LOCATION)), 1f);
	}

	@Override
	public ResourceLocation getTextureLocation(Cryohypostasisphase5Entity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/cryo_hypostasis_icicles.png");
	}
}

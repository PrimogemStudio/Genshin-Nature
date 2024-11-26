
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.PyroregisvineEntity;
import net.mcreator.genshinnature.client.model.Modelcryo_regisvine;

public class PyroregisvineRenderer extends MobRenderer<PyroregisvineEntity, Modelcryo_regisvine<PyroregisvineEntity>> {
	public PyroregisvineRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcryo_regisvine<PyroregisvineEntity>(context.bakeLayer(Modelcryo_regisvine.LAYER_LOCATION)), 4f);
	}

	@Override
	public ResourceLocation getTextureLocation(PyroregisvineEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/pyro_regisvine.png");
	}
}

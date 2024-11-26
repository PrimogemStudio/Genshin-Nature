
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.PurpleshirakodaispawningEntity;
import net.mcreator.genshinnature.client.model.Modelshirakodai;

public class PurpleshirakodaispawningRenderer extends MobRenderer<PurpleshirakodaispawningEntity, Modelshirakodai<PurpleshirakodaispawningEntity>> {
	public PurpleshirakodaispawningRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelshirakodai<PurpleshirakodaispawningEntity>(context.bakeLayer(Modelshirakodai.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(PurpleshirakodaispawningEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/blank_texture.png");
	}
}

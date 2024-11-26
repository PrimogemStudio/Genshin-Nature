
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.BrownshirakodaispawningEntity;
import net.mcreator.genshinnature.client.model.Modelshirakodai;

public class BrownshirakodaispawningRenderer extends MobRenderer<BrownshirakodaispawningEntity, Modelshirakodai<BrownshirakodaispawningEntity>> {
	public BrownshirakodaispawningRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelshirakodai<BrownshirakodaispawningEntity>(context.bakeLayer(Modelshirakodai.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(BrownshirakodaispawningEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/blank_texture.png");
	}
}

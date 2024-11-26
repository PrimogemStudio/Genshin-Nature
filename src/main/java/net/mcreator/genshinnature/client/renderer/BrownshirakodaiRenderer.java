
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.BrownshirakodaiEntity;
import net.mcreator.genshinnature.client.model.Modelshirakodai;

public class BrownshirakodaiRenderer extends MobRenderer<BrownshirakodaiEntity, Modelshirakodai<BrownshirakodaiEntity>> {
	public BrownshirakodaiRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelshirakodai<BrownshirakodaiEntity>(context.bakeLayer(Modelshirakodai.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(BrownshirakodaiEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/brown_shirakodai.png");
	}
}

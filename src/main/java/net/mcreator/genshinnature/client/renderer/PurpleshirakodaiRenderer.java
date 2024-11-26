
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.PurpleshirakodaiEntity;
import net.mcreator.genshinnature.client.model.Modelshirakodai;

public class PurpleshirakodaiRenderer extends MobRenderer<PurpleshirakodaiEntity, Modelshirakodai<PurpleshirakodaiEntity>> {
	public PurpleshirakodaiRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelshirakodai<PurpleshirakodaiEntity>(context.bakeLayer(Modelshirakodai.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(PurpleshirakodaiEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/purple_shirakodai.png");
	}
}

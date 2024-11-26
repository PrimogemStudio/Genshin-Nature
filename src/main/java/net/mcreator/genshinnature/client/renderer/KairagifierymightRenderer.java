
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.KairagifierymightEntity;
import net.mcreator.genshinnature.client.model.Modelkairagi;

public class KairagifierymightRenderer extends MobRenderer<KairagifierymightEntity, Modelkairagi<KairagifierymightEntity>> {
	public KairagifierymightRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelkairagi<KairagifierymightEntity>(context.bakeLayer(Modelkairagi.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(KairagifierymightEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/kairagi_fiery_might.png");
	}
}

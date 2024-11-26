
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.WitheringtumorEntity;
import net.mcreator.genshinnature.client.model.Modelwithering_tumor;

public class WitheringtumorRenderer extends MobRenderer<WitheringtumorEntity, Modelwithering_tumor<WitheringtumorEntity>> {
	public WitheringtumorRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelwithering_tumor<WitheringtumorEntity>(context.bakeLayer(Modelwithering_tumor.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(WitheringtumorEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/withering_tumor.png");
	}
}

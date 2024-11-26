
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.TeacoloredshirakodaiEntity;
import net.mcreator.genshinnature.client.model.Modelshirakodai;

public class TeacoloredshirakodaiRenderer extends MobRenderer<TeacoloredshirakodaiEntity, Modelshirakodai<TeacoloredshirakodaiEntity>> {
	public TeacoloredshirakodaiRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelshirakodai<TeacoloredshirakodaiEntity>(context.bakeLayer(Modelshirakodai.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(TeacoloredshirakodaiEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/tea_colored_shirakodai.png");
	}
}

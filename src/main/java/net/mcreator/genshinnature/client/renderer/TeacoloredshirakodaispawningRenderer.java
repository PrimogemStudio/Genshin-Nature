
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.TeacoloredshirakodaispawningEntity;
import net.mcreator.genshinnature.client.model.Modelshirakodai;

public class TeacoloredshirakodaispawningRenderer extends MobRenderer<TeacoloredshirakodaispawningEntity, Modelshirakodai<TeacoloredshirakodaispawningEntity>> {
	public TeacoloredshirakodaispawningRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelshirakodai<TeacoloredshirakodaispawningEntity>(context.bakeLayer(Modelshirakodai.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(TeacoloredshirakodaispawningEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/blank_texture.png");
	}
}

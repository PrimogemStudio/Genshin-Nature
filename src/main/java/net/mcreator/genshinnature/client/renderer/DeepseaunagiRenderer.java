
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.DeepseaunagiEntity;
import net.mcreator.genshinnature.client.model.Modelunagi;

public class DeepseaunagiRenderer extends MobRenderer<DeepseaunagiEntity, Modelunagi<DeepseaunagiEntity>> {
	public DeepseaunagiRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelunagi<DeepseaunagiEntity>(context.bakeLayer(Modelunagi.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(DeepseaunagiEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/deep_sea_unagi.png");
	}
}

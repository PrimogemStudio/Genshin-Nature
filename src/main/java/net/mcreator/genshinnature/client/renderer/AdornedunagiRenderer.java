
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.AdornedunagiEntity;
import net.mcreator.genshinnature.client.model.Modelunagi;

public class AdornedunagiRenderer extends MobRenderer<AdornedunagiEntity, Modelunagi<AdornedunagiEntity>> {
	public AdornedunagiRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelunagi<AdornedunagiEntity>(context.bakeLayer(Modelunagi.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(AdornedunagiEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/adorned_unagi.png");
	}
}

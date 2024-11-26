
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.RedfinnedunagiEntity;
import net.mcreator.genshinnature.client.model.Modelunagi;

public class RedfinnedunagiRenderer extends MobRenderer<RedfinnedunagiEntity, Modelunagi<RedfinnedunagiEntity>> {
	public RedfinnedunagiRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelunagi<RedfinnedunagiEntity>(context.bakeLayer(Modelunagi.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(RedfinnedunagiEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/red_finned_unagi.png");
	}
}

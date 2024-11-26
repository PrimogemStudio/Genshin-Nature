
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.QuicksandunagiEntity;
import net.mcreator.genshinnature.client.model.Modelunagi;

public class QuicksandunagiRenderer extends MobRenderer<QuicksandunagiEntity, Modelunagi<QuicksandunagiEntity>> {
	public QuicksandunagiRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelunagi<QuicksandunagiEntity>(context.bakeLayer(Modelunagi.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(QuicksandunagiEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/quicksand_unagi.png");
	}
}


package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.WaterminionboarEntity;
import net.mcreator.genshinnature.client.model.Modelboar;

public class WaterminionboarRenderer extends MobRenderer<WaterminionboarEntity, Modelboar<WaterminionboarEntity>> {
	public WaterminionboarRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelboar<WaterminionboarEntity>(context.bakeLayer(Modelboar.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(WaterminionboarEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/waterminion_texture.png");
	}
}

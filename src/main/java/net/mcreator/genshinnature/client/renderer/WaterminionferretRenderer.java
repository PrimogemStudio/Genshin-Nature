
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.WaterminionferretEntity;
import net.mcreator.genshinnature.client.model.Modelweasel_fixed;

public class WaterminionferretRenderer extends MobRenderer<WaterminionferretEntity, Modelweasel_fixed<WaterminionferretEntity>> {
	public WaterminionferretRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelweasel_fixed<WaterminionferretEntity>(context.bakeLayer(Modelweasel_fixed.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(WaterminionferretEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/waterminion_texture.png");
	}
}

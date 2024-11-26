
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.RishbolandtigerEntity;
import net.mcreator.genshinnature.client.model.Modelrishboland_tiger_fixed;

public class RishbolandtigerRenderer extends MobRenderer<RishbolandtigerEntity, Modelrishboland_tiger_fixed<RishbolandtigerEntity>> {
	public RishbolandtigerRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelrishboland_tiger_fixed<RishbolandtigerEntity>(context.bakeLayer(Modelrishboland_tiger_fixed.LAYER_LOCATION)), 1f);
	}

	@Override
	public ResourceLocation getTextureLocation(RishbolandtigerEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/rishboland_tiger.png");
	}
}

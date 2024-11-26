
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.SnowweaselEntity;
import net.mcreator.genshinnature.client.model.Modelweasel_fixed;

public class SnowweaselRenderer extends MobRenderer<SnowweaselEntity, Modelweasel_fixed<SnowweaselEntity>> {
	public SnowweaselRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelweasel_fixed<SnowweaselEntity>(context.bakeLayer(Modelweasel_fixed.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(SnowweaselEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/snow_weasel_fixed.png");
	}
}

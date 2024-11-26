
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.SnowstriderspawningEntity;
import net.mcreator.genshinnature.client.model.Modelsticklebacks;

public class SnowstriderspawningRenderer extends MobRenderer<SnowstriderspawningEntity, Modelsticklebacks<SnowstriderspawningEntity>> {
	public SnowstriderspawningRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelsticklebacks<SnowstriderspawningEntity>(context.bakeLayer(Modelsticklebacks.LAYER_LOCATION)), 1.2f);
	}

	@Override
	public ResourceLocation getTextureLocation(SnowstriderspawningEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/blank_texture.png");
	}
}

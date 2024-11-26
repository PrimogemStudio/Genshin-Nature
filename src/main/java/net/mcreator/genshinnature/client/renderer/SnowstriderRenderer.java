
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.SnowstriderEntity;
import net.mcreator.genshinnature.client.model.Modelsticklebacks;

public class SnowstriderRenderer extends MobRenderer<SnowstriderEntity, Modelsticklebacks<SnowstriderEntity>> {
	public SnowstriderRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelsticklebacks<SnowstriderEntity>(context.bakeLayer(Modelsticklebacks.LAYER_LOCATION)), 1.2f);
	}

	@Override
	public ResourceLocation getTextureLocation(SnowstriderEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/snowstrider.png");
	}
}

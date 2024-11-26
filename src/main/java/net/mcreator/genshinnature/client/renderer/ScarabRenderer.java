
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.ScarabEntity;
import net.mcreator.genshinnature.client.model.Modelscarab;

public class ScarabRenderer extends MobRenderer<ScarabEntity, Modelscarab<ScarabEntity>> {
	public ScarabRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelscarab<ScarabEntity>(context.bakeLayer(Modelscarab.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(ScarabEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/scarab.png");
	}
}


package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.EmeraldduckEntity;
import net.mcreator.genshinnature.client.model.Modelduck;

public class EmeraldduckRenderer extends MobRenderer<EmeraldduckEntity, Modelduck<EmeraldduckEntity>> {
	public EmeraldduckRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelduck<EmeraldduckEntity>(context.bakeLayer(Modelduck.LAYER_LOCATION)), 1f);
	}

	@Override
	public ResourceLocation getTextureLocation(EmeraldduckEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/emerald_duck.png");
	}
}

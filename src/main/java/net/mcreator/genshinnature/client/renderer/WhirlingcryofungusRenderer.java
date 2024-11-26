
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.WhirlingcryofungusEntity;
import net.mcreator.genshinnature.client.model.Modelwhirling_cryo_fungus;

public class WhirlingcryofungusRenderer extends MobRenderer<WhirlingcryofungusEntity, Modelwhirling_cryo_fungus<WhirlingcryofungusEntity>> {
	public WhirlingcryofungusRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelwhirling_cryo_fungus<WhirlingcryofungusEntity>(context.bakeLayer(Modelwhirling_cryo_fungus.LAYER_LOCATION)), 0.6f);
	}

	@Override
	public ResourceLocation getTextureLocation(WhirlingcryofungusEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/whirling_cryo_fungus.png");
	}
}

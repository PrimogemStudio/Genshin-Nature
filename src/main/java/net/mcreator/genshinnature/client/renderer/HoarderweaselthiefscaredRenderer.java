
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.HoarderweaselthiefscaredEntity;
import net.mcreator.genshinnature.client.model.Modelweasel_thief;

public class HoarderweaselthiefscaredRenderer extends MobRenderer<HoarderweaselthiefscaredEntity, Modelweasel_thief<HoarderweaselthiefscaredEntity>> {
	public HoarderweaselthiefscaredRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelweasel_thief<HoarderweaselthiefscaredEntity>(context.bakeLayer(Modelweasel_thief.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(HoarderweaselthiefscaredEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/weasel_thief_hoarder.png");
	}
}

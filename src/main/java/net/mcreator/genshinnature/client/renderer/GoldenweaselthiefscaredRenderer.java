
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.GoldenweaselthiefscaredEntity;
import net.mcreator.genshinnature.client.model.Modelweasel_thief;

public class GoldenweaselthiefscaredRenderer extends MobRenderer<GoldenweaselthiefscaredEntity, Modelweasel_thief<GoldenweaselthiefscaredEntity>> {
	public GoldenweaselthiefscaredRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelweasel_thief<GoldenweaselthiefscaredEntity>(context.bakeLayer(Modelweasel_thief.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(GoldenweaselthiefscaredEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/weasel_thief_golden.png");
	}
}

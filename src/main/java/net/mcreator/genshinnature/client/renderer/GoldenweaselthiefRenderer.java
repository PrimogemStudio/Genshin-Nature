
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.GoldenweaselthiefEntity;
import net.mcreator.genshinnature.client.model.Modelweasel_thief;

public class GoldenweaselthiefRenderer extends MobRenderer<GoldenweaselthiefEntity, Modelweasel_thief<GoldenweaselthiefEntity>> {
	public GoldenweaselthiefRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelweasel_thief<GoldenweaselthiefEntity>(context.bakeLayer(Modelweasel_thief.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(GoldenweaselthiefEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/weasel_thief_golden.png");
	}
}


package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.HoarderweaselthiefEntity;
import net.mcreator.genshinnature.client.model.Modelweasel_thief;

public class HoarderweaselthiefRenderer extends MobRenderer<HoarderweaselthiefEntity, Modelweasel_thief<HoarderweaselthiefEntity>> {
	public HoarderweaselthiefRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelweasel_thief<HoarderweaselthiefEntity>(context.bakeLayer(Modelweasel_thief.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(HoarderweaselthiefEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/weasel_thief_hoarder.png");
	}
}

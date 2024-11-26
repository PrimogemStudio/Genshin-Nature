
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.AmateurweaselthiefEntity;
import net.mcreator.genshinnature.client.model.Modelweasel_thief;

public class AmateurweaselthiefRenderer extends MobRenderer<AmateurweaselthiefEntity, Modelweasel_thief<AmateurweaselthiefEntity>> {
	public AmateurweaselthiefRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelweasel_thief<AmateurweaselthiefEntity>(context.bakeLayer(Modelweasel_thief.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(AmateurweaselthiefEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/weasel_thief_amateur.png");
	}
}


package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.AmateurweaselthiefscaredEntity;
import net.mcreator.genshinnature.client.model.Modelweasel_thief;

public class AmateurweaselthiefscaredRenderer extends MobRenderer<AmateurweaselthiefscaredEntity, Modelweasel_thief<AmateurweaselthiefscaredEntity>> {
	public AmateurweaselthiefscaredRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelweasel_thief<AmateurweaselthiefscaredEntity>(context.bakeLayer(Modelweasel_thief.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(AmateurweaselthiefscaredEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/weasel_thief_amateur.png");
	}
}

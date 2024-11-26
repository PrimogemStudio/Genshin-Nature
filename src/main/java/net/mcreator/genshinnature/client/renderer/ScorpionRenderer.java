
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.ScorpionEntity;
import net.mcreator.genshinnature.client.model.Modelscorpion;

public class ScorpionRenderer extends MobRenderer<ScorpionEntity, Modelscorpion<ScorpionEntity>> {
	public ScorpionRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelscorpion<ScorpionEntity>(context.bakeLayer(Modelscorpion.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(ScorpionEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/scorpion.png");
	}
}

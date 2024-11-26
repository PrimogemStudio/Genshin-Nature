
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.AizenmedakaspawningEntity;
import net.mcreator.genshinnature.client.model.Modelmedaka;

public class AizenmedakaspawningRenderer extends MobRenderer<AizenmedakaspawningEntity, Modelmedaka<AizenmedakaspawningEntity>> {
	public AizenmedakaspawningRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmedaka<AizenmedakaspawningEntity>(context.bakeLayer(Modelmedaka.LAYER_LOCATION)), 0.6f);
	}

	@Override
	public ResourceLocation getTextureLocation(AizenmedakaspawningEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/blank_texture.png");
	}
}


package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.MedakaspawningEntity;
import net.mcreator.genshinnature.client.model.Modelmedaka;

public class MedakaspawningRenderer extends MobRenderer<MedakaspawningEntity, Modelmedaka<MedakaspawningEntity>> {
	public MedakaspawningRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmedaka<MedakaspawningEntity>(context.bakeLayer(Modelmedaka.LAYER_LOCATION)), 0.6f);
	}

	@Override
	public ResourceLocation getTextureLocation(MedakaspawningEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/blank_texture.png");
	}
}

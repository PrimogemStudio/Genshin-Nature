
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.AkaimaouEntity;
import net.mcreator.genshinnature.client.model.Modelsticklebacks;

public class AkaimaouRenderer extends MobRenderer<AkaimaouEntity, Modelsticklebacks<AkaimaouEntity>> {
	public AkaimaouRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelsticklebacks<AkaimaouEntity>(context.bakeLayer(Modelsticklebacks.LAYER_LOCATION)), 1.2f);
	}

	@Override
	public ResourceLocation getTextureLocation(AkaimaouEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/akai_maou.png");
	}
}

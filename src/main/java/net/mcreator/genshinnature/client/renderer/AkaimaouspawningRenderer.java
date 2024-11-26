
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.AkaimaouspawningEntity;
import net.mcreator.genshinnature.client.model.Modelsticklebacks;

public class AkaimaouspawningRenderer extends MobRenderer<AkaimaouspawningEntity, Modelsticklebacks<AkaimaouspawningEntity>> {
	public AkaimaouspawningRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelsticklebacks<AkaimaouspawningEntity>(context.bakeLayer(Modelsticklebacks.LAYER_LOCATION)), 1.2f);
	}

	@Override
	public ResourceLocation getTextureLocation(AkaimaouspawningEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/blank_texture.png");
	}
}

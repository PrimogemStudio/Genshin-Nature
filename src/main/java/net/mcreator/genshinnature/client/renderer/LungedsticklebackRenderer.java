
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.LungedsticklebackEntity;
import net.mcreator.genshinnature.client.model.Modelsticklebacks;

public class LungedsticklebackRenderer extends MobRenderer<LungedsticklebackEntity, Modelsticklebacks<LungedsticklebackEntity>> {
	public LungedsticklebackRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelsticklebacks<LungedsticklebackEntity>(context.bakeLayer(Modelsticklebacks.LAYER_LOCATION)), 1.2f);
	}

	@Override
	public ResourceLocation getTextureLocation(LungedsticklebackEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/lunged_stickleback.png");
	}
}

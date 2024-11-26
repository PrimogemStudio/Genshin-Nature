
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.LungedsticklebackspawningEntity;
import net.mcreator.genshinnature.client.model.Modelsticklebacks;

public class LungedsticklebackspawningRenderer extends MobRenderer<LungedsticklebackspawningEntity, Modelsticklebacks<LungedsticklebackspawningEntity>> {
	public LungedsticklebackspawningRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelsticklebacks<LungedsticklebackspawningEntity>(context.bakeLayer(Modelsticklebacks.LAYER_LOCATION)), 1.2f);
	}

	@Override
	public ResourceLocation getTextureLocation(LungedsticklebackspawningEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/blank_texture.png");
	}
}

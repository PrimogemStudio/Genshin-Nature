
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.BettaspawningEntity;
import net.mcreator.genshinnature.client.model.Modelsticklebacks;

public class BettaspawningRenderer extends MobRenderer<BettaspawningEntity, Modelsticklebacks<BettaspawningEntity>> {
	public BettaspawningRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelsticklebacks<BettaspawningEntity>(context.bakeLayer(Modelsticklebacks.LAYER_LOCATION)), 1.2f);
	}

	@Override
	public ResourceLocation getTextureLocation(BettaspawningEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/blank_texture.png");
	}
}

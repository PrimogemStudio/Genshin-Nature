
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.BettaEntity;
import net.mcreator.genshinnature.client.model.Modelsticklebacks;

public class BettaRenderer extends MobRenderer<BettaEntity, Modelsticklebacks<BettaEntity>> {
	public BettaRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelsticklebacks<BettaEntity>(context.bakeLayer(Modelsticklebacks.LAYER_LOCATION)), 1.2f);
	}

	@Override
	public ResourceLocation getTextureLocation(BettaEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/betta.png");
	}
}

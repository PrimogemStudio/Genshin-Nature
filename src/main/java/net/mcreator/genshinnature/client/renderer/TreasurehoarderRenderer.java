
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.TreasurehoarderEntity;
import net.mcreator.genshinnature.client.model.Modeltreasure_hoarder;

public class TreasurehoarderRenderer extends MobRenderer<TreasurehoarderEntity, Modeltreasure_hoarder<TreasurehoarderEntity>> {
	public TreasurehoarderRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeltreasure_hoarder<TreasurehoarderEntity>(context.bakeLayer(Modeltreasure_hoarder.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(TreasurehoarderEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/treasure_hoarder_final.png");
	}
}

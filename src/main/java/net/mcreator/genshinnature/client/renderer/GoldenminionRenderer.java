
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.GoldenminionEntity;
import net.mcreator.genshinnature.client.model.Modelattacking_minion;

public class GoldenminionRenderer extends MobRenderer<GoldenminionEntity, Modelattacking_minion<GoldenminionEntity>> {
	public GoldenminionRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelattacking_minion<GoldenminionEntity>(context.bakeLayer(Modelattacking_minion.LAYER_LOCATION)), 1f);
	}

	@Override
	public ResourceLocation getTextureLocation(GoldenminionEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/attacking_minion.png");
	}
}

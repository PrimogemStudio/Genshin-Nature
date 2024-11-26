
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.DesertsumpterbeastadultEntity;
import net.mcreator.genshinnature.client.model.Modeldesert_sumpter_beast_adult;

public class DesertsumpterbeastadultRenderer extends MobRenderer<DesertsumpterbeastadultEntity, Modeldesert_sumpter_beast_adult<DesertsumpterbeastadultEntity>> {
	public DesertsumpterbeastadultRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeldesert_sumpter_beast_adult<DesertsumpterbeastadultEntity>(context.bakeLayer(Modeldesert_sumpter_beast_adult.LAYER_LOCATION)), 2.3f);
	}

	@Override
	public ResourceLocation getTextureLocation(DesertsumpterbeastadultEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/desert_sumpter_beast.png");
	}
}

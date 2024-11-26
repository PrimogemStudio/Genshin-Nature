
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.DesertsumpterbeastbabyEntity;
import net.mcreator.genshinnature.client.model.Modeldesert_sumpter_beast;

public class DesertsumpterbeastbabyRenderer extends MobRenderer<DesertsumpterbeastbabyEntity, Modeldesert_sumpter_beast<DesertsumpterbeastbabyEntity>> {
	public DesertsumpterbeastbabyRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeldesert_sumpter_beast<DesertsumpterbeastbabyEntity>(context.bakeLayer(Modeldesert_sumpter_beast.LAYER_LOCATION)), 1.3f);
	}

	@Override
	public ResourceLocation getTextureLocation(DesertsumpterbeastbabyEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/desert_sumpter_beast.png");
	}
}


package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.DesertsumpterbeastspawningEntity;
import net.mcreator.genshinnature.client.model.Modeldesert_sumpter_beast_adult;

public class DesertsumpterbeastspawningRenderer extends MobRenderer<DesertsumpterbeastspawningEntity, Modeldesert_sumpter_beast_adult<DesertsumpterbeastspawningEntity>> {
	public DesertsumpterbeastspawningRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeldesert_sumpter_beast_adult<DesertsumpterbeastspawningEntity>(context.bakeLayer(Modeldesert_sumpter_beast_adult.LAYER_LOCATION)), 2f);
	}

	@Override
	public ResourceLocation getTextureLocation(DesertsumpterbeastspawningEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/blank_texture.png");
	}
}

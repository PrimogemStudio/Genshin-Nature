
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.ShaggysumpterbeastspawningEntity;
import net.mcreator.genshinnature.client.model.Modelshaggy_sumpter_beast_adult;

public class ShaggysumpterbeastspawningRenderer extends MobRenderer<ShaggysumpterbeastspawningEntity, Modelshaggy_sumpter_beast_adult<ShaggysumpterbeastspawningEntity>> {
	public ShaggysumpterbeastspawningRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelshaggy_sumpter_beast_adult<ShaggysumpterbeastspawningEntity>(context.bakeLayer(Modelshaggy_sumpter_beast_adult.LAYER_LOCATION)), 2f);
	}

	@Override
	public ResourceLocation getTextureLocation(ShaggysumpterbeastspawningEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/blank_texture.png");
	}
}

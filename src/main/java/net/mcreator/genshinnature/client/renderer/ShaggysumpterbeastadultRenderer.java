
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.ShaggysumpterbeastadultEntity;
import net.mcreator.genshinnature.client.model.Modelshaggy_sumpter_beast_adult;

public class ShaggysumpterbeastadultRenderer extends MobRenderer<ShaggysumpterbeastadultEntity, Modelshaggy_sumpter_beast_adult<ShaggysumpterbeastadultEntity>> {
	public ShaggysumpterbeastadultRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelshaggy_sumpter_beast_adult<ShaggysumpterbeastadultEntity>(context.bakeLayer(Modelshaggy_sumpter_beast_adult.LAYER_LOCATION)), 2.3f);
	}

	@Override
	public ResourceLocation getTextureLocation(ShaggysumpterbeastadultEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/shaggy_sumpter_beast.png");
	}
}

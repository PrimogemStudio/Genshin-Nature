
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.ShaggysumpterbeastbabyEntity;
import net.mcreator.genshinnature.client.model.Modelshaggy_sumpter_beast;

public class ShaggysumpterbeastbabyRenderer extends MobRenderer<ShaggysumpterbeastbabyEntity, Modelshaggy_sumpter_beast<ShaggysumpterbeastbabyEntity>> {
	public ShaggysumpterbeastbabyRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelshaggy_sumpter_beast<ShaggysumpterbeastbabyEntity>(context.bakeLayer(Modelshaggy_sumpter_beast.LAYER_LOCATION)), 1.3f);
	}

	@Override
	public ResourceLocation getTextureLocation(ShaggysumpterbeastbabyEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/shaggy_sumpter_beast.png");
	}
}

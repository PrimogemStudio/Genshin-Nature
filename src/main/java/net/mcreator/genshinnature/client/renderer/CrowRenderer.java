
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.CrowEntity;
import net.mcreator.genshinnature.client.model.Modelcrow_fixed;

public class CrowRenderer extends MobRenderer<CrowEntity, Modelcrow_fixed<CrowEntity>> {
	public CrowRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcrow_fixed<CrowEntity>(context.bakeLayer(Modelcrow_fixed.LAYER_LOCATION)), 0.6f);
	}

	@Override
	public ResourceLocation getTextureLocation(CrowEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/crow.png");
	}
}

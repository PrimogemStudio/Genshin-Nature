
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.ElectrictntEntity;
import net.mcreator.genshinnature.client.model.Modelelectric_tnt;

public class ElectrictntRenderer extends MobRenderer<ElectrictntEntity, Modelelectric_tnt<ElectrictntEntity>> {
	public ElectrictntRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelelectric_tnt<ElectrictntEntity>(context.bakeLayer(Modelelectric_tnt.LAYER_LOCATION)), 1f);
	}

	@Override
	public ResourceLocation getTextureLocation(ElectrictntEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/electric_tnt.png");
	}
}

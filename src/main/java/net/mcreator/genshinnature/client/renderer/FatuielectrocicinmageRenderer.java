
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.FatuielectrocicinmageEntity;
import net.mcreator.genshinnature.client.model.Modelfatui_electro_cicin_mage;

public class FatuielectrocicinmageRenderer extends MobRenderer<FatuielectrocicinmageEntity, Modelfatui_electro_cicin_mage<FatuielectrocicinmageEntity>> {
	public FatuielectrocicinmageRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelfatui_electro_cicin_mage<FatuielectrocicinmageEntity>(context.bakeLayer(Modelfatui_electro_cicin_mage.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(FatuielectrocicinmageEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/fatui_electro_cicin_mage.png");
	}
}

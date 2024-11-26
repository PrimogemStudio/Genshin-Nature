
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.FatuicryocicinmageEntity;
import net.mcreator.genshinnature.client.model.Modelfatui_cryo_cicin_mage;

public class FatuicryocicinmageRenderer extends MobRenderer<FatuicryocicinmageEntity, Modelfatui_cryo_cicin_mage<FatuicryocicinmageEntity>> {
	public FatuicryocicinmageRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelfatui_cryo_cicin_mage<FatuicryocicinmageEntity>(context.bakeLayer(Modelfatui_cryo_cicin_mage.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(FatuicryocicinmageEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/fatui_cryo_cicin_mage.png");
	}
}

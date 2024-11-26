
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.PaleredcrabEntity;
import net.mcreator.genshinnature.client.model.Modelcrab;

public class PaleredcrabRenderer extends MobRenderer<PaleredcrabEntity, Modelcrab<PaleredcrabEntity>> {
	public PaleredcrabRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcrab<PaleredcrabEntity>(context.bakeLayer(Modelcrab.LAYER_LOCATION)), 0.6f);
	}

	@Override
	public ResourceLocation getTextureLocation(PaleredcrabEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/palered_crab.png");
	}
}

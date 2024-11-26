
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.MysteriousseelieEntity;
import net.mcreator.genshinnature.client.model.Modelseelie;

public class MysteriousseelieRenderer extends MobRenderer<MysteriousseelieEntity, Modelseelie<MysteriousseelieEntity>> {
	public MysteriousseelieRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelseelie<MysteriousseelieEntity>(context.bakeLayer(Modelseelie.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(MysteriousseelieEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/mysterious_seelie.png");
	}
}

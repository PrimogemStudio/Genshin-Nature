
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.MysteriousseeliesoulsandEntity;
import net.mcreator.genshinnature.client.model.Modelseelie;

public class MysteriousseeliesoulsandRenderer extends MobRenderer<MysteriousseeliesoulsandEntity, Modelseelie<MysteriousseeliesoulsandEntity>> {
	public MysteriousseeliesoulsandRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelseelie<MysteriousseeliesoulsandEntity>(context.bakeLayer(Modelseelie.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(MysteriousseeliesoulsandEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/blank_texture.png");
	}
}

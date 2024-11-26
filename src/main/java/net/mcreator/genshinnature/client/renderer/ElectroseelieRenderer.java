
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.ElectroseelieEntity;
import net.mcreator.genshinnature.client.model.Modelseelie;

public class ElectroseelieRenderer extends MobRenderer<ElectroseelieEntity, Modelseelie<ElectroseelieEntity>> {
	public ElectroseelieRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelseelie<ElectroseelieEntity>(context.bakeLayer(Modelseelie.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(ElectroseelieEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/electro_seelie.png");
	}
}

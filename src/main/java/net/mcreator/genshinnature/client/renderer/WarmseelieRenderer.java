
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.WarmseelieEntity;
import net.mcreator.genshinnature.client.model.Modelseelie;

public class WarmseelieRenderer extends MobRenderer<WarmseelieEntity, Modelseelie<WarmseelieEntity>> {
	public WarmseelieRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelseelie<WarmseelieEntity>(context.bakeLayer(Modelseelie.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(WarmseelieEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/warm_seelie.png");
	}
}


package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.EndoraEntity;
import net.mcreator.genshinnature.client.model.Modelendora;

public class EndoraRenderer extends MobRenderer<EndoraEntity, Modelendora<EndoraEntity>> {
	public EndoraRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelendora<EndoraEntity>(context.bakeLayer(Modelendora.LAYER_LOCATION)), 0.8f);
	}

	@Override
	public ResourceLocation getTextureLocation(EndoraEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/endora.png");
	}
}

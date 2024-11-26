
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.EremiteEntity;
import net.mcreator.genshinnature.client.model.Modelmirror_maiden;

public class EremiteRenderer extends MobRenderer<EremiteEntity, Modelmirror_maiden<EremiteEntity>> {
	public EremiteRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmirror_maiden<EremiteEntity>(context.bakeLayer(Modelmirror_maiden.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(EremiteEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/eremite.png");
	}
}

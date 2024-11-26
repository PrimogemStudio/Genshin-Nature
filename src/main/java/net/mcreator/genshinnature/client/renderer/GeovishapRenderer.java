
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.GeovishapEntity;
import net.mcreator.genshinnature.client.model.Modelgeovishap_fixed3;

public class GeovishapRenderer extends MobRenderer<GeovishapEntity, Modelgeovishap_fixed3<GeovishapEntity>> {
	public GeovishapRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelgeovishap_fixed3<GeovishapEntity>(context.bakeLayer(Modelgeovishap_fixed3.LAYER_LOCATION)), 2f);
	}

	@Override
	public ResourceLocation getTextureLocation(GeovishapEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/geovishap.png");
	}
}

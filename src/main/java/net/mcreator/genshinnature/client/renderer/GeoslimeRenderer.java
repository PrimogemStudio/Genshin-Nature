
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.GeoslimeEntity;
import net.mcreator.genshinnature.client.model.Modelgeoslime;

public class GeoslimeRenderer extends MobRenderer<GeoslimeEntity, Modelgeoslime<GeoslimeEntity>> {
	public GeoslimeRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelgeoslime<GeoslimeEntity>(context.bakeLayer(Modelgeoslime.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(GeoslimeEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/geoslime.png");
	}
}

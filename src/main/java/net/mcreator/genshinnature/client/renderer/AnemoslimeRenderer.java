
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.AnemoslimeEntity;
import net.mcreator.genshinnature.client.model.Modelanemoslime;

public class AnemoslimeRenderer extends MobRenderer<AnemoslimeEntity, Modelanemoslime<AnemoslimeEntity>> {
	public AnemoslimeRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelanemoslime<AnemoslimeEntity>(context.bakeLayer(Modelanemoslime.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(AnemoslimeEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/anemoslime.png");
	}
}

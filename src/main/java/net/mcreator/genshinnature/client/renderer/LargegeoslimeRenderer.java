
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.LargegeoslimeEntity;
import net.mcreator.genshinnature.client.model.Modellargegeoslime;

public class LargegeoslimeRenderer extends MobRenderer<LargegeoslimeEntity, Modellargegeoslime<LargegeoslimeEntity>> {
	public LargegeoslimeRenderer(EntityRendererProvider.Context context) {
		super(context, new Modellargegeoslime<LargegeoslimeEntity>(context.bakeLayer(Modellargegeoslime.LAYER_LOCATION)), 1f);
	}

	@Override
	public ResourceLocation getTextureLocation(LargegeoslimeEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/largegeoslime.png");
	}
}

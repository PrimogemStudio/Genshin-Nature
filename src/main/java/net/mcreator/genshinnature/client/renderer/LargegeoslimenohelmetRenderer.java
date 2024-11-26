
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.LargegeoslimenohelmetEntity;
import net.mcreator.genshinnature.client.model.Modellargegeoslime_nohelmet;

public class LargegeoslimenohelmetRenderer extends MobRenderer<LargegeoslimenohelmetEntity, Modellargegeoslime_nohelmet<LargegeoslimenohelmetEntity>> {
	public LargegeoslimenohelmetRenderer(EntityRendererProvider.Context context) {
		super(context, new Modellargegeoslime_nohelmet<LargegeoslimenohelmetEntity>(context.bakeLayer(Modellargegeoslime_nohelmet.LAYER_LOCATION)), 1f);
	}

	@Override
	public ResourceLocation getTextureLocation(LargegeoslimenohelmetEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/largegeoslime.png");
	}
}

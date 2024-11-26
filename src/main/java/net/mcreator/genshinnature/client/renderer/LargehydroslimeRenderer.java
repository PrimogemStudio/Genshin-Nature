
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.LargehydroslimeEntity;
import net.mcreator.genshinnature.client.model.Modellargehydroslime;

public class LargehydroslimeRenderer extends MobRenderer<LargehydroslimeEntity, Modellargehydroslime<LargehydroslimeEntity>> {
	public LargehydroslimeRenderer(EntityRendererProvider.Context context) {
		super(context, new Modellargehydroslime<LargehydroslimeEntity>(context.bakeLayer(Modellargehydroslime.LAYER_LOCATION)), 1f);
	}

	@Override
	public ResourceLocation getTextureLocation(LargehydroslimeEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/largehydroslime.png");
	}
}

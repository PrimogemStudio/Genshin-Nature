
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.LargedendroslimeEntity;
import net.mcreator.genshinnature.client.model.Modellargedendroslime;

public class LargedendroslimeRenderer extends MobRenderer<LargedendroslimeEntity, Modellargedendroslime<LargedendroslimeEntity>> {
	public LargedendroslimeRenderer(EntityRendererProvider.Context context) {
		super(context, new Modellargedendroslime<LargedendroslimeEntity>(context.bakeLayer(Modellargedendroslime.LAYER_LOCATION)), 1f);
	}

	@Override
	public ResourceLocation getTextureLocation(LargedendroslimeEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/largedendroslime.png");
	}
}

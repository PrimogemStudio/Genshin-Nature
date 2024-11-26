
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.HiddenlargedendroslimeEntity;
import net.mcreator.genshinnature.client.model.Modellargedendroslime_hidden;

public class HiddenlargedendroslimeRenderer extends MobRenderer<HiddenlargedendroslimeEntity, Modellargedendroslime_hidden<HiddenlargedendroslimeEntity>> {
	public HiddenlargedendroslimeRenderer(EntityRendererProvider.Context context) {
		super(context, new Modellargedendroslime_hidden<HiddenlargedendroslimeEntity>(context.bakeLayer(Modellargedendroslime_hidden.LAYER_LOCATION)), 1f);
	}

	@Override
	public ResourceLocation getTextureLocation(HiddenlargedendroslimeEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/largedendroslime.png");
	}
}

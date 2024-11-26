
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.LargecryoslimenohelmetEntity;
import net.mcreator.genshinnature.client.model.Modellargecryoslime_nohelmet;

public class LargecryoslimenohelmetRenderer extends MobRenderer<LargecryoslimenohelmetEntity, Modellargecryoslime_nohelmet<LargecryoslimenohelmetEntity>> {
	public LargecryoslimenohelmetRenderer(EntityRendererProvider.Context context) {
		super(context, new Modellargecryoslime_nohelmet<LargecryoslimenohelmetEntity>(context.bakeLayer(Modellargecryoslime_nohelmet.LAYER_LOCATION)), 1f);
	}

	@Override
	public ResourceLocation getTextureLocation(LargecryoslimenohelmetEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/largecryoslime.png");
	}
}

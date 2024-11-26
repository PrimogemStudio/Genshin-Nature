
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.LargecryoslimeEntity;
import net.mcreator.genshinnature.client.model.Modellargecryoslime;

public class LargecryoslimeRenderer extends MobRenderer<LargecryoslimeEntity, Modellargecryoslime<LargecryoslimeEntity>> {
	public LargecryoslimeRenderer(EntityRendererProvider.Context context) {
		super(context, new Modellargecryoslime<LargecryoslimeEntity>(context.bakeLayer(Modellargecryoslime.LAYER_LOCATION)), 1f);
	}

	@Override
	public ResourceLocation getTextureLocation(LargecryoslimeEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/largecryoslime.png");
	}
}

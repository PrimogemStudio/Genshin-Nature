
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.HilichurlberserkerEntity;
import net.mcreator.genshinnature.client.model.Modelhilichurl_berserker;

public class HilichurlberserkerRenderer extends MobRenderer<HilichurlberserkerEntity, Modelhilichurl_berserker<HilichurlberserkerEntity>> {
	public HilichurlberserkerRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelhilichurl_berserker<HilichurlberserkerEntity>(context.bakeLayer(Modelhilichurl_berserker.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(HilichurlberserkerEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/hilichurl_berserker.png");
	}
}

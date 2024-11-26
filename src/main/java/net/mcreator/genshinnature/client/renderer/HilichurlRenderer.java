
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.HilichurlEntity;
import net.mcreator.genshinnature.client.model.Modelhilichurl_unarmed;

public class HilichurlRenderer extends MobRenderer<HilichurlEntity, Modelhilichurl_unarmed<HilichurlEntity>> {
	public HilichurlRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelhilichurl_unarmed<HilichurlEntity>(context.bakeLayer(Modelhilichurl_unarmed.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(HilichurlEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/hilichurl_unarmed.png");
	}
}

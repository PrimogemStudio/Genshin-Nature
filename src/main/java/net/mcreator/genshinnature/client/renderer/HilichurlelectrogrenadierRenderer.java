
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.HilichurlelectrogrenadierEntity;
import net.mcreator.genshinnature.client.model.Modelhilichurl_electro_grenadier;

public class HilichurlelectrogrenadierRenderer extends MobRenderer<HilichurlelectrogrenadierEntity, Modelhilichurl_electro_grenadier<HilichurlelectrogrenadierEntity>> {
	public HilichurlelectrogrenadierRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelhilichurl_electro_grenadier<HilichurlelectrogrenadierEntity>(context.bakeLayer(Modelhilichurl_electro_grenadier.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(HilichurlelectrogrenadierEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/hilichurl_electro_grenadier.png");
	}
}

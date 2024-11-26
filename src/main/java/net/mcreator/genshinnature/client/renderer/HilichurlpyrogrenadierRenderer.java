
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.HilichurlpyrogrenadierEntity;
import net.mcreator.genshinnature.client.model.Modelhilichurl_pyro_grenadier;

public class HilichurlpyrogrenadierRenderer extends MobRenderer<HilichurlpyrogrenadierEntity, Modelhilichurl_pyro_grenadier<HilichurlpyrogrenadierEntity>> {
	public HilichurlpyrogrenadierRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelhilichurl_pyro_grenadier<HilichurlpyrogrenadierEntity>(context.bakeLayer(Modelhilichurl_pyro_grenadier.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(HilichurlpyrogrenadierEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/hilichurl_pyro_grenadier.png");
	}
}

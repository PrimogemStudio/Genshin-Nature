
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.HilichurlcryogrenadierEntity;
import net.mcreator.genshinnature.client.model.Modelhilichurl_cryo_grenadier;

public class HilichurlcryogrenadierRenderer extends MobRenderer<HilichurlcryogrenadierEntity, Modelhilichurl_cryo_grenadier<HilichurlcryogrenadierEntity>> {
	public HilichurlcryogrenadierRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelhilichurl_cryo_grenadier<HilichurlcryogrenadierEntity>(context.bakeLayer(Modelhilichurl_cryo_grenadier.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(HilichurlcryogrenadierEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/hilichurl_cryo_grenadier.png");
	}
}


package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.RockshieldhilichurlguardEntity;
import net.mcreator.genshinnature.client.model.Modelhilichurl_rockshield_guard;

public class RockshieldhilichurlguardRenderer extends MobRenderer<RockshieldhilichurlguardEntity, Modelhilichurl_rockshield_guard<RockshieldhilichurlguardEntity>> {
	public RockshieldhilichurlguardRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelhilichurl_rockshield_guard<RockshieldhilichurlguardEntity>(context.bakeLayer(Modelhilichurl_rockshield_guard.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(RockshieldhilichurlguardEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/hilichurl_rockshield_guard.png");
	}
}

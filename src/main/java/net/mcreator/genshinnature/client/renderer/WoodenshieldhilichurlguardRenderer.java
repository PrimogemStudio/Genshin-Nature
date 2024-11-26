
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.WoodenshieldhilichurlguardEntity;
import net.mcreator.genshinnature.client.model.Modelhilichurl_woodenshield_guard;

public class WoodenshieldhilichurlguardRenderer extends MobRenderer<WoodenshieldhilichurlguardEntity, Modelhilichurl_woodenshield_guard<WoodenshieldhilichurlguardEntity>> {
	public WoodenshieldhilichurlguardRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelhilichurl_woodenshield_guard<WoodenshieldhilichurlguardEntity>(context.bakeLayer(Modelhilichurl_woodenshield_guard.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(WoodenshieldhilichurlguardEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/hilichurl_woodenshield_guard.png");
	}
}

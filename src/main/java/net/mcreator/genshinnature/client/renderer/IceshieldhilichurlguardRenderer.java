
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.IceshieldhilichurlguardEntity;
import net.mcreator.genshinnature.client.model.Modelhilichurl_iceshield_guard;

public class IceshieldhilichurlguardRenderer extends MobRenderer<IceshieldhilichurlguardEntity, Modelhilichurl_iceshield_guard<IceshieldhilichurlguardEntity>> {
	public IceshieldhilichurlguardRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelhilichurl_iceshield_guard<IceshieldhilichurlguardEntity>(context.bakeLayer(Modelhilichurl_iceshield_guard.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(IceshieldhilichurlguardEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/hilichurl_iceshield_guard.png");
	}
}

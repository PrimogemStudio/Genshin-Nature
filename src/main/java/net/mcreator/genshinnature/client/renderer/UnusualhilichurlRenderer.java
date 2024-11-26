
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.UnusualhilichurlEntity;
import net.mcreator.genshinnature.client.model.Modelhilichurl_unusual;

public class UnusualhilichurlRenderer extends MobRenderer<UnusualhilichurlEntity, Modelhilichurl_unusual<UnusualhilichurlEntity>> {
	public UnusualhilichurlRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelhilichurl_unusual<UnusualhilichurlEntity>(context.bakeLayer(Modelhilichurl_unusual.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(UnusualhilichurlEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/hilichurl_unusual.png");
	}
}

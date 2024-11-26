
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.UnlitlargepyroslimeEntity;
import net.mcreator.genshinnature.client.model.Modellargepyroslime;

public class UnlitlargepyroslimeRenderer extends MobRenderer<UnlitlargepyroslimeEntity, Modellargepyroslime<UnlitlargepyroslimeEntity>> {
	public UnlitlargepyroslimeRenderer(EntityRendererProvider.Context context) {
		super(context, new Modellargepyroslime<UnlitlargepyroslimeEntity>(context.bakeLayer(Modellargepyroslime.LAYER_LOCATION)), 1f);
	}

	@Override
	public ResourceLocation getTextureLocation(UnlitlargepyroslimeEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/largepyroslime.png");
	}
}

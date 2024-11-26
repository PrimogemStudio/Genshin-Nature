
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.UnlitpyroslimeEntity;
import net.mcreator.genshinnature.client.model.Modelpyroslime;

public class UnlitpyroslimeRenderer extends MobRenderer<UnlitpyroslimeEntity, Modelpyroslime<UnlitpyroslimeEntity>> {
	public UnlitpyroslimeRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelpyroslime<UnlitpyroslimeEntity>(context.bakeLayer(Modelpyroslime.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(UnlitpyroslimeEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/pyroslime.png");
	}
}

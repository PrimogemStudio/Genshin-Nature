
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.MaranasavatarEntity;
import net.mcreator.genshinnature.client.model.Modelmaranas_avatar;

public class MaranasavatarRenderer extends MobRenderer<MaranasavatarEntity, Modelmaranas_avatar<MaranasavatarEntity>> {
	public MaranasavatarRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmaranas_avatar<MaranasavatarEntity>(context.bakeLayer(Modelmaranas_avatar.LAYER_LOCATION)), 1.3f);
	}

	@Override
	public ResourceLocation getTextureLocation(MaranasavatarEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/maranas_avatar.png");
	}
}

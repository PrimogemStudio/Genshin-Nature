
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.WarmseelieicespikesEntity;
import net.mcreator.genshinnature.client.model.Modelseelie;

public class WarmseelieicespikesRenderer extends MobRenderer<WarmseelieicespikesEntity, Modelseelie<WarmseelieicespikesEntity>> {
	public WarmseelieicespikesRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelseelie<WarmseelieicespikesEntity>(context.bakeLayer(Modelseelie.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(WarmseelieicespikesEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/blank_texture.png");
	}
}

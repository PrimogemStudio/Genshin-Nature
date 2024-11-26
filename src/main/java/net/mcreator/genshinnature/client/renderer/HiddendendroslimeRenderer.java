
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.HiddendendroslimeEntity;
import net.mcreator.genshinnature.client.model.Modelhidden_dendroslime;

public class HiddendendroslimeRenderer extends MobRenderer<HiddendendroslimeEntity, Modelhidden_dendroslime<HiddendendroslimeEntity>> {
	public HiddendendroslimeRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelhidden_dendroslime<HiddendendroslimeEntity>(context.bakeLayer(Modelhidden_dendroslime.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(HiddendendroslimeEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/dendroslime.png");
	}
}

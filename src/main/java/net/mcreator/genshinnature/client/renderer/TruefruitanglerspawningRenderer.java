
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.TruefruitanglerspawningEntity;
import net.mcreator.genshinnature.client.model.Modelangler_fish;

public class TruefruitanglerspawningRenderer extends MobRenderer<TruefruitanglerspawningEntity, Modelangler_fish<TruefruitanglerspawningEntity>> {
	public TruefruitanglerspawningRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelangler_fish<TruefruitanglerspawningEntity>(context.bakeLayer(Modelangler_fish.LAYER_LOCATION)), 0.7f);
	}

	@Override
	public ResourceLocation getTextureLocation(TruefruitanglerspawningEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/blank_texture.png");
	}
}

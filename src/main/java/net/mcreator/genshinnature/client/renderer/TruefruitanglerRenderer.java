
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.TruefruitanglerEntity;
import net.mcreator.genshinnature.client.model.Modelangler_fish;

public class TruefruitanglerRenderer extends MobRenderer<TruefruitanglerEntity, Modelangler_fish<TruefruitanglerEntity>> {
	public TruefruitanglerRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelangler_fish<TruefruitanglerEntity>(context.bakeLayer(Modelangler_fish.LAYER_LOCATION)), 0.7f);
	}

	@Override
	public ResourceLocation getTextureLocation(TruefruitanglerEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/true_fruit_angler.png");
	}
}

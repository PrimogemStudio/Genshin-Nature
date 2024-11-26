
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.FloatinglargeanemoslimeEntity;
import net.mcreator.genshinnature.client.model.Modellargeanemoslime_fixed;

public class FloatinglargeanemoslimeRenderer extends MobRenderer<FloatinglargeanemoslimeEntity, Modellargeanemoslime_fixed<FloatinglargeanemoslimeEntity>> {
	public FloatinglargeanemoslimeRenderer(EntityRendererProvider.Context context) {
		super(context, new Modellargeanemoslime_fixed<FloatinglargeanemoslimeEntity>(context.bakeLayer(Modellargeanemoslime_fixed.LAYER_LOCATION)), 1f);
	}

	@Override
	public ResourceLocation getTextureLocation(FloatinglargeanemoslimeEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/largeanemoslime.png");
	}
}

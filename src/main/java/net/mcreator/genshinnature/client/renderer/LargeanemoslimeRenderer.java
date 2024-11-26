
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.LargeanemoslimeEntity;
import net.mcreator.genshinnature.client.model.Modellargeanemoslime_fixed;

public class LargeanemoslimeRenderer extends MobRenderer<LargeanemoslimeEntity, Modellargeanemoslime_fixed<LargeanemoslimeEntity>> {
	public LargeanemoslimeRenderer(EntityRendererProvider.Context context) {
		super(context, new Modellargeanemoslime_fixed<LargeanemoslimeEntity>(context.bakeLayer(Modellargeanemoslime_fixed.LAYER_LOCATION)), 1f);
	}

	@Override
	public ResourceLocation getTextureLocation(LargeanemoslimeEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/largeanemoslime.png");
	}
}


package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.FloatinghydrofungiEntity;
import net.mcreator.genshinnature.client.model.Modelfloating_hydro_fungi;

public class FloatinghydrofungiRenderer extends MobRenderer<FloatinghydrofungiEntity, Modelfloating_hydro_fungi<FloatinghydrofungiEntity>> {
	public FloatinghydrofungiRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelfloating_hydro_fungi<FloatinghydrofungiEntity>(context.bakeLayer(Modelfloating_hydro_fungi.LAYER_LOCATION)), 1.2f);
	}

	@Override
	public ResourceLocation getTextureLocation(FloatinghydrofungiEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/floating_hydro_fungi.png");
	}
}

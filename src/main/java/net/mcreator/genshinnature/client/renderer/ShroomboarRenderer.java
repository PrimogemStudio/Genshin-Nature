
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.ShroomboarEntity;
import net.mcreator.genshinnature.client.model.Modelshroomboar;

public class ShroomboarRenderer extends MobRenderer<ShroomboarEntity, Modelshroomboar<ShroomboarEntity>> {
	public ShroomboarRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelshroomboar<ShroomboarEntity>(context.bakeLayer(Modelshroomboar.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(ShroomboarEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/shroomboar.png");
	}
}

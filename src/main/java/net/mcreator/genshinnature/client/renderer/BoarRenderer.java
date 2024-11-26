
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.BoarEntity;
import net.mcreator.genshinnature.client.model.Modelboar;

public class BoarRenderer extends MobRenderer<BoarEntity, Modelboar<BoarEntity>> {
	public BoarRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelboar<BoarEntity>(context.bakeLayer(Modelboar.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(BoarEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/boar.png");
	}
}

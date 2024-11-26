
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.SnowboarEntity;
import net.mcreator.genshinnature.client.model.Modelboar;

public class SnowboarRenderer extends MobRenderer<SnowboarEntity, Modelboar<SnowboarEntity>> {
	public SnowboarRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelboar<SnowboarEntity>(context.bakeLayer(Modelboar.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(SnowboarEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/snowboar.png");
	}
}

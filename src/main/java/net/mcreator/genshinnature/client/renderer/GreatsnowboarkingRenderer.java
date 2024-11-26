
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.GreatsnowboarkingEntity;
import net.mcreator.genshinnature.client.model.Modelthe_great_snowboar_king;

public class GreatsnowboarkingRenderer extends MobRenderer<GreatsnowboarkingEntity, Modelthe_great_snowboar_king<GreatsnowboarkingEntity>> {
	public GreatsnowboarkingRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelthe_great_snowboar_king<GreatsnowboarkingEntity>(context.bakeLayer(Modelthe_great_snowboar_king.LAYER_LOCATION)), 1.9f);
	}

	@Override
	public ResourceLocation getTextureLocation(GreatsnowboarkingEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/snowboar_king.png");
	}
}

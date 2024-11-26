
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.BlackkingpigeonEntity;
import net.mcreator.genshinnature.client.model.Modelwhite_pigeon;

public class BlackkingpigeonRenderer extends MobRenderer<BlackkingpigeonEntity, Modelwhite_pigeon<BlackkingpigeonEntity>> {
	public BlackkingpigeonRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelwhite_pigeon<BlackkingpigeonEntity>(context.bakeLayer(Modelwhite_pigeon.LAYER_LOCATION)), 0.6f);
	}

	@Override
	public ResourceLocation getTextureLocation(BlackkingpigeonEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/black_king_pigeon.png");
	}
}

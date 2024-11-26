
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.RuincruiserEntity;
import net.mcreator.genshinnature.client.model.Modelruin_cruiser;

public class RuincruiserRenderer extends MobRenderer<RuincruiserEntity, Modelruin_cruiser<RuincruiserEntity>> {
	public RuincruiserRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelruin_cruiser<RuincruiserEntity>(context.bakeLayer(Modelruin_cruiser.LAYER_LOCATION)), 1.1f);
	}

	@Override
	public ResourceLocation getTextureLocation(RuincruiserEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/ruin_cruiser.png");
	}
}

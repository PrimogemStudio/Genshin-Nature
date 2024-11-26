
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.RuindrakeskywatchEntity;
import net.mcreator.genshinnature.client.model.Modelruin_drake_skywatch;

public class RuindrakeskywatchRenderer extends MobRenderer<RuindrakeskywatchEntity, Modelruin_drake_skywatch<RuindrakeskywatchEntity>> {
	public RuindrakeskywatchRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelruin_drake_skywatch<RuindrakeskywatchEntity>(context.bakeLayer(Modelruin_drake_skywatch.LAYER_LOCATION)), 2f);
	}

	@Override
	public ResourceLocation getTextureLocation(RuindrakeskywatchEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/ruin_drake_skywatch.png");
	}
}

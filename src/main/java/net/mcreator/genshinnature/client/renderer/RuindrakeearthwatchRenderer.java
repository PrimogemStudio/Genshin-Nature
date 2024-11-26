
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.RuindrakeearthwatchEntity;
import net.mcreator.genshinnature.client.model.Modelruin_drake_earthwatch;

public class RuindrakeearthwatchRenderer extends MobRenderer<RuindrakeearthwatchEntity, Modelruin_drake_earthwatch<RuindrakeearthwatchEntity>> {
	public RuindrakeearthwatchRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelruin_drake_earthwatch<RuindrakeearthwatchEntity>(context.bakeLayer(Modelruin_drake_earthwatch.LAYER_LOCATION)), 2f);
	}

	@Override
	public ResourceLocation getTextureLocation(RuindrakeearthwatchEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/ruin_drake_skywatch.png");
	}
}

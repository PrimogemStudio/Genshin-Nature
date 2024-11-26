
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.RuingraderEntity;
import net.mcreator.genshinnature.client.model.Modelruin_grader;

public class RuingraderRenderer extends MobRenderer<RuingraderEntity, Modelruin_grader<RuingraderEntity>> {
	public RuingraderRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelruin_grader<RuingraderEntity>(context.bakeLayer(Modelruin_grader.LAYER_LOCATION)), 1.2f);
	}

	@Override
	public ResourceLocation getTextureLocation(RuingraderEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/ruin_grader.png");
	}
}

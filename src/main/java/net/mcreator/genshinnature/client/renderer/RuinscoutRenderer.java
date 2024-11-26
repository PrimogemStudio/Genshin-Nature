
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.RuinscoutEntity;
import net.mcreator.genshinnature.client.model.Modelruin_scout;

public class RuinscoutRenderer extends MobRenderer<RuinscoutEntity, Modelruin_scout<RuinscoutEntity>> {
	public RuinscoutRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelruin_scout<RuinscoutEntity>(context.bakeLayer(Modelruin_scout.LAYER_LOCATION)), 2f);
	}

	@Override
	public ResourceLocation getTextureLocation(RuinscoutEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/ruin_scout.png");
	}
}

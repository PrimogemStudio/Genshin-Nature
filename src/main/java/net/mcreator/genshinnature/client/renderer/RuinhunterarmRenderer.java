
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.RuinhunterarmEntity;
import net.mcreator.genshinnature.client.model.Modelruin_hunter_arm;

public class RuinhunterarmRenderer extends MobRenderer<RuinhunterarmEntity, Modelruin_hunter_arm<RuinhunterarmEntity>> {
	public RuinhunterarmRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelruin_hunter_arm<RuinhunterarmEntity>(context.bakeLayer(Modelruin_hunter_arm.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(RuinhunterarmEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/ruin_hunter.png");
	}
}

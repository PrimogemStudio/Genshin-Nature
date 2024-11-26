
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.RuinhunterEntity;
import net.mcreator.genshinnature.client.model.Modelruin_hunter;

public class RuinhunterRenderer extends MobRenderer<RuinhunterEntity, Modelruin_hunter<RuinhunterEntity>> {
	public RuinhunterRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelruin_hunter<RuinhunterEntity>(context.bakeLayer(Modelruin_hunter.LAYER_LOCATION)), 1.3f);
	}

	@Override
	public ResourceLocation getTextureLocation(RuinhunterEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/ruin_hunter.png");
	}
}

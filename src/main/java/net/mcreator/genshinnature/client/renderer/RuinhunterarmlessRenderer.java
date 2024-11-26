
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.RuinhunterarmlessEntity;
import net.mcreator.genshinnature.client.model.Modelruin_hunter_armless;

public class RuinhunterarmlessRenderer extends MobRenderer<RuinhunterarmlessEntity, Modelruin_hunter_armless<RuinhunterarmlessEntity>> {
	public RuinhunterarmlessRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelruin_hunter_armless<RuinhunterarmlessEntity>(context.bakeLayer(Modelruin_hunter_armless.LAYER_LOCATION)), 1.3f);
	}

	@Override
	public ResourceLocation getTextureLocation(RuinhunterarmlessEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/ruin_hunter.png");
	}
}

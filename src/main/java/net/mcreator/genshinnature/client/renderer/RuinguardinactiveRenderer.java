
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.RuinguardinactiveEntity;
import net.mcreator.genshinnature.client.model.Modelruin_guard_inactive;

public class RuinguardinactiveRenderer extends MobRenderer<RuinguardinactiveEntity, Modelruin_guard_inactive<RuinguardinactiveEntity>> {
	public RuinguardinactiveRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelruin_guard_inactive<RuinguardinactiveEntity>(context.bakeLayer(Modelruin_guard_inactive.LAYER_LOCATION)), 2f);
	}

	@Override
	public ResourceLocation getTextureLocation(RuinguardinactiveEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/ruin_guard.png");
	}
}

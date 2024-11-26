
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.BrownwingfalconflyingEntity;
import net.mcreator.genshinnature.client.model.Modelfalcon_flying;

public class BrownwingfalconflyingRenderer extends MobRenderer<BrownwingfalconflyingEntity, Modelfalcon_flying<BrownwingfalconflyingEntity>> {
	public BrownwingfalconflyingRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelfalcon_flying<BrownwingfalconflyingEntity>(context.bakeLayer(Modelfalcon_flying.LAYER_LOCATION)), 0.7f);
	}

	@Override
	public ResourceLocation getTextureLocation(BrownwingfalconflyingEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/brownwing_falcon.png");
	}
}

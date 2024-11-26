
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.SilkwhitefalconflyingEntity;
import net.mcreator.genshinnature.client.model.Modelfalcon_flying;

public class SilkwhitefalconflyingRenderer extends MobRenderer<SilkwhitefalconflyingEntity, Modelfalcon_flying<SilkwhitefalconflyingEntity>> {
	public SilkwhitefalconflyingRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelfalcon_flying<SilkwhitefalconflyingEntity>(context.bakeLayer(Modelfalcon_flying.LAYER_LOCATION)), 0.7f);
	}

	@Override
	public ResourceLocation getTextureLocation(SilkwhitefalconflyingEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/silkwhite_falcon.png");
	}
}

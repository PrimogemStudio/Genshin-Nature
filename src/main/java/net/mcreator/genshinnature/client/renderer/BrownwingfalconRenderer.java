
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.BrownwingfalconEntity;
import net.mcreator.genshinnature.client.model.Modelfalcon;

public class BrownwingfalconRenderer extends MobRenderer<BrownwingfalconEntity, Modelfalcon<BrownwingfalconEntity>> {
	public BrownwingfalconRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelfalcon<BrownwingfalconEntity>(context.bakeLayer(Modelfalcon.LAYER_LOCATION)), 0.7f);
	}

	@Override
	public ResourceLocation getTextureLocation(BrownwingfalconEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/brownwing_falcon.png");
	}
}


package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.SilkwhitefalconEntity;
import net.mcreator.genshinnature.client.model.Modelfalcon;

public class SilkwhitefalconRenderer extends MobRenderer<SilkwhitefalconEntity, Modelfalcon<SilkwhitefalconEntity>> {
	public SilkwhitefalconRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelfalcon<SilkwhitefalconEntity>(context.bakeLayer(Modelfalcon.LAYER_LOCATION)), 0.7f);
	}

	@Override
	public ResourceLocation getTextureLocation(SilkwhitefalconEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/silkwhite_falcon.png");
	}
}

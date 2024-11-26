
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.RuindestroyerEntity;
import net.mcreator.genshinnature.client.model.Modelruin_destroyer;

public class RuindestroyerRenderer extends MobRenderer<RuindestroyerEntity, Modelruin_destroyer<RuindestroyerEntity>> {
	public RuindestroyerRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelruin_destroyer<RuindestroyerEntity>(context.bakeLayer(Modelruin_destroyer.LAYER_LOCATION)), 1.3f);
	}

	@Override
	public ResourceLocation getTextureLocation(RuindestroyerEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/ruin_destroyer.png");
	}
}

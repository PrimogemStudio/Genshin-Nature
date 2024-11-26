
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.FloatinganemofungusEntity;
import net.mcreator.genshinnature.client.model.Modelfloating_dendro_fungi;

public class FloatinganemofungusRenderer extends MobRenderer<FloatinganemofungusEntity, Modelfloating_dendro_fungi<FloatinganemofungusEntity>> {
	public FloatinganemofungusRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelfloating_dendro_fungi<FloatinganemofungusEntity>(context.bakeLayer(Modelfloating_dendro_fungi.LAYER_LOCATION)), 1.2f);
	}

	@Override
	public ResourceLocation getTextureLocation(FloatinganemofungusEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/floating_anemo_fungus.png");
	}
}

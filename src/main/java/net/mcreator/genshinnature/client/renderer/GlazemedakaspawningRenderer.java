
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.GlazemedakaspawningEntity;
import net.mcreator.genshinnature.client.model.Modelmedaka;

public class GlazemedakaspawningRenderer extends MobRenderer<GlazemedakaspawningEntity, Modelmedaka<GlazemedakaspawningEntity>> {
	public GlazemedakaspawningRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmedaka<GlazemedakaspawningEntity>(context.bakeLayer(Modelmedaka.LAYER_LOCATION)), 0.6f);
	}

	@Override
	public ResourceLocation getTextureLocation(GlazemedakaspawningEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/blank_texture.png");
	}
}

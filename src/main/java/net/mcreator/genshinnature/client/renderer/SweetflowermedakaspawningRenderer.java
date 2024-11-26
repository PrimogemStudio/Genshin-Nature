
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.SweetflowermedakaspawningEntity;
import net.mcreator.genshinnature.client.model.Modelmedaka;

public class SweetflowermedakaspawningRenderer extends MobRenderer<SweetflowermedakaspawningEntity, Modelmedaka<SweetflowermedakaspawningEntity>> {
	public SweetflowermedakaspawningRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmedaka<SweetflowermedakaspawningEntity>(context.bakeLayer(Modelmedaka.LAYER_LOCATION)), 0.6f);
	}

	@Override
	public ResourceLocation getTextureLocation(SweetflowermedakaspawningEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/blank_texture.png");
	}
}

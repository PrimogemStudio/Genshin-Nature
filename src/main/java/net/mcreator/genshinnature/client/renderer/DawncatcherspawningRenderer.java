
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.DawncatcherspawningEntity;
import net.mcreator.genshinnature.client.model.Modelmedaka;

public class DawncatcherspawningRenderer extends MobRenderer<DawncatcherspawningEntity, Modelmedaka<DawncatcherspawningEntity>> {
	public DawncatcherspawningRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmedaka<DawncatcherspawningEntity>(context.bakeLayer(Modelmedaka.LAYER_LOCATION)), 0.6f);
	}

	@Override
	public ResourceLocation getTextureLocation(DawncatcherspawningEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/blank_texture.png");
	}
}

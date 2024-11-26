
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.DawncatcherEntity;
import net.mcreator.genshinnature.client.model.Modelmedaka;

public class DawncatcherRenderer extends MobRenderer<DawncatcherEntity, Modelmedaka<DawncatcherEntity>> {
	public DawncatcherRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmedaka<DawncatcherEntity>(context.bakeLayer(Modelmedaka.LAYER_LOCATION)), 0.6f);
	}

	@Override
	public ResourceLocation getTextureLocation(DawncatcherEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/dawncatcher.png");
	}
}

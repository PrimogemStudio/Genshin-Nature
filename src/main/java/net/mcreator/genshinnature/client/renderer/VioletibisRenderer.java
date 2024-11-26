
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.VioletibisEntity;
import net.mcreator.genshinnature.client.model.Modelcrane;

public class VioletibisRenderer extends MobRenderer<VioletibisEntity, Modelcrane<VioletibisEntity>> {
	public VioletibisRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcrane<VioletibisEntity>(context.bakeLayer(Modelcrane.LAYER_LOCATION)), 1f);
	}

	@Override
	public ResourceLocation getTextureLocation(VioletibisEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/violet_ibis.png");
	}
}

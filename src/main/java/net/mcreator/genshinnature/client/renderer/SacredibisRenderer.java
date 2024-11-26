
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.SacredibisEntity;
import net.mcreator.genshinnature.client.model.Modelsacred_ibis;

public class SacredibisRenderer extends MobRenderer<SacredibisEntity, Modelsacred_ibis<SacredibisEntity>> {
	public SacredibisRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelsacred_ibis<SacredibisEntity>(context.bakeLayer(Modelsacred_ibis.LAYER_LOCATION)), 1f);
	}

	@Override
	public ResourceLocation getTextureLocation(SacredibisEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/sacred_ibis.png");
	}
}

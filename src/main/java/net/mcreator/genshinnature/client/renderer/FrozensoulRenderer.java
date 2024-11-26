
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.FrozensoulEntity;
import net.mcreator.genshinnature.client.model.Modelfrozen_soul;

public class FrozensoulRenderer extends MobRenderer<FrozensoulEntity, Modelfrozen_soul<FrozensoulEntity>> {
	public FrozensoulRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelfrozen_soul<FrozensoulEntity>(context.bakeLayer(Modelfrozen_soul.LAYER_LOCATION)), 1f);
	}

	@Override
	public ResourceLocation getTextureLocation(FrozensoulEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/frozen_soul.png");
	}
}

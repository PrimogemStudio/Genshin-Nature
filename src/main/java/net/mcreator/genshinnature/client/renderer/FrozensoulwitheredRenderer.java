
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.FrozensoulwitheredEntity;
import net.mcreator.genshinnature.client.model.Modelfrozen_soul_withered;

public class FrozensoulwitheredRenderer extends MobRenderer<FrozensoulwitheredEntity, Modelfrozen_soul_withered<FrozensoulwitheredEntity>> {
	public FrozensoulwitheredRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelfrozen_soul_withered<FrozensoulwitheredEntity>(context.bakeLayer(Modelfrozen_soul_withered.LAYER_LOCATION)), 1f);
	}

	@Override
	public ResourceLocation getTextureLocation(FrozensoulwitheredEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/frozen_soul_withered.png");
	}
}

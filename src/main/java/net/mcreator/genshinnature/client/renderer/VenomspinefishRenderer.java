
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.VenomspinefishEntity;
import net.mcreator.genshinnature.client.model.Modelsticklebacks;

public class VenomspinefishRenderer extends MobRenderer<VenomspinefishEntity, Modelsticklebacks<VenomspinefishEntity>> {
	public VenomspinefishRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelsticklebacks<VenomspinefishEntity>(context.bakeLayer(Modelsticklebacks.LAYER_LOCATION)), 1.2f);
	}

	@Override
	public ResourceLocation getTextureLocation(VenomspinefishEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/venomspine_fish.png");
	}
}

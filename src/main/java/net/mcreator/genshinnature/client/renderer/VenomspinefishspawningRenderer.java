
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.VenomspinefishspawningEntity;
import net.mcreator.genshinnature.client.model.Modelsticklebacks;

public class VenomspinefishspawningRenderer extends MobRenderer<VenomspinefishspawningEntity, Modelsticklebacks<VenomspinefishspawningEntity>> {
	public VenomspinefishspawningRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelsticklebacks<VenomspinefishspawningEntity>(context.bakeLayer(Modelsticklebacks.LAYER_LOCATION)), 1.2f);
	}

	@Override
	public ResourceLocation getTextureLocation(VenomspinefishspawningEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/blank_texture.png");
	}
}

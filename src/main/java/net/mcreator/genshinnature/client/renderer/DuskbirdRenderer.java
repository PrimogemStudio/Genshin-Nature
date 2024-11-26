
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.DuskbirdEntity;
import net.mcreator.genshinnature.client.model.Modeldusk_bird_fixed;

public class DuskbirdRenderer extends MobRenderer<DuskbirdEntity, Modeldusk_bird_fixed<DuskbirdEntity>> {
	public DuskbirdRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeldusk_bird_fixed<DuskbirdEntity>(context.bakeLayer(Modeldusk_bird_fixed.LAYER_LOCATION)), 0.7f);
	}

	@Override
	public ResourceLocation getTextureLocation(DuskbirdEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/dusk_bird.png");
	}
}

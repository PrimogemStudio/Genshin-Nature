
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.ShootingminionEntity;
import net.mcreator.genshinnature.client.model.Modelshooting_minion;

public class ShootingminionRenderer extends MobRenderer<ShootingminionEntity, Modelshooting_minion<ShootingminionEntity>> {
	public ShootingminionRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelshooting_minion<ShootingminionEntity>(context.bakeLayer(Modelshooting_minion.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(ShootingminionEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/shooting_minion.png");
	}
}

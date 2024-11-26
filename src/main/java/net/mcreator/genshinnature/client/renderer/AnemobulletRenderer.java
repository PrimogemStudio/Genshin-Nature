
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.AnemobulletEntity;
import net.mcreator.genshinnature.client.model.Modelanemo_bullet;

public class AnemobulletRenderer extends MobRenderer<AnemobulletEntity, Modelanemo_bullet<AnemobulletEntity>> {
	public AnemobulletRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelanemo_bullet<AnemobulletEntity>(context.bakeLayer(Modelanemo_bullet.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(AnemobulletEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/anemo_bullet.png");
	}
}

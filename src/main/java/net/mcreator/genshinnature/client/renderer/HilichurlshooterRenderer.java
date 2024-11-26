
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.HilichurlshooterEntity;
import net.mcreator.genshinnature.client.model.Modelhilichurl_shooter;

public class HilichurlshooterRenderer extends MobRenderer<HilichurlshooterEntity, Modelhilichurl_shooter<HilichurlshooterEntity>> {
	public HilichurlshooterRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelhilichurl_shooter<HilichurlshooterEntity>(context.bakeLayer(Modelhilichurl_shooter.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(HilichurlshooterEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/hilichurl_shooter.png");
	}
}

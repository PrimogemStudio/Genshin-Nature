
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.HilichurlcryoshooterEntity;
import net.mcreator.genshinnature.client.model.Modelhilichurl_cryo_shooter;

public class HilichurlcryoshooterRenderer extends MobRenderer<HilichurlcryoshooterEntity, Modelhilichurl_cryo_shooter<HilichurlcryoshooterEntity>> {
	public HilichurlcryoshooterRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelhilichurl_cryo_shooter<HilichurlcryoshooterEntity>(context.bakeLayer(Modelhilichurl_cryo_shooter.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(HilichurlcryoshooterEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/hilichurl_cryo_shooter.png");
	}
}

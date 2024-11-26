
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.HilichurlpyroshooterEntity;
import net.mcreator.genshinnature.client.model.Modelhilichurl_pyro_shooter;

public class HilichurlpyroshooterRenderer extends MobRenderer<HilichurlpyroshooterEntity, Modelhilichurl_pyro_shooter<HilichurlpyroshooterEntity>> {
	public HilichurlpyroshooterRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelhilichurl_pyro_shooter<HilichurlpyroshooterEntity>(context.bakeLayer(Modelhilichurl_pyro_shooter.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(HilichurlpyroshooterEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/hilichurl_pyro_shooter.png");
	}
}

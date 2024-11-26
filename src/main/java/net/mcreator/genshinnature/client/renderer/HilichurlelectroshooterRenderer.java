
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.HilichurlelectroshooterEntity;
import net.mcreator.genshinnature.client.model.Modelhilichurl_electro_shooter;

public class HilichurlelectroshooterRenderer extends MobRenderer<HilichurlelectroshooterEntity, Modelhilichurl_electro_shooter<HilichurlelectroshooterEntity>> {
	public HilichurlelectroshooterRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelhilichurl_electro_shooter<HilichurlelectroshooterEntity>(context.bakeLayer(Modelhilichurl_electro_shooter.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(HilichurlelectroshooterEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/hilichurl_electro_shooter.png");
	}
}

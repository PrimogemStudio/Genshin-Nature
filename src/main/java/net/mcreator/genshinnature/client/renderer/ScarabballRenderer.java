
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.ScarabballEntity;
import net.mcreator.genshinnature.client.model.Modelscarab_ball;

public class ScarabballRenderer extends MobRenderer<ScarabballEntity, Modelscarab_ball<ScarabballEntity>> {
	public ScarabballRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelscarab_ball<ScarabballEntity>(context.bakeLayer(Modelscarab_ball.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(ScarabballEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/scarab_ball.png");
	}
}

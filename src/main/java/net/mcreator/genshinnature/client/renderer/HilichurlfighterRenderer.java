
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.HilichurlfighterEntity;
import net.mcreator.genshinnature.client.model.Modelhilichurl_fighter;

public class HilichurlfighterRenderer extends MobRenderer<HilichurlfighterEntity, Modelhilichurl_fighter<HilichurlfighterEntity>> {
	public HilichurlfighterRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelhilichurl_fighter<HilichurlfighterEntity>(context.bakeLayer(Modelhilichurl_fighter.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(HilichurlfighterEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/hilichurl_fighter.png");
	}
}

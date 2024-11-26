
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.WaterminioncrabEntity;
import net.mcreator.genshinnature.client.model.Modelcrab;

public class WaterminioncrabRenderer extends MobRenderer<WaterminioncrabEntity, Modelcrab<WaterminioncrabEntity>> {
	public WaterminioncrabRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcrab<WaterminioncrabEntity>(context.bakeLayer(Modelcrab.LAYER_LOCATION)), 0.6f);
	}

	@Override
	public ResourceLocation getTextureLocation(WaterminioncrabEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/waterminion_texture.png");
	}
}

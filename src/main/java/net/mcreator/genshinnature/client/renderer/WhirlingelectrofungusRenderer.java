
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.WhirlingelectrofungusEntity;
import net.mcreator.genshinnature.client.model.Modelwhirling_electro_fungus_final;

public class WhirlingelectrofungusRenderer extends MobRenderer<WhirlingelectrofungusEntity, Modelwhirling_electro_fungus_final<WhirlingelectrofungusEntity>> {
	public WhirlingelectrofungusRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelwhirling_electro_fungus_final<WhirlingelectrofungusEntity>(context.bakeLayer(Modelwhirling_electro_fungus_final.LAYER_LOCATION)), 0.6f);
	}

	@Override
	public ResourceLocation getTextureLocation(WhirlingelectrofungusEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/whirling_electro_fungus_final.png");
	}
}

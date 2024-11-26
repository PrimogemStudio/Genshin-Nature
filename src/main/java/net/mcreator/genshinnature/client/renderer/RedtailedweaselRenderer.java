
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.RedtailedweaselEntity;
import net.mcreator.genshinnature.client.model.Modelweasel_fixed;

public class RedtailedweaselRenderer extends MobRenderer<RedtailedweaselEntity, Modelweasel_fixed<RedtailedweaselEntity>> {
	public RedtailedweaselRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelweasel_fixed<RedtailedweaselEntity>(context.bakeLayer(Modelweasel_fixed.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(RedtailedweaselEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/redtailed_weasel_fixed.png");
	}
}

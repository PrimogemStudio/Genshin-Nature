
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.CrimsonflankpigeonEntity;
import net.mcreator.genshinnature.client.model.Modelwhite_pigeon;

public class CrimsonflankpigeonRenderer extends MobRenderer<CrimsonflankpigeonEntity, Modelwhite_pigeon<CrimsonflankpigeonEntity>> {
	public CrimsonflankpigeonRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelwhite_pigeon<CrimsonflankpigeonEntity>(context.bakeLayer(Modelwhite_pigeon.LAYER_LOCATION)), 0.6f);
	}

	@Override
	public ResourceLocation getTextureLocation(CrimsonflankpigeonEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/crimsonflank_pigeon.png");
	}
}

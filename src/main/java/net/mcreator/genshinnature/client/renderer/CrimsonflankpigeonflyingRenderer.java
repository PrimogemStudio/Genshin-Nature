
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.CrimsonflankpigeonflyingEntity;
import net.mcreator.genshinnature.client.model.Modelwhite_pigeon_flying;

public class CrimsonflankpigeonflyingRenderer extends MobRenderer<CrimsonflankpigeonflyingEntity, Modelwhite_pigeon_flying<CrimsonflankpigeonflyingEntity>> {
	public CrimsonflankpigeonflyingRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelwhite_pigeon_flying<CrimsonflankpigeonflyingEntity>(context.bakeLayer(Modelwhite_pigeon_flying.LAYER_LOCATION)), 0.6f);
	}

	@Override
	public ResourceLocation getTextureLocation(CrimsonflankpigeonflyingEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/crimsonflank_pigeon.png");
	}
}

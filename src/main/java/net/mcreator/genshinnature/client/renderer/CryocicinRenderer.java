
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.CryocicinEntity;
import net.mcreator.genshinnature.client.model.Modelcryo_cicin;

public class CryocicinRenderer extends MobRenderer<CryocicinEntity, Modelcryo_cicin<CryocicinEntity>> {
	public CryocicinRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcryo_cicin<CryocicinEntity>(context.bakeLayer(Modelcryo_cicin.LAYER_LOCATION)), 0.6f);
	}

	@Override
	public ResourceLocation getTextureLocation(CryocicinEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/cryo_cicin.png");
	}
}

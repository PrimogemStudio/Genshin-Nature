
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.CryosamachurlEntity;
import net.mcreator.genshinnature.client.model.Modelsamachurl_cryo;

public class CryosamachurlRenderer extends MobRenderer<CryosamachurlEntity, Modelsamachurl_cryo<CryosamachurlEntity>> {
	public CryosamachurlRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelsamachurl_cryo<CryosamachurlEntity>(context.bakeLayer(Modelsamachurl_cryo.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(CryosamachurlEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/samachurl_cryo.png");
	}
}

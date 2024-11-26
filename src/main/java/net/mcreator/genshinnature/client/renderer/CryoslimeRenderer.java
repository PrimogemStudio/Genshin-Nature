
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.CryoslimeEntity;
import net.mcreator.genshinnature.client.model.Modelcryoslime;

public class CryoslimeRenderer extends MobRenderer<CryoslimeEntity, Modelcryoslime<CryoslimeEntity>> {
	public CryoslimeRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcryoslime<CryoslimeEntity>(context.bakeLayer(Modelcryoslime.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(CryoslimeEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/cryoslime.png");
	}
}

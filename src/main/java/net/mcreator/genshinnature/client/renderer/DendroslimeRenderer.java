
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.DendroslimeEntity;
import net.mcreator.genshinnature.client.model.Modeldendroslime;

public class DendroslimeRenderer extends MobRenderer<DendroslimeEntity, Modeldendroslime<DendroslimeEntity>> {
	public DendroslimeRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeldendroslime<DendroslimeEntity>(context.bakeLayer(Modeldendroslime.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(DendroslimeEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/dendroslime.png");
	}
}

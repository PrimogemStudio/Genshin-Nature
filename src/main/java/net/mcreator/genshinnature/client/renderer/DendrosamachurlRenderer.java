
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.DendrosamachurlEntity;
import net.mcreator.genshinnature.client.model.Modelsamachurl_dendro;

public class DendrosamachurlRenderer extends MobRenderer<DendrosamachurlEntity, Modelsamachurl_dendro<DendrosamachurlEntity>> {
	public DendrosamachurlRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelsamachurl_dendro<DendrosamachurlEntity>(context.bakeLayer(Modelsamachurl_dendro.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(DendrosamachurlEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/samachurl_dendro.png");
	}
}

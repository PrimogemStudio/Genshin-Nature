
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.GlacialmineEntity;
import net.mcreator.genshinnature.client.model.Modelglacial_mine;

public class GlacialmineRenderer extends MobRenderer<GlacialmineEntity, Modelglacial_mine<GlacialmineEntity>> {
	public GlacialmineRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelglacial_mine<GlacialmineEntity>(context.bakeLayer(Modelglacial_mine.LAYER_LOCATION)), 1f);
	}

	@Override
	public ResourceLocation getTextureLocation(GlacialmineEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/glacial_mine.png");
	}
}

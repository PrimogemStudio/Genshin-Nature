
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.MoonfinEntity;
import net.mcreator.genshinnature.client.model.Modelshirakodai;

public class MoonfinRenderer extends MobRenderer<MoonfinEntity, Modelshirakodai<MoonfinEntity>> {
	public MoonfinRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelshirakodai<MoonfinEntity>(context.bakeLayer(Modelshirakodai.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(MoonfinEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/moonfin.png");
	}
}

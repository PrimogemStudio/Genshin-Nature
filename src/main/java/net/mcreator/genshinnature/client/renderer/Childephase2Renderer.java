
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.Childephase2Entity;
import net.mcreator.genshinnature.client.model.Modelchilde;

public class Childephase2Renderer extends MobRenderer<Childephase2Entity, Modelchilde<Childephase2Entity>> {
	public Childephase2Renderer(EntityRendererProvider.Context context) {
		super(context, new Modelchilde<Childephase2Entity>(context.bakeLayer(Modelchilde.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(Childephase2Entity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/childe.png");
	}
}

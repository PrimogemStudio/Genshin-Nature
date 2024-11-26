
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.AbidingangelfishEntity;
import net.mcreator.genshinnature.client.model.Modelshirakodai;

public class AbidingangelfishRenderer extends MobRenderer<AbidingangelfishEntity, Modelshirakodai<AbidingangelfishEntity>> {
	public AbidingangelfishRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelshirakodai<AbidingangelfishEntity>(context.bakeLayer(Modelshirakodai.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(AbidingangelfishEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/abiding_angelfish.png");
	}
}

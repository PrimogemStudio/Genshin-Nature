
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.AbidingangelfishspawningEntity;
import net.mcreator.genshinnature.client.model.Modelshirakodai;

public class AbidingangelfishspawningRenderer extends MobRenderer<AbidingangelfishspawningEntity, Modelshirakodai<AbidingangelfishspawningEntity>> {
	public AbidingangelfishspawningRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelshirakodai<AbidingangelfishspawningEntity>(context.bakeLayer(Modelshirakodai.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(AbidingangelfishspawningEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/blank_texture.png");
	}
}

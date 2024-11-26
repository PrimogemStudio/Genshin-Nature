
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.ShikikoshouEntity;
import net.mcreator.genshinnature.client.model.Modelshiki_koshou;

public class ShikikoshouRenderer extends MobRenderer<ShikikoshouEntity, Modelshiki_koshou<ShikikoshouEntity>> {
	public ShikikoshouRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelshiki_koshou<ShikikoshouEntity>(context.bakeLayer(Modelshiki_koshou.LAYER_LOCATION)), 0.3f);
	}

	@Override
	public ResourceLocation getTextureLocation(ShikikoshouEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/shiki_koshou_entity.png");
	}
}

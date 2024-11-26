
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.CrystalfishspawningEntity;
import net.mcreator.genshinnature.client.model.Modelmedaka;

public class CrystalfishspawningRenderer extends MobRenderer<CrystalfishspawningEntity, Modelmedaka<CrystalfishspawningEntity>> {
	public CrystalfishspawningRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmedaka<CrystalfishspawningEntity>(context.bakeLayer(Modelmedaka.LAYER_LOCATION)), 0.6f);
	}

	@Override
	public ResourceLocation getTextureLocation(CrystalfishspawningEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/blank_texture.png");
	}
}

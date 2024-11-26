
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.CrystalfishEntity;
import net.mcreator.genshinnature.client.model.Modelmedaka;

public class CrystalfishRenderer extends MobRenderer<CrystalfishEntity, Modelmedaka<CrystalfishEntity>> {
	public CrystalfishRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmedaka<CrystalfishEntity>(context.bakeLayer(Modelmedaka.LAYER_LOCATION)), 0.6f);
	}

	@Override
	public ResourceLocation getTextureLocation(CrystalfishEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/crystalfish.png");
	}
}


package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.OnikabutoridingEntity;
import net.mcreator.genshinnature.client.model.Modelonikabuto_riding;

public class OnikabutoridingRenderer extends MobRenderer<OnikabutoridingEntity, Modelonikabuto_riding<OnikabutoridingEntity>> {
	public OnikabutoridingRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelonikabuto_riding<OnikabutoridingEntity>(context.bakeLayer(Modelonikabuto_riding.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(OnikabutoridingEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/onikabuto.png");
	}
}

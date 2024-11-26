
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.FatuipyroagentEntity;
import net.mcreator.genshinnature.client.model.Modelfatui_pyro_agent;

public class FatuipyroagentRenderer extends MobRenderer<FatuipyroagentEntity, Modelfatui_pyro_agent<FatuipyroagentEntity>> {
	public FatuipyroagentRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelfatui_pyro_agent<FatuipyroagentEntity>(context.bakeLayer(Modelfatui_pyro_agent.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(FatuipyroagentEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/fatui_pyro_agent.png");
	}
}

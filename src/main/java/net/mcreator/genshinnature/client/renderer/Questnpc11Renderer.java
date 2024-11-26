
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.Questnpc11Entity;
import net.mcreator.genshinnature.client.model.Modelquest_npc_alex;

public class Questnpc11Renderer extends MobRenderer<Questnpc11Entity, Modelquest_npc_alex<Questnpc11Entity>> {
	public Questnpc11Renderer(EntityRendererProvider.Context context) {
		super(context, new Modelquest_npc_alex<Questnpc11Entity>(context.bakeLayer(Modelquest_npc_alex.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(Questnpc11Entity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/kloxedge.png");
	}
}

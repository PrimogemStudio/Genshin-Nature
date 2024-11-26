
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.Questnpc9Entity;
import net.mcreator.genshinnature.client.model.Modelquest_npc_alex;

public class Questnpc9Renderer extends MobRenderer<Questnpc9Entity, Modelquest_npc_alex<Questnpc9Entity>> {
	public Questnpc9Renderer(EntityRendererProvider.Context context) {
		super(context, new Modelquest_npc_alex<Questnpc9Entity>(context.bakeLayer(Modelquest_npc_alex.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(Questnpc9Entity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/djpgirl.png");
	}
}

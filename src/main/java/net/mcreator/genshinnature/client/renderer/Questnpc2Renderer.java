
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.Questnpc2Entity;
import net.mcreator.genshinnature.client.model.Modelquest_npc_alex;

public class Questnpc2Renderer extends MobRenderer<Questnpc2Entity, Modelquest_npc_alex<Questnpc2Entity>> {
	public Questnpc2Renderer(EntityRendererProvider.Context context) {
		super(context, new Modelquest_npc_alex<Questnpc2Entity>(context.bakeLayer(Modelquest_npc_alex.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(Questnpc2Entity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/snowyfeather.png");
	}
}

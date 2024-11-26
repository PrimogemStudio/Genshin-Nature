
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.Questnpc13Entity;
import net.mcreator.genshinnature.client.model.Modelquest_npc_steve;

public class Questnpc13Renderer extends MobRenderer<Questnpc13Entity, Modelquest_npc_steve<Questnpc13Entity>> {
	public Questnpc13Renderer(EntityRendererProvider.Context context) {
		super(context, new Modelquest_npc_steve<Questnpc13Entity>(context.bakeLayer(Modelquest_npc_steve.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(Questnpc13Entity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/jakekitten.png");
	}
}

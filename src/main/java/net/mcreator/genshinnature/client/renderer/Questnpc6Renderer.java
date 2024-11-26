
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.Questnpc6Entity;
import net.mcreator.genshinnature.client.model.Modelquest_npc_steve;

public class Questnpc6Renderer extends MobRenderer<Questnpc6Entity, Modelquest_npc_steve<Questnpc6Entity>> {
	public Questnpc6Renderer(EntityRendererProvider.Context context) {
		super(context, new Modelquest_npc_steve<Questnpc6Entity>(context.bakeLayer(Modelquest_npc_steve.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(Questnpc6Entity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/royling.png");
	}
}

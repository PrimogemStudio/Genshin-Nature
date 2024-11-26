
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.Questnpc17Entity;
import net.mcreator.genshinnature.client.model.Modelquest_npc_steve;

public class Questnpc17Renderer extends MobRenderer<Questnpc17Entity, Modelquest_npc_steve<Questnpc17Entity>> {
	public Questnpc17Renderer(EntityRendererProvider.Context context) {
		super(context, new Modelquest_npc_steve<Questnpc17Entity>(context.bakeLayer(Modelquest_npc_steve.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(Questnpc17Entity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/generic_quest_npc.png");
	}
}

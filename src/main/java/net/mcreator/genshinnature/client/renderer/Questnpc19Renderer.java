
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.Questnpc19Entity;
import net.mcreator.genshinnature.client.model.Modelquest_npc_steve;

public class Questnpc19Renderer extends MobRenderer<Questnpc19Entity, Modelquest_npc_steve<Questnpc19Entity>> {
	public Questnpc19Renderer(EntityRendererProvider.Context context) {
		super(context, new Modelquest_npc_steve<Questnpc19Entity>(context.bakeLayer(Modelquest_npc_steve.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(Questnpc19Entity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/generic_quest_npc.png");
	}
}

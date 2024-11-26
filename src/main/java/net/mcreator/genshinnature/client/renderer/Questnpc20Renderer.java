
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.Questnpc20Entity;
import net.mcreator.genshinnature.client.model.Modelquest_npc_steve;

public class Questnpc20Renderer extends MobRenderer<Questnpc20Entity, Modelquest_npc_steve<Questnpc20Entity>> {
	public Questnpc20Renderer(EntityRendererProvider.Context context) {
		super(context, new Modelquest_npc_steve<Questnpc20Entity>(context.bakeLayer(Modelquest_npc_steve.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(Questnpc20Entity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/generic_quest_npc.png");
	}
}

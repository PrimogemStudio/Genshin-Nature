
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.Questnpc16Entity;
import net.mcreator.genshinnature.client.model.Modelquest_npc_steve;

public class Questnpc16Renderer extends MobRenderer<Questnpc16Entity, Modelquest_npc_steve<Questnpc16Entity>> {
	public Questnpc16Renderer(EntityRendererProvider.Context context) {
		super(context, new Modelquest_npc_steve<Questnpc16Entity>(context.bakeLayer(Modelquest_npc_steve.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(Questnpc16Entity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/generic_quest_npc.png");
	}
}

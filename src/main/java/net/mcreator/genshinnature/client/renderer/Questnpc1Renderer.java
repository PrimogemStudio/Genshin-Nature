
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.Questnpc1Entity;
import net.mcreator.genshinnature.client.model.Modelquest_npc_steve;

public class Questnpc1Renderer extends MobRenderer<Questnpc1Entity, Modelquest_npc_steve<Questnpc1Entity>> {
	public Questnpc1Renderer(EntityRendererProvider.Context context) {
		super(context, new Modelquest_npc_steve<Questnpc1Entity>(context.bakeLayer(Modelquest_npc_steve.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(Questnpc1Entity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/bored_guy.png");
	}
}

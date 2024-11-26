
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.Questnpc12Entity;
import net.mcreator.genshinnature.client.model.Modelquest_npc_steve;

public class Questnpc12Renderer extends MobRenderer<Questnpc12Entity, Modelquest_npc_steve<Questnpc12Entity>> {
	public Questnpc12Renderer(EntityRendererProvider.Context context) {
		super(context, new Modelquest_npc_steve<Questnpc12Entity>(context.bakeLayer(Modelquest_npc_steve.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(Questnpc12Entity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/trok.png");
	}
}

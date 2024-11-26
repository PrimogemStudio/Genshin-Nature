
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.Questnpc18Entity;
import net.mcreator.genshinnature.client.model.Modelquest_npc_steve;

public class Questnpc18Renderer extends MobRenderer<Questnpc18Entity, Modelquest_npc_steve<Questnpc18Entity>> {
	public Questnpc18Renderer(EntityRendererProvider.Context context) {
		super(context, new Modelquest_npc_steve<Questnpc18Entity>(context.bakeLayer(Modelquest_npc_steve.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(Questnpc18Entity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/husbandog.png");
	}
}

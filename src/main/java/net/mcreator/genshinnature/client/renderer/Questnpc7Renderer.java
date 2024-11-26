
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.Questnpc7Entity;
import net.mcreator.genshinnature.client.model.Modelquest_npc_steve;

public class Questnpc7Renderer extends MobRenderer<Questnpc7Entity, Modelquest_npc_steve<Questnpc7Entity>> {
	public Questnpc7Renderer(EntityRendererProvider.Context context) {
		super(context, new Modelquest_npc_steve<Questnpc7Entity>(context.bakeLayer(Modelquest_npc_steve.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(Questnpc7Entity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/emperor21.png");
	}
}


package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.Questnpc10Entity;
import net.mcreator.genshinnature.client.model.Modelquest_npc_steve;

public class Questnpc10Renderer extends MobRenderer<Questnpc10Entity, Modelquest_npc_steve<Questnpc10Entity>> {
	public Questnpc10Renderer(EntityRendererProvider.Context context) {
		super(context, new Modelquest_npc_steve<Questnpc10Entity>(context.bakeLayer(Modelquest_npc_steve.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(Questnpc10Entity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/eeveemaster547.png");
	}
}

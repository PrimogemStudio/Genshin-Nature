
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.Questnpc4Entity;
import net.mcreator.genshinnature.client.model.Modelquest_npc_steve;

public class Questnpc4Renderer extends MobRenderer<Questnpc4Entity, Modelquest_npc_steve<Questnpc4Entity>> {
	public Questnpc4Renderer(EntityRendererProvider.Context context) {
		super(context, new Modelquest_npc_steve<Questnpc4Entity>(context.bakeLayer(Modelquest_npc_steve.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(Questnpc4Entity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/chipp.png");
	}
}


package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.Questnpc15Entity;
import net.mcreator.genshinnature.client.model.Modelquest_npc_steve;

public class Questnpc15Renderer extends MobRenderer<Questnpc15Entity, Modelquest_npc_steve<Questnpc15Entity>> {
	public Questnpc15Renderer(EntityRendererProvider.Context context) {
		super(context, new Modelquest_npc_steve<Questnpc15Entity>(context.bakeLayer(Modelquest_npc_steve.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(Questnpc15Entity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/ender_queen.png");
	}
}


package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.Questnpc5Entity;
import net.mcreator.genshinnature.client.model.Modelquest_npc_alex;

public class Questnpc5Renderer extends MobRenderer<Questnpc5Entity, Modelquest_npc_alex<Questnpc5Entity>> {
	public Questnpc5Renderer(EntityRendererProvider.Context context) {
		super(context, new Modelquest_npc_alex<Questnpc5Entity>(context.bakeLayer(Modelquest_npc_alex.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(Questnpc5Entity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/coolspice646.png");
	}
}

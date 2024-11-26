
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.Questnpc3Entity;
import net.mcreator.genshinnature.client.model.Modelquest_npc_alex;

public class Questnpc3Renderer extends MobRenderer<Questnpc3Entity, Modelquest_npc_alex<Questnpc3Entity>> {
	public Questnpc3Renderer(EntityRendererProvider.Context context) {
		super(context, new Modelquest_npc_alex<Questnpc3Entity>(context.bakeLayer(Modelquest_npc_alex.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(Questnpc3Entity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/boiblox69.png");
	}
}

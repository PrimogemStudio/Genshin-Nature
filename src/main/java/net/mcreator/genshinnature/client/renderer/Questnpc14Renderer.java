
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.Questnpc14Entity;
import net.mcreator.genshinnature.client.model.Modelquest_npc_steve;

public class Questnpc14Renderer extends MobRenderer<Questnpc14Entity, Modelquest_npc_steve<Questnpc14Entity>> {
	public Questnpc14Renderer(EntityRendererProvider.Context context) {
		super(context, new Modelquest_npc_steve<Questnpc14Entity>(context.bakeLayer(Modelquest_npc_steve.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(Questnpc14Entity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/melodicsiren.png");
	}
}

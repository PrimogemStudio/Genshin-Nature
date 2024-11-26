
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.Questnpc8Entity;
import net.mcreator.genshinnature.client.model.Modelquest_npc_steve;

public class Questnpc8Renderer extends MobRenderer<Questnpc8Entity, Modelquest_npc_steve<Questnpc8Entity>> {
	public Questnpc8Renderer(EntityRendererProvider.Context context) {
		super(context, new Modelquest_npc_steve<Questnpc8Entity>(context.bakeLayer(Modelquest_npc_steve.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(Questnpc8Entity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/cyrus.png");
	}
}

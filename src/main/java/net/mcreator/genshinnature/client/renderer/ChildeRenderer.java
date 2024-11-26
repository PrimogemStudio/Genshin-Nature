
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.ChildeEntity;
import net.mcreator.genshinnature.client.model.Modelquest_npc_alex;

public class ChildeRenderer extends MobRenderer<ChildeEntity, Modelquest_npc_alex<ChildeEntity>> {
	public ChildeRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelquest_npc_alex<ChildeEntity>(context.bakeLayer(Modelquest_npc_alex.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(ChildeEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/tartaglia_plushie.png");
	}
}

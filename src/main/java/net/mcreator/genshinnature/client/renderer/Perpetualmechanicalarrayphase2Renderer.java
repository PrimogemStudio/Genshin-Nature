
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.Perpetualmechanicalarrayphase2Entity;
import net.mcreator.genshinnature.client.model.Modelperpetual_mechanical_array_sword;

public class Perpetualmechanicalarrayphase2Renderer extends MobRenderer<Perpetualmechanicalarrayphase2Entity, Modelperpetual_mechanical_array_sword<Perpetualmechanicalarrayphase2Entity>> {
	public Perpetualmechanicalarrayphase2Renderer(EntityRendererProvider.Context context) {
		super(context, new Modelperpetual_mechanical_array_sword<Perpetualmechanicalarrayphase2Entity>(context.bakeLayer(Modelperpetual_mechanical_array_sword.LAYER_LOCATION)), 1f);
	}

	@Override
	public ResourceLocation getTextureLocation(Perpetualmechanicalarrayphase2Entity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/perpetual_mechanical_array.png");
	}
}

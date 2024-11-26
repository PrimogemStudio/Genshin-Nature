
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.CryoregisvineEntity;
import net.mcreator.genshinnature.client.model.Modelcryo_regisvine;

public class CryoregisvineRenderer extends MobRenderer<CryoregisvineEntity, Modelcryo_regisvine<CryoregisvineEntity>> {
	public CryoregisvineRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcryo_regisvine<CryoregisvineEntity>(context.bakeLayer(Modelcryo_regisvine.LAYER_LOCATION)), 4f);
	}

	@Override
	public ResourceLocation getTextureLocation(CryoregisvineEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/cryo_regisvine.png");
	}
}


package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.ElectroregisvineEntity;
import net.mcreator.genshinnature.client.model.Modelelectro_regisvine;

public class ElectroregisvineRenderer extends MobRenderer<ElectroregisvineEntity, Modelelectro_regisvine<ElectroregisvineEntity>> {
	public ElectroregisvineRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelelectro_regisvine<ElectroregisvineEntity>(context.bakeLayer(Modelelectro_regisvine.LAYER_LOCATION)), 3.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(ElectroregisvineEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/electro_regisvine.png");
	}
}

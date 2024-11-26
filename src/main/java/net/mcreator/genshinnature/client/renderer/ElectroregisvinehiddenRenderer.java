
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.ElectroregisvinehiddenEntity;
import net.mcreator.genshinnature.client.model.Modelelectro_regisvine_hidden;

public class ElectroregisvinehiddenRenderer extends MobRenderer<ElectroregisvinehiddenEntity, Modelelectro_regisvine_hidden<ElectroregisvinehiddenEntity>> {
	public ElectroregisvinehiddenRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelelectro_regisvine_hidden<ElectroregisvinehiddenEntity>(context.bakeLayer(Modelelectro_regisvine_hidden.LAYER_LOCATION)), 2f);
	}

	@Override
	public ResourceLocation getTextureLocation(ElectroregisvinehiddenEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/electro_regisvine.png");
	}
}

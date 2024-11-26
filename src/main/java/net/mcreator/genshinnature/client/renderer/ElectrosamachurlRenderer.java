
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.ElectrosamachurlEntity;
import net.mcreator.genshinnature.client.model.Modelsamachurl_electro;

public class ElectrosamachurlRenderer extends MobRenderer<ElectrosamachurlEntity, Modelsamachurl_electro<ElectrosamachurlEntity>> {
	public ElectrosamachurlRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelsamachurl_electro<ElectrosamachurlEntity>(context.bakeLayer(Modelsamachurl_electro.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(ElectrosamachurlEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/samachurl_electro.png");
	}
}

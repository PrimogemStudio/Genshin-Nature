
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.HalcyonjadeaxemarlinEntity;
import net.mcreator.genshinnature.client.model.Modelaxe_marlin;

public class HalcyonjadeaxemarlinRenderer extends MobRenderer<HalcyonjadeaxemarlinEntity, Modelaxe_marlin<HalcyonjadeaxemarlinEntity>> {
	public HalcyonjadeaxemarlinRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelaxe_marlin<HalcyonjadeaxemarlinEntity>(context.bakeLayer(Modelaxe_marlin.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(HalcyonjadeaxemarlinEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/halcyon_jade_axe_marlin.png");
	}
}


package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.HalcyonjadeaxemarlinspawningEntity;
import net.mcreator.genshinnature.client.model.Modelaxe_marlin;

public class HalcyonjadeaxemarlinspawningRenderer extends MobRenderer<HalcyonjadeaxemarlinspawningEntity, Modelaxe_marlin<HalcyonjadeaxemarlinspawningEntity>> {
	public HalcyonjadeaxemarlinspawningRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelaxe_marlin<HalcyonjadeaxemarlinspawningEntity>(context.bakeLayer(Modelaxe_marlin.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(HalcyonjadeaxemarlinspawningEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/blank_texture.png");
	}
}

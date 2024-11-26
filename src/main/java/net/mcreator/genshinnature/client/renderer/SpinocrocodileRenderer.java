
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.SpinocrocodileEntity;
import net.mcreator.genshinnature.client.model.Modelspinocrocodile;

public class SpinocrocodileRenderer extends MobRenderer<SpinocrocodileEntity, Modelspinocrocodile<SpinocrocodileEntity>> {
	public SpinocrocodileRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelspinocrocodile<SpinocrocodileEntity>(context.bakeLayer(Modelspinocrocodile.LAYER_LOCATION)), 1f);
	}

	@Override
	public ResourceLocation getTextureLocation(SpinocrocodileEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/spinocrocodile.png");
	}
}

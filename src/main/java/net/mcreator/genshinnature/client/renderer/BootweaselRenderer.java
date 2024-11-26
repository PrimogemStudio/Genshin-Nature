
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.BootweaselEntity;
import net.mcreator.genshinnature.client.model.Modelweasel_fixed;

public class BootweaselRenderer extends MobRenderer<BootweaselEntity, Modelweasel_fixed<BootweaselEntity>> {
	public BootweaselRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelweasel_fixed<BootweaselEntity>(context.bakeLayer(Modelweasel_fixed.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(BootweaselEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/boot_weasel_fixed.png");
	}
}

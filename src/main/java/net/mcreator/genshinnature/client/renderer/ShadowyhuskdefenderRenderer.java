
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.ShadowyhuskdefenderEntity;
import net.mcreator.genshinnature.client.model.Modelshadowy_husk_fixed;

public class ShadowyhuskdefenderRenderer extends MobRenderer<ShadowyhuskdefenderEntity, Modelshadowy_husk_fixed<ShadowyhuskdefenderEntity>> {
	public ShadowyhuskdefenderRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelshadowy_husk_fixed<ShadowyhuskdefenderEntity>(context.bakeLayer(Modelshadowy_husk_fixed.LAYER_LOCATION)), 1f);
	}

	@Override
	public ResourceLocation getTextureLocation(ShadowyhuskdefenderEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/shadowy_husk_defender.png");
	}
}

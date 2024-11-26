
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.MoonfinspawningEntity;
import net.mcreator.genshinnature.client.model.Modelshirakodai;

public class MoonfinspawningRenderer extends MobRenderer<MoonfinspawningEntity, Modelshirakodai<MoonfinspawningEntity>> {
	public MoonfinspawningRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelshirakodai<MoonfinspawningEntity>(context.bakeLayer(Modelshirakodai.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(MoonfinspawningEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/blank_texture.png");
	}
}

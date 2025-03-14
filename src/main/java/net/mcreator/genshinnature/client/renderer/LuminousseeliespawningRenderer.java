
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.LuminousseeliespawningEntity;
import net.mcreator.genshinnature.client.model.Modelseelie;

public class LuminousseeliespawningRenderer extends MobRenderer<LuminousseeliespawningEntity, Modelseelie<LuminousseeliespawningEntity>> {
	public LuminousseeliespawningRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelseelie<LuminousseeliespawningEntity>(context.bakeLayer(Modelseelie.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(LuminousseeliespawningEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/blank_texture.png");
	}
}

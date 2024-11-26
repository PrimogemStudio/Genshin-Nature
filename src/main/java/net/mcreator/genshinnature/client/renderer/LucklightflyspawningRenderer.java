
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.LucklightflyspawningEntity;
import net.mcreator.genshinnature.client.model.Modellucklight_fly;

public class LucklightflyspawningRenderer extends MobRenderer<LucklightflyspawningEntity, Modellucklight_fly<LucklightflyspawningEntity>> {
	public LucklightflyspawningRenderer(EntityRendererProvider.Context context) {
		super(context, new Modellucklight_fly<LucklightflyspawningEntity>(context.bakeLayer(Modellucklight_fly.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(LucklightflyspawningEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/blank_texture.png");
	}
}

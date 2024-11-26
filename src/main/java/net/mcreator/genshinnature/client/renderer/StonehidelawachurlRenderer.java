
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.StonehidelawachurlEntity;
import net.mcreator.genshinnature.client.model.Modelstonehide_lawachurl;

public class StonehidelawachurlRenderer extends MobRenderer<StonehidelawachurlEntity, Modelstonehide_lawachurl<StonehidelawachurlEntity>> {
	public StonehidelawachurlRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelstonehide_lawachurl<StonehidelawachurlEntity>(context.bakeLayer(Modelstonehide_lawachurl.LAYER_LOCATION)), 1.8f);
	}

	@Override
	public ResourceLocation getTextureLocation(StonehidelawachurlEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/stonehide_lawachurl.png");
	}
}

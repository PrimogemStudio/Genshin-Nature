
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.ThunderhelmlawachurlEntity;
import net.mcreator.genshinnature.client.model.Modelthunderhelm_lawachurl;

public class ThunderhelmlawachurlRenderer extends MobRenderer<ThunderhelmlawachurlEntity, Modelthunderhelm_lawachurl<ThunderhelmlawachurlEntity>> {
	public ThunderhelmlawachurlRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelthunderhelm_lawachurl<ThunderhelmlawachurlEntity>(context.bakeLayer(Modelthunderhelm_lawachurl.LAYER_LOCATION)), 1.8f);
	}

	@Override
	public ResourceLocation getTextureLocation(ThunderhelmlawachurlEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/thunderhelm_lawachurl.png");
	}
}

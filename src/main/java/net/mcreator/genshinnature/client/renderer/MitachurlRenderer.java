
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.MitachurlEntity;
import net.mcreator.genshinnature.client.model.Modelmitachurl_noweapon;

public class MitachurlRenderer extends MobRenderer<MitachurlEntity, Modelmitachurl_noweapon<MitachurlEntity>> {
	public MitachurlRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmitachurl_noweapon<MitachurlEntity>(context.bakeLayer(Modelmitachurl_noweapon.LAYER_LOCATION)), 2f);
	}

	@Override
	public ResourceLocation getTextureLocation(MitachurlEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/mitachurl_noweapon.png");
	}
}

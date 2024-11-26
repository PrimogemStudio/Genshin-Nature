
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.GeovishaphatchlingEntity;
import net.mcreator.genshinnature.client.model.Modelgeovishaphatchling;

public class GeovishaphatchlingRenderer extends MobRenderer<GeovishaphatchlingEntity, Modelgeovishaphatchling<GeovishaphatchlingEntity>> {
	public GeovishaphatchlingRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelgeovishaphatchling<GeovishaphatchlingEntity>(context.bakeLayer(Modelgeovishaphatchling.LAYER_LOCATION)), 1.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(GeovishaphatchlingEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/geovishaphatchling_final.png");
	}
}

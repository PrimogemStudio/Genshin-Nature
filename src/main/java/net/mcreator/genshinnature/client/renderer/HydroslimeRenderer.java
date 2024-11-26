
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.HydroslimeEntity;
import net.mcreator.genshinnature.client.model.Modelhydroslime;

public class HydroslimeRenderer extends MobRenderer<HydroslimeEntity, Modelhydroslime<HydroslimeEntity>> {
	public HydroslimeRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelhydroslime<HydroslimeEntity>(context.bakeLayer(Modelhydroslime.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(HydroslimeEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/hydroslime.png");
	}
}

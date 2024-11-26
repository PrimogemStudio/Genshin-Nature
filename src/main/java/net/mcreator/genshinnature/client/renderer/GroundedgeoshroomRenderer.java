
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.GroundedgeoshroomEntity;
import net.mcreator.genshinnature.client.model.Modelgrounded_geoshroom;

public class GroundedgeoshroomRenderer extends MobRenderer<GroundedgeoshroomEntity, Modelgrounded_geoshroom<GroundedgeoshroomEntity>> {
	public GroundedgeoshroomRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelgrounded_geoshroom<GroundedgeoshroomEntity>(context.bakeLayer(Modelgrounded_geoshroom.LAYER_LOCATION)), 1f);
	}

	@Override
	public ResourceLocation getTextureLocation(GroundedgeoshroomEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/grounded_geoshroom_final.png");
	}
}

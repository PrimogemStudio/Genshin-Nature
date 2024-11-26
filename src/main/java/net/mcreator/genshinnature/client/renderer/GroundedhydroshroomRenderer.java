
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.GroundedhydroshroomEntity;
import net.mcreator.genshinnature.client.model.Modelgrounded_hydroshroom;

public class GroundedhydroshroomRenderer extends MobRenderer<GroundedhydroshroomEntity, Modelgrounded_hydroshroom<GroundedhydroshroomEntity>> {
	public GroundedhydroshroomRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelgrounded_hydroshroom<GroundedhydroshroomEntity>(context.bakeLayer(Modelgrounded_hydroshroom.LAYER_LOCATION)), 1.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(GroundedhydroshroomEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/grounded_hydroshroom.png");
	}
}

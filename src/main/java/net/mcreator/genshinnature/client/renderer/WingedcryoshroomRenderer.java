
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.WingedcryoshroomEntity;
import net.mcreator.genshinnature.client.model.Modelwinged_cryoshroom;

public class WingedcryoshroomRenderer extends MobRenderer<WingedcryoshroomEntity, Modelwinged_cryoshroom<WingedcryoshroomEntity>> {
	public WingedcryoshroomRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelwinged_cryoshroom<WingedcryoshroomEntity>(context.bakeLayer(Modelwinged_cryoshroom.LAYER_LOCATION)), 1f);
	}

	@Override
	public ResourceLocation getTextureLocation(WingedcryoshroomEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/winged_cryoshroom.png");
	}
}

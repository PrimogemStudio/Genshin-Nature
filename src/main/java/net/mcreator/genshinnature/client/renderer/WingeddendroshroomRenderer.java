
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.WingeddendroshroomEntity;
import net.mcreator.genshinnature.client.model.Modelwinged_dendroshroom;

public class WingeddendroshroomRenderer extends MobRenderer<WingeddendroshroomEntity, Modelwinged_dendroshroom<WingeddendroshroomEntity>> {
	public WingeddendroshroomRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelwinged_dendroshroom<WingeddendroshroomEntity>(context.bakeLayer(Modelwinged_dendroshroom.LAYER_LOCATION)), 1f);
	}

	@Override
	public ResourceLocation getTextureLocation(WingeddendroshroomEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/winged_dendroshroom.png");
	}
}

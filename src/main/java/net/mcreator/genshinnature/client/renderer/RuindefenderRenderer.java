
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.RuindefenderEntity;
import net.mcreator.genshinnature.client.model.Modelruin_defender;

public class RuindefenderRenderer extends MobRenderer<RuindefenderEntity, Modelruin_defender<RuindefenderEntity>> {
	public RuindefenderRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelruin_defender<RuindefenderEntity>(context.bakeLayer(Modelruin_defender.LAYER_LOCATION)), 1.2f);
	}

	@Override
	public ResourceLocation getTextureLocation(RuindefenderEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/ruin_defender.png");
	}
}

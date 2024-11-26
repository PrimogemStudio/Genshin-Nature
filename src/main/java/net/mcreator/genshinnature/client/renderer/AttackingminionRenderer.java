
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.AttackingminionEntity;
import net.mcreator.genshinnature.client.model.Modelattacking_minion;

public class AttackingminionRenderer extends MobRenderer<AttackingminionEntity, Modelattacking_minion<AttackingminionEntity>> {
	public AttackingminionRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelattacking_minion<AttackingminionEntity>(context.bakeLayer(Modelattacking_minion.LAYER_LOCATION)), 1f);
	}

	@Override
	public ResourceLocation getTextureLocation(AttackingminionEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/attacking_minion.png");
	}
}

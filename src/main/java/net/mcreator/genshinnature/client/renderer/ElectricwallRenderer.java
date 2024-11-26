
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.ElectricwallEntity;
import net.mcreator.genshinnature.client.model.Modelelectric_wall;

public class ElectricwallRenderer extends MobRenderer<ElectricwallEntity, Modelelectric_wall<ElectricwallEntity>> {
	public ElectricwallRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelelectric_wall<ElectricwallEntity>(context.bakeLayer(Modelelectric_wall.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(ElectricwallEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/electric_wall.png");
	}
}

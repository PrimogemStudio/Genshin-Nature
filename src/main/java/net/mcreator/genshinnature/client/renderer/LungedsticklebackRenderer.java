
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.mcreator.genshinnature.entity.LungedsticklebackEntity;

public class LungedsticklebackRenderer extends HumanoidMobRenderer<LungedsticklebackEntity, HumanoidModel<LungedsticklebackEntity>> {
	public LungedsticklebackRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel<LungedsticklebackEntity>(context.bakeLayer(ModelLayers.PLAYER)), 1.2f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));
	}

	@Override
	public ResourceLocation getTextureLocation(LungedsticklebackEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/lunged_stickleback.png");
	}
}

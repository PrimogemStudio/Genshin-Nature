
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.mcreator.genshinnature.entity.PrimalconstructprospectorEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class PrimalconstructprospectorRenderer extends HumanoidMobRenderer<PrimalconstructprospectorEntity, HumanoidModel<PrimalconstructprospectorEntity>> {
	public PrimalconstructprospectorRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel<PrimalconstructprospectorEntity>(context.bakeLayer(ModelLayers.PLAYER)), 0.7f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));
		this.addLayer(new RenderLayer<PrimalconstructprospectorEntity, HumanoidModel<PrimalconstructprospectorEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("genshin_nature:textures/entities/emissive_primal_construct.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, PrimalconstructprospectorEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
				this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(PrimalconstructprospectorEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/primal_construct_prospector.png");
	}
}

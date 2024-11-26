
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

import net.mcreator.genshinnature.entity.Electrohypostasisphase7Entity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class Electrohypostasisphase7Renderer extends HumanoidMobRenderer<Electrohypostasisphase7Entity, HumanoidModel<Electrohypostasisphase7Entity>> {
	public Electrohypostasisphase7Renderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel<Electrohypostasisphase7Entity>(context.bakeLayer(ModelLayers.PLAYER)), 0.9f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));
		this.addLayer(new RenderLayer<Electrohypostasisphase7Entity, HumanoidModel<Electrohypostasisphase7Entity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("genshin_nature:textures/entities/electro_hypostasis_block_literally.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, Electrohypostasisphase7Entity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
				this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(Electrohypostasisphase7Entity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/electro_hypostasis_block_literally.png");
	}
}

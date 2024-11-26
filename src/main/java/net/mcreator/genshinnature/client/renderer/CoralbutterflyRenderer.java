
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.genshinnature.entity.CoralbutterflyEntity;
import net.mcreator.genshinnature.client.model.Modelcoral_butterfly;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class CoralbutterflyRenderer extends MobRenderer<CoralbutterflyEntity, Modelcoral_butterfly<CoralbutterflyEntity>> {
	public CoralbutterflyRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcoral_butterfly<CoralbutterflyEntity>(context.bakeLayer(Modelcoral_butterfly.LAYER_LOCATION)), 0.5f);
		this.addLayer(new RenderLayer<CoralbutterflyEntity, Modelcoral_butterfly<CoralbutterflyEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("genshin_nature:textures/entities/coral_butterfly_fixed.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, CoralbutterflyEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
				this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(CoralbutterflyEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/coral_butterfly_fixed.png");
	}
}

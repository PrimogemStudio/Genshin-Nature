
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.genshinnature.entity.PerpetualmechanicalarrayEntity;
import net.mcreator.genshinnature.client.model.Modelperpetual_mechanical_array;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class PerpetualmechanicalarrayRenderer extends MobRenderer<PerpetualmechanicalarrayEntity, Modelperpetual_mechanical_array<PerpetualmechanicalarrayEntity>> {
	public PerpetualmechanicalarrayRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelperpetual_mechanical_array<PerpetualmechanicalarrayEntity>(context.bakeLayer(Modelperpetual_mechanical_array.LAYER_LOCATION)), 1f);
		this.addLayer(new RenderLayer<PerpetualmechanicalarrayEntity, Modelperpetual_mechanical_array<PerpetualmechanicalarrayEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("genshin_nature:textures/entities/emissive_perpetual_mechanical_array.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, PerpetualmechanicalarrayEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
				this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(PerpetualmechanicalarrayEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/perpetual_mechanical_array.png");
	}
}

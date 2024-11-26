
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.genshinnature.entity.LargeelectroslimeEntity;
import net.mcreator.genshinnature.client.model.Modellargeelectroslime_finished;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class LargeelectroslimeRenderer extends MobRenderer<LargeelectroslimeEntity, Modellargeelectroslime_finished<LargeelectroslimeEntity>> {
	public LargeelectroslimeRenderer(EntityRendererProvider.Context context) {
		super(context, new Modellargeelectroslime_finished<LargeelectroslimeEntity>(context.bakeLayer(Modellargeelectroslime_finished.LAYER_LOCATION)), 1f);
		this.addLayer(new RenderLayer<LargeelectroslimeEntity, Modellargeelectroslime_finished<LargeelectroslimeEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("genshin_nature:textures/entities/emissive_largeelectroslime_finished.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, LargeelectroslimeEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
				this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(LargeelectroslimeEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/largeelectroslime_finished.png");
	}
}


package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.genshinnature.entity.LuminousseelieEntity;
import net.mcreator.genshinnature.client.model.Modelseelie;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class LuminousseelieRenderer extends MobRenderer<LuminousseelieEntity, Modelseelie<LuminousseelieEntity>> {
	public LuminousseelieRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelseelie<LuminousseelieEntity>(context.bakeLayer(Modelseelie.LAYER_LOCATION)), 0.5f);
		this.addLayer(new RenderLayer<LuminousseelieEntity, Modelseelie<LuminousseelieEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("genshin_nature:textures/entities/final_luminous_seelie.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, LuminousseelieEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
				this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(LuminousseelieEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/final_luminous_seelie.png");
	}
}

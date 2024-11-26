
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.genshinnature.entity.LucklightflyEntity;
import net.mcreator.genshinnature.client.model.Modellucklight_fly;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class LucklightflyRenderer extends MobRenderer<LucklightflyEntity, Modellucklight_fly<LucklightflyEntity>> {
	public LucklightflyRenderer(EntityRendererProvider.Context context) {
		super(context, new Modellucklight_fly<LucklightflyEntity>(context.bakeLayer(Modellucklight_fly.LAYER_LOCATION)), 0.5f);
		this.addLayer(new RenderLayer<LucklightflyEntity, Modellucklight_fly<LucklightflyEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("genshin_nature:textures/entities/final_lucklight_fly.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, LucklightflyEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
				this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(LucklightflyEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/final_lucklight_fly.png");
	}
}

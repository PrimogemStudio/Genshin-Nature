
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.genshinnature.entity.ThundermanifestationEntity;
import net.mcreator.genshinnature.client.model.Modelthunder_manifestation;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class ThundermanifestationRenderer extends MobRenderer<ThundermanifestationEntity, Modelthunder_manifestation<ThundermanifestationEntity>> {
	public ThundermanifestationRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelthunder_manifestation<ThundermanifestationEntity>(context.bakeLayer(Modelthunder_manifestation.LAYER_LOCATION)), 1.5f);
		this.addLayer(new RenderLayer<ThundermanifestationEntity, Modelthunder_manifestation<ThundermanifestationEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("genshin_nature:textures/entities/emissive_thunder_manifestation.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, ThundermanifestationEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
				this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(ThundermanifestationEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/thunder_manifestation.png");
	}
}

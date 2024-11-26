
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.genshinnature.entity.AnemosamachurlEntity;
import net.mcreator.genshinnature.client.model.Modelsamachurl_anemo;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class AnemosamachurlRenderer extends MobRenderer<AnemosamachurlEntity, Modelsamachurl_anemo<AnemosamachurlEntity>> {
	public AnemosamachurlRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelsamachurl_anemo<AnemosamachurlEntity>(context.bakeLayer(Modelsamachurl_anemo.LAYER_LOCATION)), 0.5f);
		this.addLayer(new RenderLayer<AnemosamachurlEntity, Modelsamachurl_anemo<AnemosamachurlEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("genshin_nature:textures/entities/emissive_samachurl_anemo.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, AnemosamachurlEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
				this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(AnemosamachurlEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/samachurl_anemo.png");
	}
}

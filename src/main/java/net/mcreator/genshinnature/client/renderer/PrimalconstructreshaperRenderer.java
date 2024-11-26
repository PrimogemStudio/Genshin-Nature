
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.genshinnature.entity.PrimalconstructreshaperEntity;
import net.mcreator.genshinnature.client.model.Modelprimal_construct_reshaper;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class PrimalconstructreshaperRenderer extends MobRenderer<PrimalconstructreshaperEntity, Modelprimal_construct_reshaper<PrimalconstructreshaperEntity>> {
	public PrimalconstructreshaperRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelprimal_construct_reshaper<PrimalconstructreshaperEntity>(context.bakeLayer(Modelprimal_construct_reshaper.LAYER_LOCATION)), 0.7f);
		this.addLayer(new RenderLayer<PrimalconstructreshaperEntity, Modelprimal_construct_reshaper<PrimalconstructreshaperEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("genshin_nature:textures/entities/emissive_primal_construct.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, PrimalconstructreshaperEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
				this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(PrimalconstructreshaperEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/primal_construct_reshaper.png");
	}
}

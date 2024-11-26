
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.genshinnature.entity.PrimalconstructrepulsorEntity;
import net.mcreator.genshinnature.client.model.Modelprimal_construct_repulsor;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class PrimalconstructrepulsorRenderer extends MobRenderer<PrimalconstructrepulsorEntity, Modelprimal_construct_repulsor<PrimalconstructrepulsorEntity>> {
	public PrimalconstructrepulsorRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelprimal_construct_repulsor<PrimalconstructrepulsorEntity>(context.bakeLayer(Modelprimal_construct_repulsor.LAYER_LOCATION)), 0.7f);
		this.addLayer(new RenderLayer<PrimalconstructrepulsorEntity, Modelprimal_construct_repulsor<PrimalconstructrepulsorEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("genshin_nature:textures/entities/emissive_primal_construct.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, PrimalconstructrepulsorEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
				this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(PrimalconstructrepulsorEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/primal_construct_repulsor.png");
	}
}

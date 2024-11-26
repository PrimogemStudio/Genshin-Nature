
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.genshinnature.entity.FellflowerEntity;
import net.mcreator.genshinnature.client.model.Modelfellflower;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class FellflowerRenderer extends MobRenderer<FellflowerEntity, Modelfellflower<FellflowerEntity>> {
	public FellflowerRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelfellflower<FellflowerEntity>(context.bakeLayer(Modelfellflower.LAYER_LOCATION)), 3.5f);
		this.addLayer(new RenderLayer<FellflowerEntity, Modelfellflower<FellflowerEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("genshin_nature:textures/entities/emissive_fellflower.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, FellflowerEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
				this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(FellflowerEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/fellflower.png");
	}
}

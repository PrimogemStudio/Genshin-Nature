
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.genshinnature.entity.AzhdahaEntity;
import net.mcreator.genshinnature.client.model.Modelazhdaha;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class AzhdahaRenderer extends MobRenderer<AzhdahaEntity, Modelazhdaha<AzhdahaEntity>> {
	public AzhdahaRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelazhdaha<AzhdahaEntity>(context.bakeLayer(Modelazhdaha.LAYER_LOCATION)), 19f);
		this.addLayer(new RenderLayer<AzhdahaEntity, Modelazhdaha<AzhdahaEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("genshin_nature:textures/entities/azhdaha_emissive.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, AzhdahaEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
				this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(AzhdahaEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/azhdaha.png");
	}
}

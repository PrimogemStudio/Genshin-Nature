
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.genshinnature.entity.HatefuloceanidEntity;
import net.mcreator.genshinnature.client.model.Modelhateful_oceanid;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class HatefuloceanidRenderer extends MobRenderer<HatefuloceanidEntity, Modelhateful_oceanid<HatefuloceanidEntity>> {
	public HatefuloceanidRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelhateful_oceanid<HatefuloceanidEntity>(context.bakeLayer(Modelhateful_oceanid.LAYER_LOCATION)), 1.5f);
		this.addLayer(new RenderLayer<HatefuloceanidEntity, Modelhateful_oceanid<HatefuloceanidEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("genshin_nature:textures/entities/emissive_hateful_oceanid.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, HatefuloceanidEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
				this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(HatefuloceanidEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/hateful_oceanid.png");
	}
}

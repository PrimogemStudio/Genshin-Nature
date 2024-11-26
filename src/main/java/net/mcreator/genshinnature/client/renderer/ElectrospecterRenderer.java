
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.genshinnature.entity.ElectrospecterEntity;
import net.mcreator.genshinnature.client.model.Modelspecter_geo;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class ElectrospecterRenderer extends MobRenderer<ElectrospecterEntity, Modelspecter_geo<ElectrospecterEntity>> {
	public ElectrospecterRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelspecter_geo<ElectrospecterEntity>(context.bakeLayer(Modelspecter_geo.LAYER_LOCATION)), 0.5f);
		this.addLayer(new RenderLayer<ElectrospecterEntity, Modelspecter_geo<ElectrospecterEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("genshin_nature:textures/entities/emissive_specter_electro.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, ElectrospecterEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
				this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(ElectrospecterEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/specter_electro.png");
	}
}

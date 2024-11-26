
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.genshinnature.entity.PyrospecterEntity;
import net.mcreator.genshinnature.client.model.Modelspecter_geo;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class PyrospecterRenderer extends MobRenderer<PyrospecterEntity, Modelspecter_geo<PyrospecterEntity>> {
	public PyrospecterRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelspecter_geo<PyrospecterEntity>(context.bakeLayer(Modelspecter_geo.LAYER_LOCATION)), 0.5f);
		this.addLayer(new RenderLayer<PyrospecterEntity, Modelspecter_geo<PyrospecterEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("genshin_nature:textures/entities/emissive_specter_pyro.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, PyrospecterEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
				this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(PyrospecterEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/specter_pyro.png");
	}
}

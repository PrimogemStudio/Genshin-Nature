
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.genshinnature.entity.Anemohypostasisphase3Entity;
import net.mcreator.genshinnature.client.model.Modelanemo_hypostasis_small;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class Anemohypostasisphase3Renderer extends MobRenderer<Anemohypostasisphase3Entity, Modelanemo_hypostasis_small<Anemohypostasisphase3Entity>> {
	public Anemohypostasisphase3Renderer(EntityRendererProvider.Context context) {
		super(context, new Modelanemo_hypostasis_small<Anemohypostasisphase3Entity>(context.bakeLayer(Modelanemo_hypostasis_small.LAYER_LOCATION)), 0.4f);
		this.addLayer(new RenderLayer<Anemohypostasisphase3Entity, Modelanemo_hypostasis_small<Anemohypostasisphase3Entity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("genshin_nature:textures/entities/anemo_hypostasis_small.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, Anemohypostasisphase3Entity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
				this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(Anemohypostasisphase3Entity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/anemo_hypostasis_small.png");
	}
}


package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.genshinnature.entity.Pyrohypostasisphase4Entity;
import net.mcreator.genshinnature.client.model.Modelpyro_hypostasis;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class Pyrohypostasisphase4Renderer extends MobRenderer<Pyrohypostasisphase4Entity, Modelpyro_hypostasis<Pyrohypostasisphase4Entity>> {
	public Pyrohypostasisphase4Renderer(EntityRendererProvider.Context context) {
		super(context, new Modelpyro_hypostasis<Pyrohypostasisphase4Entity>(context.bakeLayer(Modelpyro_hypostasis.LAYER_LOCATION)), 1f);
		this.addLayer(new RenderLayer<Pyrohypostasisphase4Entity, Modelpyro_hypostasis<Pyrohypostasisphase4Entity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("genshin_nature:textures/entities/pyro_hypostasis_emissive.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, Pyrohypostasisphase4Entity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
				this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(Pyrohypostasisphase4Entity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/pyro_hypostasis.png");
	}
}

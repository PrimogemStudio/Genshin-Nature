
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.genshinnature.entity.Electrohypostasisphase8Entity;
import net.mcreator.genshinnature.client.model.Modelelectro_hypostasis;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class Electrohypostasisphase8Renderer extends MobRenderer<Electrohypostasisphase8Entity, Modelelectro_hypostasis<Electrohypostasisphase8Entity>> {
	public Electrohypostasisphase8Renderer(EntityRendererProvider.Context context) {
		super(context, new Modelelectro_hypostasis<Electrohypostasisphase8Entity>(context.bakeLayer(Modelelectro_hypostasis.LAYER_LOCATION)), 1f);
		this.addLayer(new RenderLayer<Electrohypostasisphase8Entity, Modelelectro_hypostasis<Electrohypostasisphase8Entity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("genshin_nature:textures/entities/emissive_electro_hypostasis.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, Electrohypostasisphase8Entity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
				this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(Electrohypostasisphase8Entity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/electro_hypostasis_block_literally.png");
	}
}

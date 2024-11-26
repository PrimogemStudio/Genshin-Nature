
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.genshinnature.entity.Electrohypostasisphase5Entity;
import net.mcreator.genshinnature.client.model.Modelelectro_hypostasis_laser;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class Electrohypostasisphase5Renderer extends MobRenderer<Electrohypostasisphase5Entity, Modelelectro_hypostasis_laser<Electrohypostasisphase5Entity>> {
	public Electrohypostasisphase5Renderer(EntityRendererProvider.Context context) {
		super(context, new Modelelectro_hypostasis_laser<Electrohypostasisphase5Entity>(context.bakeLayer(Modelelectro_hypostasis_laser.LAYER_LOCATION)), 2f);
		this.addLayer(new RenderLayer<Electrohypostasisphase5Entity, Modelelectro_hypostasis_laser<Electrohypostasisphase5Entity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("genshin_nature:textures/entities/emissive_electro_hypostasis.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, Electrohypostasisphase5Entity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
				this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(Electrohypostasisphase5Entity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/electro_hypostasis_laser.png");
	}
}

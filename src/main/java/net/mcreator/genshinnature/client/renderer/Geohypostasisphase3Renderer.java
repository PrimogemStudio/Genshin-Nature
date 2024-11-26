
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.genshinnature.entity.Geohypostasisphase3Entity;
import net.mcreator.genshinnature.client.model.Modelgeo_hypostasis_phase3;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class Geohypostasisphase3Renderer extends MobRenderer<Geohypostasisphase3Entity, Modelgeo_hypostasis_phase3<Geohypostasisphase3Entity>> {
	public Geohypostasisphase3Renderer(EntityRendererProvider.Context context) {
		super(context, new Modelgeo_hypostasis_phase3<Geohypostasisphase3Entity>(context.bakeLayer(Modelgeo_hypostasis_phase3.LAYER_LOCATION)), 1f);
		this.addLayer(new RenderLayer<Geohypostasisphase3Entity, Modelgeo_hypostasis_phase3<Geohypostasisphase3Entity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("genshin_nature:textures/entities/geo_hypostasis_phase3.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, Geohypostasisphase3Entity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
				this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(Geohypostasisphase3Entity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/geo_hypostasis_phase3.png");
	}
}

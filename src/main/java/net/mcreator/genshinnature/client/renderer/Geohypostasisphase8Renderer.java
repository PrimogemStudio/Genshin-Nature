
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.genshinnature.entity.Geohypostasisphase8Entity;
import net.mcreator.genshinnature.client.model.Modelgeo_hypostasis;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class Geohypostasisphase8Renderer extends MobRenderer<Geohypostasisphase8Entity, Modelgeo_hypostasis<Geohypostasisphase8Entity>> {
	public Geohypostasisphase8Renderer(EntityRendererProvider.Context context) {
		super(context, new Modelgeo_hypostasis<Geohypostasisphase8Entity>(context.bakeLayer(Modelgeo_hypostasis.LAYER_LOCATION)), 1f);
		this.addLayer(new RenderLayer<Geohypostasisphase8Entity, Modelgeo_hypostasis<Geohypostasisphase8Entity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("genshin_nature:textures/entities/geo_hypostasis_emissive.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, Geohypostasisphase8Entity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
				this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(Geohypostasisphase8Entity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/geo_hypostasis.png");
	}
}

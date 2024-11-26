
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.genshinnature.entity.Geohypostasisphase5Entity;
import net.mcreator.genshinnature.client.model.Modelgeo_hypostasis_hammer;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class Geohypostasisphase5Renderer extends MobRenderer<Geohypostasisphase5Entity, Modelgeo_hypostasis_hammer<Geohypostasisphase5Entity>> {
	public Geohypostasisphase5Renderer(EntityRendererProvider.Context context) {
		super(context, new Modelgeo_hypostasis_hammer<Geohypostasisphase5Entity>(context.bakeLayer(Modelgeo_hypostasis_hammer.LAYER_LOCATION)), 2f);
		this.addLayer(new RenderLayer<Geohypostasisphase5Entity, Modelgeo_hypostasis_hammer<Geohypostasisphase5Entity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("genshin_nature:textures/entities/geo_hypostasis_hammer_emissive.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, Geohypostasisphase5Entity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
				this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(Geohypostasisphase5Entity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/geo_hypostasis_hammer.png");
	}
}

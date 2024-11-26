
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.genshinnature.entity.GeohypostasisEntity;
import net.mcreator.genshinnature.client.model.Modelgeo_hypostasis;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class GeohypostasisRenderer extends MobRenderer<GeohypostasisEntity, Modelgeo_hypostasis<GeohypostasisEntity>> {
	public GeohypostasisRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelgeo_hypostasis<GeohypostasisEntity>(context.bakeLayer(Modelgeo_hypostasis.LAYER_LOCATION)), 1f);
		this.addLayer(new RenderLayer<GeohypostasisEntity, Modelgeo_hypostasis<GeohypostasisEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("genshin_nature:textures/entities/geo_hypostasis_emissive.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, GeohypostasisEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
				this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(GeohypostasisEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/geo_hypostasis.png");
	}
}

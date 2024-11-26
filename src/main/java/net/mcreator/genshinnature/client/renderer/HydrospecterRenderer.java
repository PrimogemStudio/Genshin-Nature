
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.genshinnature.entity.HydrospecterEntity;
import net.mcreator.genshinnature.client.model.Modelspecter_geo;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class HydrospecterRenderer extends MobRenderer<HydrospecterEntity, Modelspecter_geo<HydrospecterEntity>> {
	public HydrospecterRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelspecter_geo<HydrospecterEntity>(context.bakeLayer(Modelspecter_geo.LAYER_LOCATION)), 0.5f);
		this.addLayer(new RenderLayer<HydrospecterEntity, Modelspecter_geo<HydrospecterEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("genshin_nature:textures/entities/emissive_specter_hydro.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, HydrospecterEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
				this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(HydrospecterEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/specter_hydro.png");
	}
}

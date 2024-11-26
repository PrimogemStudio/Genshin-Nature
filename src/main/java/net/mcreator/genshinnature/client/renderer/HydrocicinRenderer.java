
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.genshinnature.entity.HydrocicinEntity;
import net.mcreator.genshinnature.client.model.Modelhydro_cicin;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class HydrocicinRenderer extends MobRenderer<HydrocicinEntity, Modelhydro_cicin<HydrocicinEntity>> {
	public HydrocicinRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelhydro_cicin<HydrocicinEntity>(context.bakeLayer(Modelhydro_cicin.LAYER_LOCATION)), 0.6f);
		this.addLayer(new RenderLayer<HydrocicinEntity, Modelhydro_cicin<HydrocicinEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("genshin_nature:textures/entities/emission_hydro_cicin.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, HydrocicinEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
				this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(HydrocicinEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/hydro_cicin.png");
	}
}

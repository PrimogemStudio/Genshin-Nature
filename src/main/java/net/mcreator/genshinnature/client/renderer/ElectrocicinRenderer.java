
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.genshinnature.entity.ElectrocicinEntity;
import net.mcreator.genshinnature.client.model.Modelelectro_cicin;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class ElectrocicinRenderer extends MobRenderer<ElectrocicinEntity, Modelelectro_cicin<ElectrocicinEntity>> {
	public ElectrocicinRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelelectro_cicin<ElectrocicinEntity>(context.bakeLayer(Modelelectro_cicin.LAYER_LOCATION)), 0.6f);
		this.addLayer(new RenderLayer<ElectrocicinEntity, Modelelectro_cicin<ElectrocicinEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("genshin_nature:textures/entities/emissive_electro_cicin.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, ElectrocicinEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
				this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(ElectrocicinEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/electro_cicin.png");
	}
}

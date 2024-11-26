
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.genshinnature.entity.ElectrowhopperflowerEntity;
import net.mcreator.genshinnature.client.model.Modelelectro_whopperflower;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class ElectrowhopperflowerRenderer extends MobRenderer<ElectrowhopperflowerEntity, Modelelectro_whopperflower<ElectrowhopperflowerEntity>> {
	public ElectrowhopperflowerRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelelectro_whopperflower<ElectrowhopperflowerEntity>(context.bakeLayer(Modelelectro_whopperflower.LAYER_LOCATION)), 0.6f);
		this.addLayer(new RenderLayer<ElectrowhopperflowerEntity, Modelelectro_whopperflower<ElectrowhopperflowerEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("genshin_nature:textures/entities/emissive_electro_whopperflower.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, ElectrowhopperflowerEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
				this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(ElectrowhopperflowerEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/electro_whopperflower.png");
	}
}

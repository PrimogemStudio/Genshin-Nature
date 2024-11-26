
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.genshinnature.entity.DefensemechanismEntity;
import net.mcreator.genshinnature.client.model.Modeldefense_mechanism;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class DefensemechanismRenderer extends MobRenderer<DefensemechanismEntity, Modeldefense_mechanism<DefensemechanismEntity>> {
	public DefensemechanismRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeldefense_mechanism<DefensemechanismEntity>(context.bakeLayer(Modeldefense_mechanism.LAYER_LOCATION)), 0.5f);
		this.addLayer(new RenderLayer<DefensemechanismEntity, Modeldefense_mechanism<DefensemechanismEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("genshin_nature:textures/entities/emissive_defense_mechanism.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, DefensemechanismEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
				this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(DefensemechanismEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/defense_mechanism.png");
	}
}

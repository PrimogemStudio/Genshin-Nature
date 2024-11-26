
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.genshinnature.entity.RuinserpentEntity;
import net.mcreator.genshinnature.client.model.Modelruin_serpent_remodel_final;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class RuinserpentRenderer extends MobRenderer<RuinserpentEntity, Modelruin_serpent_remodel_final<RuinserpentEntity>> {
	public RuinserpentRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelruin_serpent_remodel_final<RuinserpentEntity>(context.bakeLayer(Modelruin_serpent_remodel_final.LAYER_LOCATION)), 1.3f);
		this.addLayer(new RenderLayer<RuinserpentEntity, Modelruin_serpent_remodel_final<RuinserpentEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("genshin_nature:textures/entities/emissive_ruin_serpent_remodel.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, RuinserpentEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
				this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(RuinserpentEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/ruin_serpent_remodel_fixed.png");
	}
}

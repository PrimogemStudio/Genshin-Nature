
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.mcreator.genshinnature.entity.Pyrohypostasisphase6Entity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class Pyrohypostasisphase6Renderer extends HumanoidMobRenderer<Pyrohypostasisphase6Entity, HumanoidModel<Pyrohypostasisphase6Entity>> {
	public Pyrohypostasisphase6Renderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel<Pyrohypostasisphase6Entity>(context.bakeLayer(ModelLayers.PLAYER)), 1.3f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));
		this.addLayer(new RenderLayer<Pyrohypostasisphase6Entity, HumanoidModel<Pyrohypostasisphase6Entity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("genshin_nature:textures/entities/pyro_hypostasis_tornado.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, Pyrohypostasisphase6Entity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
				this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(Pyrohypostasisphase6Entity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/pyro_hypostasis_tornado.png");
	}
}

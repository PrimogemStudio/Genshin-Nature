
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.genshinnature.entity.ElectroslimeEntity;
import net.mcreator.genshinnature.client.model.Modelelectroslime;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class ElectroslimeRenderer extends MobRenderer<ElectroslimeEntity, Modelelectroslime<ElectroslimeEntity>> {
	public ElectroslimeRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelelectroslime<ElectroslimeEntity>(context.bakeLayer(Modelelectroslime.LAYER_LOCATION)), 0.5f);
		this.addLayer(new RenderLayer<ElectroslimeEntity, Modelelectroslime<ElectroslimeEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("genshin_nature:textures/entities/electroslime_emissive.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, ElectroslimeEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
				this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(ElectroslimeEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/electroslime.png");
	}
}

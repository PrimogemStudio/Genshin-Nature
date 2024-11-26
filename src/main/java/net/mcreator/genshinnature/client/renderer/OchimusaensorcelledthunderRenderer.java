
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.genshinnature.entity.OchimusaensorcelledthunderEntity;
import net.mcreator.genshinnature.client.model.Modelkairagi;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class OchimusaensorcelledthunderRenderer extends MobRenderer<OchimusaensorcelledthunderEntity, Modelkairagi<OchimusaensorcelledthunderEntity>> {
	public OchimusaensorcelledthunderRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelkairagi<OchimusaensorcelledthunderEntity>(context.bakeLayer(Modelkairagi.LAYER_LOCATION)), 0.5f);
		this.addLayer(new RenderLayer<OchimusaensorcelledthunderEntity, Modelkairagi<OchimusaensorcelledthunderEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("genshin_nature:textures/entities/ochimusa_ensorcelled_thunder.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, OchimusaensorcelledthunderEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
				this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(OchimusaensorcelledthunderEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/blank_texture.png");
	}
}

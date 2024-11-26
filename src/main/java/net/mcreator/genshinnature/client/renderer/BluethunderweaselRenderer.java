
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.genshinnature.entity.BluethunderweaselEntity;
import net.mcreator.genshinnature.client.model.Modelweasel_fixed;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class BluethunderweaselRenderer extends MobRenderer<BluethunderweaselEntity, Modelweasel_fixed<BluethunderweaselEntity>> {
	public BluethunderweaselRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelweasel_fixed<BluethunderweaselEntity>(context.bakeLayer(Modelweasel_fixed.LAYER_LOCATION)), 0.5f);
		this.addLayer(new RenderLayer<BluethunderweaselEntity, Modelweasel_fixed<BluethunderweaselEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("genshin_nature:textures/entities/emissive_bluethunder_weasel.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, BluethunderweaselEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
				this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(BluethunderweaselEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/bluethunder_weasel.png");
	}
}

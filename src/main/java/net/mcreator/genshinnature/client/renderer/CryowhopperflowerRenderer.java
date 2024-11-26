
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.genshinnature.entity.CryowhopperflowerEntity;
import net.mcreator.genshinnature.client.model.Modelcryo_whopperflower;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class CryowhopperflowerRenderer extends MobRenderer<CryowhopperflowerEntity, Modelcryo_whopperflower<CryowhopperflowerEntity>> {
	public CryowhopperflowerRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcryo_whopperflower<CryowhopperflowerEntity>(context.bakeLayer(Modelcryo_whopperflower.LAYER_LOCATION)), 0.6f);
		this.addLayer(new RenderLayer<CryowhopperflowerEntity, Modelcryo_whopperflower<CryowhopperflowerEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("genshin_nature:textures/entities/emissive_cryo_whopperflower.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, CryowhopperflowerEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
				this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(CryowhopperflowerEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/cryo_whopperflower.png");
	}
}

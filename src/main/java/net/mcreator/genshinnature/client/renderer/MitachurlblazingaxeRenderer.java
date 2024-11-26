
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.genshinnature.entity.MitachurlblazingaxeEntity;
import net.mcreator.genshinnature.client.model.Modelmitachurl_blazing_axe;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class MitachurlblazingaxeRenderer extends MobRenderer<MitachurlblazingaxeEntity, Modelmitachurl_blazing_axe<MitachurlblazingaxeEntity>> {
	public MitachurlblazingaxeRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmitachurl_blazing_axe<MitachurlblazingaxeEntity>(context.bakeLayer(Modelmitachurl_blazing_axe.LAYER_LOCATION)), 2f);
		this.addLayer(new RenderLayer<MitachurlblazingaxeEntity, Modelmitachurl_blazing_axe<MitachurlblazingaxeEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("genshin_nature:textures/entities/emissive_mitachurl_blazing_axe.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, MitachurlblazingaxeEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
				this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(MitachurlblazingaxeEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/mitachurl_blazing_axe.png");
	}
}

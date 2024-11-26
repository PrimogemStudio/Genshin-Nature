
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.genshinnature.entity.AbyssmageelectroEntity;
import net.mcreator.genshinnature.client.model.Modelabyssmage_electro;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class AbyssmageelectroRenderer extends MobRenderer<AbyssmageelectroEntity, Modelabyssmage_electro<AbyssmageelectroEntity>> {
	public AbyssmageelectroRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelabyssmage_electro<AbyssmageelectroEntity>(context.bakeLayer(Modelabyssmage_electro.LAYER_LOCATION)), 0.5f);
		this.addLayer(new RenderLayer<AbyssmageelectroEntity, Modelabyssmage_electro<AbyssmageelectroEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("genshin_nature:textures/entities/emissive_abyssmage_electro.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, AbyssmageelectroEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
				this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(AbyssmageelectroEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/abyssmage_electro.png");
	}
}

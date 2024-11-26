
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.genshinnature.entity.BaalcloneEntity;
import net.mcreator.genshinnature.client.model.Modelmagatsu_mitake_narukami_no_mikoto;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class BaalcloneRenderer extends MobRenderer<BaalcloneEntity, Modelmagatsu_mitake_narukami_no_mikoto<BaalcloneEntity>> {
	public BaalcloneRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmagatsu_mitake_narukami_no_mikoto<BaalcloneEntity>(context.bakeLayer(Modelmagatsu_mitake_narukami_no_mikoto.LAYER_LOCATION)), 0.5f);
		this.addLayer(new RenderLayer<BaalcloneEntity, Modelmagatsu_mitake_narukami_no_mikoto<BaalcloneEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("genshin_nature:textures/entities/baal_clone.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, BaalcloneEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
				this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(BaalcloneEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/blank_texture.png");
	}
}

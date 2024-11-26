
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.genshinnature.entity.LargepyroslimeEntity;
import net.mcreator.genshinnature.client.model.Modellargepyroslime;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class LargepyroslimeRenderer extends MobRenderer<LargepyroslimeEntity, Modellargepyroslime<LargepyroslimeEntity>> {
	public LargepyroslimeRenderer(EntityRendererProvider.Context context) {
		super(context, new Modellargepyroslime<LargepyroslimeEntity>(context.bakeLayer(Modellargepyroslime.LAYER_LOCATION)), 1f);
		this.addLayer(new RenderLayer<LargepyroslimeEntity, Modellargepyroslime<LargepyroslimeEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("genshin_nature:textures/entities/largepyroslime.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, LargepyroslimeEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
				this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(LargepyroslimeEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/largepyroslime.png");
	}
}

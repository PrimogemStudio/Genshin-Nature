
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.genshinnature.entity.GoldenwolflordEntity;
import net.mcreator.genshinnature.client.model.Modelgolden_wolflord;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class GoldenwolflordRenderer extends MobRenderer<GoldenwolflordEntity, Modelgolden_wolflord<GoldenwolflordEntity>> {
	public GoldenwolflordRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelgolden_wolflord<GoldenwolflordEntity>(context.bakeLayer(Modelgolden_wolflord.LAYER_LOCATION)), 5f);
		this.addLayer(new RenderLayer<GoldenwolflordEntity, Modelgolden_wolflord<GoldenwolflordEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("genshin_nature:textures/entities/golden_wolflord_emissive.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, GoldenwolflordEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
				this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(GoldenwolflordEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/golden_wolflord.png");
	}
}

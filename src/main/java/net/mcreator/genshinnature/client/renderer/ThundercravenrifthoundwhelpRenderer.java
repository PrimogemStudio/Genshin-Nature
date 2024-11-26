
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.genshinnature.entity.ThundercravenrifthoundwhelpEntity;
import net.mcreator.genshinnature.client.model.Modelrifthound_whelp;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class ThundercravenrifthoundwhelpRenderer extends MobRenderer<ThundercravenrifthoundwhelpEntity, Modelrifthound_whelp<ThundercravenrifthoundwhelpEntity>> {
	public ThundercravenrifthoundwhelpRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelrifthound_whelp<ThundercravenrifthoundwhelpEntity>(context.bakeLayer(Modelrifthound_whelp.LAYER_LOCATION)), 1f);
		this.addLayer(new RenderLayer<ThundercravenrifthoundwhelpEntity, Modelrifthound_whelp<ThundercravenrifthoundwhelpEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("genshin_nature:textures/entities/emissive_thundercraven_rifthound_whelp.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, ThundercravenrifthoundwhelpEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw,
					float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
				this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(ThundercravenrifthoundwhelpEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/thundercraven_rifthound_whelp.png");
	}
}

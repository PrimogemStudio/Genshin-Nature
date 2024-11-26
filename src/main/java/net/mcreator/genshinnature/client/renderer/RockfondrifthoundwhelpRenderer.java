
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.genshinnature.entity.RockfondrifthoundwhelpEntity;
import net.mcreator.genshinnature.client.model.Modelrifthound_whelp;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class RockfondrifthoundwhelpRenderer extends MobRenderer<RockfondrifthoundwhelpEntity, Modelrifthound_whelp<RockfondrifthoundwhelpEntity>> {
	public RockfondrifthoundwhelpRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelrifthound_whelp<RockfondrifthoundwhelpEntity>(context.bakeLayer(Modelrifthound_whelp.LAYER_LOCATION)), 1f);
		this.addLayer(new RenderLayer<RockfondrifthoundwhelpEntity, Modelrifthound_whelp<RockfondrifthoundwhelpEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("genshin_nature:textures/entities/emissive_rockfond_rifthound_whelp.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, RockfondrifthoundwhelpEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
				this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(RockfondrifthoundwhelpEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/rockfond_rifthound_whelp.png");
	}
}

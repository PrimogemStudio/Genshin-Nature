
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.genshinnature.entity.RockshieldwallmitachurlEntity;
import net.mcreator.genshinnature.client.model.Modelrock_shieldwall_mitachurl;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class RockshieldwallmitachurlRenderer extends MobRenderer<RockshieldwallmitachurlEntity, Modelrock_shieldwall_mitachurl<RockshieldwallmitachurlEntity>> {
	public RockshieldwallmitachurlRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelrock_shieldwall_mitachurl<RockshieldwallmitachurlEntity>(context.bakeLayer(Modelrock_shieldwall_mitachurl.LAYER_LOCATION)), 2f);
		this.addLayer(new RenderLayer<RockshieldwallmitachurlEntity, Modelrock_shieldwall_mitachurl<RockshieldwallmitachurlEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("genshin_nature:textures/entities/emissive_rock_shieldwall_mitachurl.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, RockshieldwallmitachurlEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
				this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(RockshieldwallmitachurlEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/rock_shieldwall_mitachurl.png");
	}
}

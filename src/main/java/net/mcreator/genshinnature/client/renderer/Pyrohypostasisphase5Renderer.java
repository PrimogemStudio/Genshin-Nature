
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.genshinnature.entity.Pyrohypostasisphase5Entity;
import net.mcreator.genshinnature.client.model.Modelpyro_hypostasis_explosion;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class Pyrohypostasisphase5Renderer extends MobRenderer<Pyrohypostasisphase5Entity, Modelpyro_hypostasis_explosion<Pyrohypostasisphase5Entity>> {
	public Pyrohypostasisphase5Renderer(EntityRendererProvider.Context context) {
		super(context, new Modelpyro_hypostasis_explosion<Pyrohypostasisphase5Entity>(context.bakeLayer(Modelpyro_hypostasis_explosion.LAYER_LOCATION)), 1.5f);
		this.addLayer(new RenderLayer<Pyrohypostasisphase5Entity, Modelpyro_hypostasis_explosion<Pyrohypostasisphase5Entity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("genshin_nature:textures/entities/emissive_pyro_hypostasis_explosion.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, Pyrohypostasisphase5Entity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
				this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(Pyrohypostasisphase5Entity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/pyro_hypostasis_explosion.png");
	}
}


package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.genshinnature.entity.Eyeofstormphase2Entity;
import net.mcreator.genshinnature.client.model.Modeleye_of_the_storm_fixed;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class Eyeofstormphase2Renderer extends MobRenderer<Eyeofstormphase2Entity, Modeleye_of_the_storm_fixed<Eyeofstormphase2Entity>> {
	public Eyeofstormphase2Renderer(EntityRendererProvider.Context context) {
		super(context, new Modeleye_of_the_storm_fixed<Eyeofstormphase2Entity>(context.bakeLayer(Modeleye_of_the_storm_fixed.LAYER_LOCATION)), 1f);
		this.addLayer(new RenderLayer<Eyeofstormphase2Entity, Modeleye_of_the_storm_fixed<Eyeofstormphase2Entity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("genshin_nature:textures/entities/emissive_eye_of_the_storm.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, Eyeofstormphase2Entity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
				this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(Eyeofstormphase2Entity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/eye_of_the_storm_fixed.png");
	}
}

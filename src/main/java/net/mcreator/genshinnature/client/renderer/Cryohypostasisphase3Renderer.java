
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.genshinnature.entity.Cryohypostasisphase3Entity;
import net.mcreator.genshinnature.client.model.Modelcryo_hypostasis_wheel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class Cryohypostasisphase3Renderer extends MobRenderer<Cryohypostasisphase3Entity, Modelcryo_hypostasis_wheel<Cryohypostasisphase3Entity>> {
	public Cryohypostasisphase3Renderer(EntityRendererProvider.Context context) {
		super(context, new Modelcryo_hypostasis_wheel<Cryohypostasisphase3Entity>(context.bakeLayer(Modelcryo_hypostasis_wheel.LAYER_LOCATION)), 2f);
		this.addLayer(new RenderLayer<Cryohypostasisphase3Entity, Modelcryo_hypostasis_wheel<Cryohypostasisphase3Entity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("genshin_nature:textures/entities/emissive_cryo_hypostasis_wheel.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, Cryohypostasisphase3Entity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
				this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(Cryohypostasisphase3Entity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/cryo_hypostasis_wheel.png");
	}
}

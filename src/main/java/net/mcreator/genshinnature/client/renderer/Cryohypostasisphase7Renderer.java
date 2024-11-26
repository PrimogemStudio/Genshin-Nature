
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.genshinnature.entity.Cryohypostasisphase7Entity;
import net.mcreator.genshinnature.client.model.Modelcryo_hypostasis_phase_7;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class Cryohypostasisphase7Renderer extends MobRenderer<Cryohypostasisphase7Entity, Modelcryo_hypostasis_phase_7<Cryohypostasisphase7Entity>> {
	public Cryohypostasisphase7Renderer(EntityRendererProvider.Context context) {
		super(context, new Modelcryo_hypostasis_phase_7<Cryohypostasisphase7Entity>(context.bakeLayer(Modelcryo_hypostasis_phase_7.LAYER_LOCATION)), 1.2f);
		this.addLayer(new RenderLayer<Cryohypostasisphase7Entity, Modelcryo_hypostasis_phase_7<Cryohypostasisphase7Entity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("genshin_nature:textures/entities/emissive_cryo_hypostasis_phase_7.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, Cryohypostasisphase7Entity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
				this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(Cryohypostasisphase7Entity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/cryo_hypostasis_phase_7_fixed.png");
	}
}

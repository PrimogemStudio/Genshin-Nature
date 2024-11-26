
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.genshinnature.entity.Cryohypostasisphase2Entity;
import net.mcreator.genshinnature.client.model.Modelcryo_hypostasis_phase2;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class Cryohypostasisphase2Renderer extends MobRenderer<Cryohypostasisphase2Entity, Modelcryo_hypostasis_phase2<Cryohypostasisphase2Entity>> {
	public Cryohypostasisphase2Renderer(EntityRendererProvider.Context context) {
		super(context, new Modelcryo_hypostasis_phase2<Cryohypostasisphase2Entity>(context.bakeLayer(Modelcryo_hypostasis_phase2.LAYER_LOCATION)), 0.5f);
		this.addLayer(new RenderLayer<Cryohypostasisphase2Entity, Modelcryo_hypostasis_phase2<Cryohypostasisphase2Entity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("genshin_nature:textures/entities/cryo_hypostasis_phase2.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, Cryohypostasisphase2Entity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
				this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(Cryohypostasisphase2Entity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/cryo_hypostasis_phase2.png");
	}
}

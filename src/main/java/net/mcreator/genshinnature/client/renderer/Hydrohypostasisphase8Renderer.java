
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.genshinnature.entity.Hydrohypostasisphase8Entity;
import net.mcreator.genshinnature.client.model.Modelhydro_hypostasis;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class Hydrohypostasisphase8Renderer extends MobRenderer<Hydrohypostasisphase8Entity, Modelhydro_hypostasis<Hydrohypostasisphase8Entity>> {
	public Hydrohypostasisphase8Renderer(EntityRendererProvider.Context context) {
		super(context, new Modelhydro_hypostasis<Hydrohypostasisphase8Entity>(context.bakeLayer(Modelhydro_hypostasis.LAYER_LOCATION)), 1f);
		this.addLayer(new RenderLayer<Hydrohypostasisphase8Entity, Modelhydro_hypostasis<Hydrohypostasisphase8Entity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("genshin_nature:textures/entities/emissive_hydro_hypostasis.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, Hydrohypostasisphase8Entity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
				this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(Hydrohypostasisphase8Entity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/hydro_hypostasis.png");
	}
}

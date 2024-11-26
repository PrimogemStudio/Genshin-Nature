
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.genshinnature.entity.FatuiskirmishergeochanterbracerEntity;
import net.mcreator.genshinnature.client.model.Modelfatui_enchanter;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class FatuiskirmishergeochanterbracerRenderer extends MobRenderer<FatuiskirmishergeochanterbracerEntity, Modelfatui_enchanter<FatuiskirmishergeochanterbracerEntity>> {
	public FatuiskirmishergeochanterbracerRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelfatui_enchanter<FatuiskirmishergeochanterbracerEntity>(context.bakeLayer(Modelfatui_enchanter.LAYER_LOCATION)), 0.5f);
		this.addLayer(new RenderLayer<FatuiskirmishergeochanterbracerEntity, Modelfatui_enchanter<FatuiskirmishergeochanterbracerEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("genshin_nature:textures/entities/emissive_geochanter_bracer.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, FatuiskirmishergeochanterbracerEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw,
					float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
				this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(FatuiskirmishergeochanterbracerEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/geochanter_bracer.png");
	}
}

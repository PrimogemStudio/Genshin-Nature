
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.genshinnature.entity.AbyssmagepyroEntity;
import net.mcreator.genshinnature.client.model.Modelabyssmage_pyro;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class AbyssmagepyroRenderer extends MobRenderer<AbyssmagepyroEntity, Modelabyssmage_pyro<AbyssmagepyroEntity>> {
	public AbyssmagepyroRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelabyssmage_pyro<AbyssmagepyroEntity>(context.bakeLayer(Modelabyssmage_pyro.LAYER_LOCATION)), 0.5f);
		this.addLayer(new RenderLayer<AbyssmagepyroEntity, Modelabyssmage_pyro<AbyssmagepyroEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("genshin_nature:textures/entities/emissive_abyssmage_pyro.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, AbyssmagepyroEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
				this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(AbyssmagepyroEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/abyssmage_pyro.png");
	}
}

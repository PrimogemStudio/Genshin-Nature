
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.genshinnature.entity.PyroabyssmageEntity;
import net.mcreator.genshinnature.client.model.Modelabyssmage_shielded;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class PyroabyssmageRenderer extends MobRenderer<PyroabyssmageEntity, Modelabyssmage_shielded<PyroabyssmageEntity>> {
	public PyroabyssmageRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelabyssmage_shielded<PyroabyssmageEntity>(context.bakeLayer(Modelabyssmage_shielded.LAYER_LOCATION)), 2.7f);
		this.addLayer(new RenderLayer<PyroabyssmageEntity, Modelabyssmage_shielded<PyroabyssmageEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("genshin_nature:textures/entities/emissive_abyssmage_shielded_pyro.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, PyroabyssmageEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
				this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(PyroabyssmageEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/abyssmage_shielded_pyro.png");
	}
}

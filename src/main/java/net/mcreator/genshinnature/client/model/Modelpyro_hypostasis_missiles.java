package net.mcreator.genshinnature.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelpyro_hypostasis_missiles<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("genshin_nature", "modelpyro_hypostasis_missiles"), "main");
	public final ModelPart bb_main;

	public Modelpyro_hypostasis_missiles(ModelPart root) {
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(0, 0).addBox(-8.44F, -26.28F, -1.32F, 17.0F, 21.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 60).addBox(-7.44F, -4.28F, -5.32F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 60)
						.addBox(-4.44F, -14.28F, 1.68F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 60).addBox(-2.44F, -3.28F, 0.68F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 60)
						.addBox(9.56F, -18.28F, 1.68F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 60).addBox(-7.44F, -28.28F, 1.68F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 60)
						.addBox(-12.44F, -19.28F, -7.32F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 60).addBox(5.56F, -12.28F, -7.32F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 60)
						.addBox(0.56F, -26.28F, -7.32F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 60).addBox(0.56F, -23.28F, 0.68F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 0)
						.addBox(8.56F, -25.28F, -1.32F, 2.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 0).addBox(-10.44F, -25.28F, -1.32F, 2.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int rgb) {
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
	}
}

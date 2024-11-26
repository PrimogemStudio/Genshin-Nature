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
public class Modelendora<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("genshin_nature", "modelendora"), "main");
	public final ModelPart bone;
	public final ModelPart head;
	public final ModelPart left_arm;
	public final ModelPart right_arm;

	public Modelendora(ModelPart root) {
		this.bone = root.getChild("bone");
		this.head = root.getChild("head");
		this.left_arm = root.getChild("left_arm");
		this.right_arm = root.getChild("right_arm");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition bone = partdefinition.addOrReplaceChild("bone",
				CubeListBuilder.create().texOffs(16, 22).addBox(-6.5F, 0.0F, -1.0F, 6.0F, 10.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(48, 1).addBox(-6.5F, 0.0F, -2.0F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(29, 2)
						.addBox(-4.5F, 2.0F, -2.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(57, 13).addBox(-5.5F, 2.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(57, 13)
						.addBox(-2.5F, 2.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(43, 9).addBox(-4.5F, 4.0F, -2.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.5F, 11.0F, -2.0F, 0.3491F, 0.0F, 0.0F));
		PartDefinition cube_r1 = bone.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(1, 1).addBox(0.5F, 0.0F, -1.5F, 1.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.0F, 2.0F, -1.0F, 0.0F, -0.5236F, 0.1309F));
		PartDefinition cube_r2 = bone.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(1, 1).mirror().addBox(-1.5F, 0.0F, -1.5F, 1.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 2.0F, -1.0F, 0.0F, 0.5236F, -0.1309F));
		PartDefinition cube_r3 = bone.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 24).addBox(-2.0F, -1.0F, -1.5F, 4.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.5F, 10.0F, 1.5F, 0.4363F, 0.0F, 0.0F));
		PartDefinition head = partdefinition.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(14, 8).addBox(-3.0F, -6.0F, -4.0F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(45, 24).addBox(3.0F, -4.0F, -2.0F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(45, 24)
						.addBox(-4.0F, -4.0F, -2.0F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(17, 40).addBox(3.0F, -7.0F, -4.0F, 1.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(17, 40)
						.addBox(-4.0F, -7.0F, -4.0F, 1.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(17, 40).addBox(2.0F, -7.0F, -4.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(17, 40)
						.addBox(-3.0F, -7.0F, -4.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(40, 34).addBox(-2.0F, -8.0F, -4.0F, 4.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(41, 17)
						.addBox(-3.0F, -7.0F, 4.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 35).addBox(-2.0F, -8.0F, -5.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(17, 40)
						.addBox(-3.0F, -7.0F, -5.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(17, 40).addBox(2.0F, -7.0F, -5.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(17, 40)
						.addBox(2.0F, -8.0F, -4.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(17, 40).addBox(-3.0F, -8.0F, -4.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(17, 41)
						.addBox(-2.0F, -9.0F, -3.0F, 4.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(17, 41).addBox(-2.0F, -10.0F, -1.0F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 11.0F, 0.0F));
		PartDefinition cube_r4 = head.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(2, 17).addBox(-6.4F, -3.5F, -1.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(2, 17).addBox(-0.4F, -3.5F, -1.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.9F, -6.5F, -2.0F, 0.1745F, 0.0F, 0.0F));
		PartDefinition left_arm = partdefinition.addOrReplaceChild("left_arm", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.4749F, 11.787F, 0.3386F, 0.3491F, 0.0F, 0.0F));
		PartDefinition cube_r5 = left_arm.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 34).addBox(0.5F, -1.0F, -2.0F, 1.0F, 8.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0251F, 0.4606F, -0.9284F, 0.0F, 0.0F, 0.5236F));
		PartDefinition cube_r6 = left_arm.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 51).addBox(0.9F, 0.0F, -2.0F, 1.0F, 8.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0251F, 0.4606F, -0.9284F, 0.0F, 0.0F, 0.1745F));
		PartDefinition right_arm = partdefinition.addOrReplaceChild("right_arm", CubeListBuilder.create(), PartPose.offsetAndRotation(3.4003F, 11.4705F, 0.2234F, 0.3491F, 0.0F, 0.0F));
		PartDefinition cube_r7 = right_arm.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 51).addBox(-0.9F, 0.0F, -2.0F, 1.0F, 8.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0997F, 0.7974F, -0.9284F, 0.0F, 0.0F, -0.1745F));
		PartDefinition cube_r8 = right_arm.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 34).mirror().addBox(-0.5F, -1.0F, -2.0F, 1.0F, 8.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0997F, 0.7974F, -0.9284F, 0.0F, 0.0F, -0.5236F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int rgb) {
		bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		left_arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		right_arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
	}
}

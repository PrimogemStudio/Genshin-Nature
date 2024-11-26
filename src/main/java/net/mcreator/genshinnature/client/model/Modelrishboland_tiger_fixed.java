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
public class Modelrishboland_tiger_fixed<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("genshin_nature", "modelrishboland_tiger_fixed"), "main");
	public final ModelPart bone;
	public final ModelPart head;
	public final ModelPart left_arm;
	public final ModelPart right_arm;
	public final ModelPart right_leg;
	public final ModelPart left_leg;
	public final ModelPart tail;
	public final ModelPart decoration;
	public final ModelPart decoration2;

	public Modelrishboland_tiger_fixed(ModelPart root) {
		this.bone = root.getChild("bone");
		this.head = this.bone.getChild("head");
		this.left_arm = this.bone.getChild("left_arm");
		this.right_arm = this.bone.getChild("right_arm");
		this.right_leg = this.bone.getChild("right_leg");
		this.left_leg = this.bone.getChild("left_leg");
		this.tail = this.bone.getChild("tail");
		this.decoration = this.bone.getChild("decoration");
		this.decoration2 = this.bone.getChild("decoration2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition bone = partdefinition.addOrReplaceChild("bone",
				CubeListBuilder.create().texOffs(0, 12).addBox(-9.75F, -3.75F, -3.5F, 11.0F, 8.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(30, 0).addBox(1.25F, -4.75F, -3.5F, 6.0F, 9.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.25F, 15.75F, -0.5F, 0.0F, 1.5708F, 0.0F));
		PartDefinition head = bone.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(0, 0).addBox(-0.16F, -2.996F, -3.0F, 4.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(38, 17).addBox(3.84F, -1.006F, -2.0F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(52, 0)
						.addBox(3.64F, 0.994F, -1.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(23, 0).addBox(0.84F, -3.996F, 2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(23, 0)
						.addBox(0.84F, -3.996F, -4.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(7.41F, -3.754F, 0.0F));
		PartDefinition left_arm = bone.addOrReplaceChild("left_arm", CubeListBuilder.create().texOffs(41, 26).addBox(-0.528F, 7.5804F, -1.2667F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(4.878F, -0.3304F, -3.5833F));
		PartDefinition cube_r1 = left_arm.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(56, 25).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.528F, 2.5804F, 0.1833F, 0.0F, 0.0F, -0.3491F));
		PartDefinition cube_r2 = left_arm.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(56, 35).addBox(-1.5F, -1.0F, -0.5F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.128F, 0.5804F, -0.4167F, 0.0F, 0.0F, 0.3491F));
		PartDefinition right_arm = bone.addOrReplaceChild("right_arm", CubeListBuilder.create().texOffs(41, 26).addBox(-0.528F, 7.5804F, -1.2667F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(4.878F, -0.3304F, 3.4167F));
		PartDefinition cube_r3 = right_arm.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(56, 25).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.528F, 2.5804F, 0.1833F, 0.0F, 0.0F, -0.3491F));
		PartDefinition cube_r4 = right_arm.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(56, 35).addBox(-1.5F, -1.0F, 0.5F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.128F, 0.5804F, -0.4167F, 0.0F, 0.0F, 0.3491F));
		PartDefinition right_leg = bone.addOrReplaceChild("right_leg", CubeListBuilder.create().texOffs(41, 26).addBox(-0.528F, 7.5804F, -1.2667F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(-6.122F, -0.3304F, 3.4167F));
		PartDefinition cube_r5 = right_leg.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(56, 25).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.528F, 2.5804F, 0.1833F, 0.0F, 0.0F, -0.3491F));
		PartDefinition cube_r6 = right_leg.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(56, 35).addBox(-1.5F, -1.0F, 0.5F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.128F, 0.5804F, -0.4167F, 0.0F, 0.0F, 0.3491F));
		PartDefinition left_leg = bone.addOrReplaceChild("left_leg", CubeListBuilder.create().texOffs(41, 26).addBox(-0.528F, 7.5804F, -1.2667F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(-6.122F, -0.3304F, -3.5833F));
		PartDefinition cube_r7 = left_leg.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(56, 25).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.528F, 2.5804F, 0.1833F, 0.0F, 0.0F, -0.3491F));
		PartDefinition cube_r8 = left_leg.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(56, 35).addBox(-1.5F, -1.0F, -0.5F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.128F, 0.5804F, -0.4167F, 0.0F, 0.0F, 0.3491F));
		PartDefinition tail = bone.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(1, 37).addBox(-33.5834F, -0.2F, -1.0F, 14.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(4.25F, 4.25F, -1.5F));
		PartDefinition cube_r9 = tail.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(16, 29).addBox(-6.5F, -1.0F, -1.0F, 8.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-14.5F, -3.0F, 1.5F, 0.0F, 0.0F, -0.3927F));
		PartDefinition decoration = bone.addOrReplaceChild("decoration", CubeListBuilder.create(), PartPose.offset(4.25F, 4.25F, -1.5F));
		PartDefinition cube_r10 = decoration.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(58, 14).addBox(0.0F, -14.0F, -2.5F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(43, 39)
				.addBox(0.0F, -13.0F, -1.5F, 0.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(26, 44).addBox(0.0F, -12.0F, -0.5F, 0.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, -11.0F, -1.5F, 0.0F, 0.0F, -0.9599F));
		PartDefinition decoration2 = bone.addOrReplaceChild("decoration2", CubeListBuilder.create(), PartPose.offset(4.25F, 4.25F, 4.5F));
		PartDefinition cube_r11 = decoration2.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(54, 18).addBox(0.0F, -14.0F, 1.5F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(39, 43)
				.addBox(0.0F, -13.0F, 0.5F, 0.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(22, 48).addBox(0.0F, -12.0F, -0.5F, 0.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, -11.0F, -1.5F, 0.0F, 0.0F, -0.9599F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int rgb) {
		bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
	}
}

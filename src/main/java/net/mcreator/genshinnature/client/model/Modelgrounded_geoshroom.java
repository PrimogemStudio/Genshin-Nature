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
public class Modelgrounded_geoshroom<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("genshin_nature", "modelgrounded_geoshroom"), "main");
	public final ModelPart bone;
	public final ModelPart head;
	public final ModelPart hat;
	public final ModelPart bone2;
	public final ModelPart right_arm;
	public final ModelPart left_arm;
	public final ModelPart left_leg;
	public final ModelPart right_leg;

	public Modelgrounded_geoshroom(ModelPart root) {
		this.bone = root.getChild("bone");
		this.head = this.bone.getChild("head");
		this.hat = this.head.getChild("hat");
		this.bone2 = this.bone.getChild("bone2");
		this.right_arm = this.bone.getChild("right_arm");
		this.left_arm = this.bone.getChild("left_arm");
		this.left_leg = this.bone.getChild("left_leg");
		this.right_leg = this.bone.getChild("right_leg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition bone = partdefinition.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 2.0F));
		PartDefinition head = bone.addOrReplaceChild("head", CubeListBuilder.create().texOffs(32, 14).addBox(-3.002F, -8.0387F, -4.138F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.002F, -10.9613F, -3.862F));
		PartDefinition cube_r1 = head.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(62, 34).addBox(0.5F, -1.0F, -1.0F, 1.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.502F, -7.0387F, -1.138F, 0.0F, 0.0F, 0.6545F));
		PartDefinition cube_r2 = head.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(62, 34).addBox(-1.5F, -1.0F, -1.0F, 1.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.498F, -7.0387F, -1.138F, 0.0F, 0.0F, -0.6545F));
		PartDefinition cube_r3 = head.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(48, 110).addBox(-4.01F, -2.5F, -1.5F, 8.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.008F, 0.4613F, -1.638F, 0.0873F, 0.0F, 0.0F));
		PartDefinition cube_r4 = head.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 121).addBox(-4.0F, -1.5F, -1.5F, 8.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.008F, 0.4613F, -1.638F, 0.2182F, 0.0F, 0.0F));
		PartDefinition hat = head.addOrReplaceChild("hat",
				CubeListBuilder.create().texOffs(72, 78).addBox(-7.0F, -22.0F, -12.0F, 14.0F, 2.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(102, 0).addBox(-6.0F, -20.0F, -12.0F, 12.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(102, 0)
						.addBox(-6.0F, -20.0F, 1.0F, 12.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(95, 49).mirror().addBox(-7.0F, -20.0F, -11.0F, 1.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(95, 49)
						.addBox(6.0F, -20.0F, -11.0F, 1.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(80, 114).addBox(-6.0F, -24.0F, -11.0F, 12.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(22, 73)
						.addBox(-4.0F, -25.0F, -9.0F, 8.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-0.002F, 11.9613F, 3.862F));
		PartDefinition bone2 = bone.addOrReplaceChild("bone2", CubeListBuilder.create().texOffs(0, 51).addBox(-3.0F, -8.5F, -2.5F, 6.0F, 9.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.5F, 1.5F, 0.7854F, 0.0F, 0.0F));
		PartDefinition cube_r5 = bone2.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(75, 11).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 2.5F, -0.4363F, 0.0F, 0.0F));
		PartDefinition right_arm = bone.addOrReplaceChild("right_arm", CubeListBuilder.create(), PartPose.offsetAndRotation(3.0F, -9.5603F, -6.0F, 0.0F, -0.3927F, 0.0F));
		PartDefinition cube_r6 = right_arm.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F, -0.5F, -2.5F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0603F, -0.5F, 1.2217F, 0.0F, 0.0F));
		PartDefinition left_arm = bone.addOrReplaceChild("left_arm", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.0F, -9.5603F, -6.0F, 0.0F, 0.3927F, 0.0F));
		PartDefinition cube_r7 = left_arm.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-0.5F, -0.5F, -2.5F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0603F, -0.5F, 1.2217F, 0.0F, 0.0F));
		PartDefinition left_leg = bone.addOrReplaceChild("left_leg", CubeListBuilder.create().texOffs(2, 42).addBox(-0.725F, -1.1807F, -1.3081F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(20, 0)
				.addBox(-0.725F, 2.8193F, 0.7919F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 33).addBox(-1.725F, 4.8193F, -1.2081F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.275F, -6.8193F, 0.7081F));
		PartDefinition cube_r8 = left_leg.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(30, 40).addBox(-1.1F, -1.5F, -0.4F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.275F, 2.3193F, 0.6919F, 0.48F, 0.0F, 0.0F));
		PartDefinition right_leg = bone
				.addOrReplaceChild(
						"right_leg", CubeListBuilder.create().texOffs(2, 42).addBox(-0.275F, -1.1807F, -1.3081F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(20, 0)
								.addBox(-1.275F, 2.8193F, 0.7919F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 33).mirror().addBox(-1.275F, 4.8193F, -1.2081F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
						PartPose.offset(3.275F, -6.8193F, 0.7081F));
		PartDefinition cube_r9 = right_leg.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(30, 40).addBox(-1.9F, -1.5F, -0.4F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.725F, 2.3193F, 0.6919F, 0.48F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int rgb) {
		bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
	}
}

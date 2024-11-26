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
public class Modelruin_hunter<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("genshin_nature", "modelruin_hunter"), "main");
	public final ModelPart body;
	public final ModelPart bone3;
	public final ModelPart bone2;
	public final ModelPart bone;
	public final ModelPart left_arm;
	public final ModelPart right_arm;
	public final ModelPart bb_main;

	public Modelruin_hunter(ModelPart root) {
		this.body = root.getChild("body");
		this.bone3 = this.body.getChild("bone3");
		this.bone2 = this.body.getChild("bone2");
		this.bone = this.body.getChild("bone");
		this.left_arm = root.getChild("left_arm");
		this.right_arm = root.getChild("right_arm");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(70, 0).addBox(-7.0F, -21.0F, -2.0F, 14.0F, 15.0F, 15.0F, new CubeDeformation(0.0F)).texOffs(0, 81)
				.addBox(-17.0F, -47.0F, -5.0F, 34.0F, 26.0F, 21.0F, new CubeDeformation(0.0F)).texOffs(13, 81).addBox(-4.0F, -49.0F, -5.0F, 9.0F, 2.0F, 21.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition bone3 = body.addOrReplaceChild("bone3", CubeListBuilder.create().texOffs(130, 0).mirror().addBox(-2.9333F, -4.6786F, 0.1348F, 6.0F, 6.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-11.0667F, -39.3214F, 15.8652F, 1.0915F, 0.1128F, -0.7606F));
		PartDefinition cube_r1 = bone3.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(98, 129).mirror().addBox(-2.0F, -1.3301F, -3.3397F, 4.0F, 4.0F, 27.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.0333F, -15.1786F, 30.6778F, 1.0472F, 0.0F, 0.0F));
		PartDefinition cube_r2 = bone3.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(98, 50).mirror().addBox(-3.1F, -3.0F, -0.5F, 6.0F, 6.0F, 25.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0667F, -1.6786F, 8.6348F, 0.5236F, 0.0F, 0.0F));
		PartDefinition bone2 = body.addOrReplaceChild("bone2", CubeListBuilder.create().texOffs(130, 0).addBox(-3.0F, -4.6786F, -0.8652F, 6.0F, 6.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(11.0F, -39.3214F, 16.8652F, 0.746F, 0.0964F, 0.6996F));
		PartDefinition cube_r3 = bone2.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(98, 129).mirror().addBox(-2.0F, -1.3301F, -3.3397F, 4.0F, 4.0F, 27.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.1F, -15.1786F, 29.6778F, 1.0472F, 0.0F, 0.0F));
		PartDefinition cube_r4 = bone2.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(98, 50).addBox(-2.9F, -3.0F, -0.5F, 6.0F, 6.0F, 25.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.6786F, 7.6348F, 0.5236F, 0.0F, 0.0F));
		PartDefinition bone = body.addOrReplaceChild("bone",
				CubeListBuilder.create().texOffs(112, 34).addBox(-9.92F, -32.52F, -6.16F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(112, 34).addBox(-7.28F, -29.88F, -6.16F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(29, 54)
						.addBox(-8.08F, -43.64F, -6.16F, 16.0F, 14.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(112, 34).addBox(-2.36F, -29.88F, -6.16F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(112, 34)
						.addBox(-9.92F, -43.08F, -6.16F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(112, 34).addBox(-7.28F, -45.72F, -6.16F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(112, 34)
						.addBox(-2.36F, -45.72F, -6.16F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(112, 34).addBox(-9.92F, -39.04F, -6.16F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(112, 34)
						.addBox(5.04F, -45.72F, -6.16F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(112, 34).addBox(7.68F, -43.08F, -6.16F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(112, 34)
						.addBox(7.68F, -39.04F, -6.16F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(112, 34).addBox(7.68F, -32.52F, -6.16F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(112, 34)
						.addBox(5.04F, -29.88F, -6.16F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition left_arm = partdefinition.addOrReplaceChild("left_arm", CubeListBuilder.create().texOffs(0, 26).mirror().addBox(-5.25F, -0.5F, -6.5F, 10.0F, 8.0F, 13.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(-21.75F, -20.5F, 5.5F));
		PartDefinition cube_r5 = left_arm.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 50).mirror().addBox(-2.4548F, 13.38F, -3.6936F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(89, 31).mirror()
				.addBox(-2.11F, -0.62F, -2.8789F, 5.0F, 14.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.2952F, 20.3036F, -3.3064F, -1.0413F, 0.056F, 0.211F));
		PartDefinition cube_r6 = left_arm.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(66, 31).mirror().addBox(-2.5F, 0.0F, -2.5F, 5.0F, 16.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.25F, 6.5F, 0.0F, -0.2559F, 0.056F, 0.211F));
		PartDefinition right_arm = partdefinition.addOrReplaceChild("right_arm", CubeListBuilder.create().texOffs(0, 26).addBox(-4.75F, -0.5F, -6.5F, 10.0F, 8.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offset(21.75F, -20.5F, 5.5F));
		PartDefinition cube_r7 = right_arm.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 50).addBox(-3.0452F, 13.38F, -3.6936F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(89, 31).mirror()
				.addBox(-2.89F, -0.62F, -2.8789F, 5.0F, 14.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.2952F, 20.3036F, -3.3064F, -1.0413F, -0.056F, -0.211F));
		PartDefinition cube_r8 = right_arm.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(66, 31).mirror().addBox(-2.5F, 0.0F, -2.5F, 5.0F, 16.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.25F, 6.5F, 0.0F, -0.2559F, -0.056F, -0.211F));
		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(44, 0).addBox(-2.0F, -1.0F, -8.0F, 4.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 4).mirror().addBox(-7.5F, -1.0F, -2.0F, 1.0F, 1.0F, 15.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 4).addBox(6.5F, -1.0F, -2.0F, 1.0F, 1.0F, 15.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-6.5F, -1.0F, -2.0F, 13.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(25, 11)
						.addBox(-6.5F, -0.5F, -1.0F, 13.0F, 0.0F, 13.0F, new CubeDeformation(0.0F)).texOffs(25, 4).addBox(4.0F, -1.0F, -6.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(25, 4)
						.addBox(-7.0F, -1.0F, -6.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(44, 26).addBox(7.5F, -2.0F, 3.0F, 2.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(44, 26).mirror()
						.addBox(-9.5F, -2.0F, 3.0F, 2.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition cube_r9 = bb_main.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-6.5F, -0.5F, -0.5F, 13.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -0.5F, 12.5F, -3.1416F, 0.0F, 3.1416F));
		return LayerDefinition.create(meshdefinition, 160, 160);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int rgb) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		left_arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		right_arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
	}
}

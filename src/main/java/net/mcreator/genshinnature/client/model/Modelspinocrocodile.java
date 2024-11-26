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
public class Modelspinocrocodile<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("genshin_nature", "modelspinocrocodile"), "main");
	public final ModelPart bone;
	public final ModelPart head;
	public final ModelPart jaws;
	public final ModelPart tail;
	public final ModelPart left_arm;
	public final ModelPart right_arm;
	public final ModelPart right_leg;
	public final ModelPart left_leg;
	public final ModelPart decorations;

	public Modelspinocrocodile(ModelPart root) {
		this.bone = root.getChild("bone");
		this.head = this.bone.getChild("head");
		this.jaws = this.head.getChild("jaws");
		this.tail = this.bone.getChild("tail");
		this.left_arm = this.bone.getChild("left_arm");
		this.right_arm = this.bone.getChild("right_arm");
		this.right_leg = this.bone.getChild("right_leg");
		this.left_leg = this.bone.getChild("left_leg");
		this.decorations = this.bone.getChild("decorations");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition bone = partdefinition.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -4.0F, -8.0F, 8.0F, 4.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 2.0F));
		PartDefinition head = bone.addOrReplaceChild("head", CubeListBuilder.create().texOffs(20, 21).addBox(-3.0F, -2.0F, -6.0F, 6.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -2.0F, -8.0F));
		PartDefinition jaws = head.addOrReplaceChild("jaws", CubeListBuilder.create().texOffs(18, 31).addBox(-2.0F, -1.0F, -20.0F, 4.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(-2.0F, -3.0F, -17.0F, 4.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 5).addBox(-1.5F, -3.0F, -20.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 2.0F, 8.0F));
		PartDefinition tail = bone.addOrReplaceChild("tail",
				CubeListBuilder.create().texOffs(0, 18).addBox(-3.5F, -4.0F, 6.0F, 7.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 27).addBox(-3.0F, -4.0F, 12.0F, 6.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(30, 0)
						.addBox(-2.0F, -3.5F, 18.0F, 4.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(46, 0).addBox(-1.5F, -3.5F, 24.0F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition left_arm = bone.addOrReplaceChild("left_arm", CubeListBuilder.create().texOffs(38, 8).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-5.0F, -2.5F, -6.0F));
		PartDefinition right_arm = bone.addOrReplaceChild("right_arm", CubeListBuilder.create().texOffs(38, 8).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, -2.5F, -6.0F));
		PartDefinition right_leg = bone.addOrReplaceChild("right_leg", CubeListBuilder.create().texOffs(38, 8).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, -2.5F, 3.0F));
		PartDefinition left_leg = bone.addOrReplaceChild("left_leg", CubeListBuilder.create().texOffs(38, 8).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-5.0F, -2.5F, 3.0F));
		PartDefinition decorations = bone.addOrReplaceChild("decorations",
				CubeListBuilder.create().texOffs(42, 42).mirror().addBox(0.0F, -7.0F, -9.5F, 0.0F, 4.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(44, 28).mirror().addBox(0.0F, -7.0F, -2.3F, 0.0F, 4.0F, 7.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(44, 28).mirror().addBox(0.0F, -7.0F, 4.8F, 0.0F, 4.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(44, 28).mirror().addBox(0.0F, -7.0F, 12.0F, 0.0F, 4.0F, 7.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(22, 43).mirror().addBox(0.0F, -6.0F, 19.5F, 0.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(47, 15).mirror().addBox(0.0F, -6.0F, 25.8F, 0.0F, 3.0F, 4.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r1 = decorations.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(12, 44).mirror().addBox(0.0F, -4.5F, -1.5F, 0.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -4.5F, -11.5F, 0.5236F, 0.0F, 0.0F));
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

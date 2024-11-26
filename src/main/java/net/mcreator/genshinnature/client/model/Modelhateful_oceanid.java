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
public class Modelhateful_oceanid<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("genshin_nature", "modelhateful_oceanid"), "main");
	public final ModelPart head;
	public final ModelPart leftarm;
	public final ModelPart rightarm;
	public final ModelPart bone;

	public Modelhateful_oceanid(ModelPart root) {
		this.head = root.getChild("head");
		this.leftarm = root.getChild("leftarm");
		this.rightarm = root.getChild("rightarm");
		this.bone = root.getChild("bone");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 12).addBox(-4.0F, -9.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(-2.0F, -12.0F, -4.01F, 4.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(52, 6).addBox(-1.0F, -13.0F, -2.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -8.0F, 0.0F));
		PartDefinition cube_r1 = head.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(58, 0).addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -13.0F, 1.5F, -0.7418F, 0.0F, 0.0F));
		PartDefinition cube_r2 = head.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(43, 0).addBox(1.0F, -9.5F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 0)
				.addBox(-1.0F, -5.5F, -2.0F, 3.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-3.0F, -1.5F, -4.01F, 5.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, -8.5F, 0.0F, 0.0F, 0.0F, 0.829F));
		PartDefinition cube_r3 = head.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(43, 0).addBox(-2.0F, -9.5F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 0)
				.addBox(-2.0F, -5.5F, -2.0F, 3.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-2.0F, -1.5F, -4.01F, 5.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, -8.5F, 0.0F, 0.0F, 0.0F, -0.829F));
		PartDefinition leftarm = partdefinition.addOrReplaceChild("leftarm", CubeListBuilder.create().texOffs(28, 43).addBox(-14.0F, -3.0F, -2.0F, 15.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -2.0F, 0.5F, 0.0F, 0.1745F, -0.5672F));
		PartDefinition cube_r4 = leftarm.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(40, 51).addBox(-9.5F, -2.0F, -1.5F, 9.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-13.5F, -1.0F, -0.5F, 0.3819F, -0.4891F, -0.7073F));
		PartDefinition cube_r5 = leftarm.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(40, 51).addBox(-9.5F, -2.0F, -1.5F, 9.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-13.5F, -1.0F, -0.5F, 0.2075F, 0.5788F, 0.1056F));
		PartDefinition cube_r6 = leftarm.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(40, 51).addBox(-9.5F, -2.0F, -1.5F, 9.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-13.5F, -1.0F, -0.5F, 0.0F, 0.0F, -0.2618F));
		PartDefinition rightarm = partdefinition.addOrReplaceChild("rightarm", CubeListBuilder.create().texOffs(28, 43).mirror().addBox(-1.0F, -3.0F, -2.0F, 15.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.0F, -2.0F, 0.5F, 0.0F, -0.1745F, 0.5672F));
		PartDefinition cube_r7 = rightarm.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(40, 51).mirror().addBox(0.5F, -2.0F, -1.5F, 9.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(13.5F, -1.0F, -0.5F, 0.3298F, 0.4703F, 0.6469F));
		PartDefinition cube_r8 = rightarm.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(40, 51).mirror().addBox(0.5F, -2.0F, -1.5F, 9.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(13.5F, -1.0F, -0.5F, 0.1447F, -0.6855F, 0.0356F));
		PartDefinition cube_r9 = rightarm.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(40, 51).mirror().addBox(0.5F, -2.0F, -1.5F, 9.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(13.5F, -1.0F, -0.5F, 0.0F, 0.0F, 0.2618F));
		PartDefinition bone = partdefinition.addOrReplaceChild("bone",
				CubeListBuilder.create().texOffs(44, 11).addBox(-2.5F, -33.0F, -2.5F, 5.0F, 26.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(35, 29).addBox(-1.5F, -31.5F, -3.5F, 3.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 35)
						.addBox(-1.0F, -26.5F, -3.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(37, 35).addBox(-0.5F, -25.5F, -3.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(34, 30)
						.addBox(1.5F, -32.0F, -3.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(34, 30).addBox(2.5F, -31.5F, -3.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(34, 30)
						.addBox(3.5F, -31.0F, -3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(34, 30).addBox(-2.5F, -32.0F, -3.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(34, 30)
						.addBox(-3.5F, -31.5F, -3.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(34, 30).addBox(-4.5F, -31.0F, -3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition cube_r10 = bone.addOrReplaceChild("cube_r10",
				CubeListBuilder.create().texOffs(52, 58).addBox(3.5F, 7.5F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 57).addBox(2.5F, 5.5F, -2.5F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(16, 53)
						.addBox(1.5F, -0.5F, -2.5F, 3.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(16, 53).addBox(-0.5F, -1.5F, -2.5F, 2.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, -6.5F, 0.0F, 0.0F, 0.0F, -0.5236F));
		PartDefinition cube_r11 = bone.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(52, 58).addBox(-4.5F, 7.5F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 57).addBox(-4.5F, 5.5F, -2.5F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(16, 53)
						.addBox(-4.5F, -0.5F, -2.5F, 3.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(16, 53).addBox(-1.5F, -1.5F, -2.5F, 2.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -6.5F, 0.0F, 0.0F, 0.0F, 0.5236F));
		PartDefinition cube_r12 = bone.addOrReplaceChild("cube_r12",
				CubeListBuilder.create().texOffs(0, 29).addBox(-1.25F, -4.875F, 8.75F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(0, 39).addBox(-1.25F, -2.875F, 4.75F, 2.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(0, 39)
						.addBox(-0.25F, -1.875F, 1.75F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(0, 39).addBox(-0.25F, -0.875F, -0.25F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.25F, -30.125F, -2.25F, 0.0873F, -0.0873F, 0.0F));
		PartDefinition cube_r13 = bone.addOrReplaceChild("cube_r13",
				CubeListBuilder.create().texOffs(0, 29).addBox(-0.75F, -4.875F, 8.75F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(0, 39).addBox(-0.75F, -2.875F, 4.75F, 2.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(0, 39)
						.addBox(-0.75F, -1.875F, 1.75F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(0, 39).addBox(-0.75F, -0.875F, -0.25F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.25F, -30.125F, -2.25F, 0.0873F, 0.0873F, 0.0F));
		PartDefinition cube_r14 = bone.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(34, 9).addBox(-2.5F, -0.5F, -0.5F, 3.0F, 13.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -28.5F, -3.0F, 0.1745F, 0.0F, 0.5672F));
		PartDefinition cube_r15 = bone.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(34, 9).mirror().addBox(-0.5F, -0.5F, -0.5F, 3.0F, 13.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.0F, -28.5F, -3.0F, 0.1745F, 0.0F, -0.5672F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int rgb) {
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		leftarm.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		rightarm.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}

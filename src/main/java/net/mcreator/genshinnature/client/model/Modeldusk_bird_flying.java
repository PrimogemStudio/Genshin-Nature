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
public class Modeldusk_bird_flying<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("genshin_nature", "modeldusk_bird_flying"), "main");
	public final ModelPart bone;
	public final ModelPart head;
	public final ModelPart left_leg;
	public final ModelPart right_leg;
	public final ModelPart right_wing;
	public final ModelPart left_wing;

	public Modeldusk_bird_flying(ModelPart root) {
		this.bone = root.getChild("bone");
		this.head = this.bone.getChild("head");
		this.left_leg = this.bone.getChild("left_leg");
		this.right_leg = this.bone.getChild("right_leg");
		this.right_wing = this.bone.getChild("right_wing");
		this.left_wing = this.bone.getChild("left_wing");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition bone = partdefinition.addOrReplaceChild("bone",
				CubeListBuilder.create().texOffs(26, 45).addBox(-1.0F, 2.6667F, 2.6667F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(43, 37).addBox(-1.0F, 1.6667F, 5.6667F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 18.3333F, 0.3333F, 0.6545F, 0.0F, 0.0F));
		PartDefinition cube_r1 = bone.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(16, 19).addBox(-2.0F, -2.0F, -3.5F, 4.0F, 4.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.6667F, 0.1667F, -0.3491F, 0.0F, 0.0F));
		PartDefinition head = bone.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(46, 15).addBox(0.0F, -4.9F, -1.4F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(55, 9).addBox(0.0F, -5.9F, -1.4F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(48, 3).mirror()
						.addBox(0.0F, -6.9F, -1.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 0).addBox(-1.5F, -3.9F, -1.4F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(22, 0)
						.addBox(-1.0F, -3.9F, -6.4F, 2.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.4333F, -1.9333F, -0.3927F, 0.0F, 0.0F));
		PartDefinition left_leg = bone.addOrReplaceChild("left_leg",
				CubeListBuilder.create().texOffs(56, 60).addBox(-0.5F, 2.5F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(60, 51).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.4F, 2.0667F, -0.3333F, 0.48F, 0.0F, 0.0F));
		PartDefinition right_leg = bone.addOrReplaceChild("right_leg",
				CubeListBuilder.create().texOffs(56, 60).addBox(-0.5F, 2.5F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(60, 51).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.4F, 2.0667F, -0.3333F, 0.48F, 0.0F, 0.0F));
		PartDefinition right_wing = bone.addOrReplaceChild("right_wing", CubeListBuilder.create(), PartPose.offsetAndRotation(1.5F, 0.8377F, -2.3635F, -0.9599F, 0.0F, -1.5708F));
		PartDefinition cube_r2 = right_wing.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 54).addBox(2.0F, -2.0F, -2.5F, 1.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.5F, -0.171F, 2.5302F, -0.3491F, 0.0F, 0.0F));
		PartDefinition left_wing = bone.addOrReplaceChild("left_wing", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.5F, 0.8377F, -2.3635F, -0.9599F, 0.0F, 1.5708F));
		PartDefinition cube_r3 = left_wing.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 54).addBox(2.0F, -2.0F, -2.5F, 1.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.5F, -0.171F, 2.5302F, -0.3491F, 0.0F, 0.0F));
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

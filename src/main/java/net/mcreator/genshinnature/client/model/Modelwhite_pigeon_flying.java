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
public class Modelwhite_pigeon_flying<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("genshin_nature", "modelwhite_pigeon_flying"), "main");
	public final ModelPart bone;
	public final ModelPart wings2;
	public final ModelPart wings;
	public final ModelPart right_leg;
	public final ModelPart left_leg;
	public final ModelPart head;

	public Modelwhite_pigeon_flying(ModelPart root) {
		this.bone = root.getChild("bone");
		this.wings2 = this.bone.getChild("wings2");
		this.wings = this.bone.getChild("wings");
		this.right_leg = this.bone.getChild("right_leg");
		this.left_leg = this.bone.getChild("left_leg");
		this.head = this.bone.getChild("head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition bone = partdefinition.addOrReplaceChild("bone",
				CubeListBuilder.create().texOffs(52, 0).addBox(-1.5033F, -3.3631F, -5.1972F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(20, 0).addBox(-1.9933F, 1.4369F, 2.0028F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0033F, 19.3631F, -0.8028F, 0.48F, 0.0F, 0.0F));
		PartDefinition cube_r1 = bone.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -0.8F, -6.0F, 4.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0033F, 0.1369F, 1.3028F, -0.4363F, 0.0F, 0.0F));
		PartDefinition wings2 = bone.addOrReplaceChild("wings2", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.5033F, -1.0739F, -2.8056F, -0.1745F, 0.0F, 1.5708F));
		PartDefinition cube_r2 = wings2.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 55).addBox(-0.5F, -1.5F, -3.0F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.0F, 2.0F, -0.4363F, 0.0F, 0.0F));
		PartDefinition wings = bone.addOrReplaceChild("wings", CubeListBuilder.create(), PartPose.offsetAndRotation(2.4967F, -1.0739F, -2.8056F, -0.1745F, 0.0F, -1.5708F));
		PartDefinition cube_r3 = wings.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 55).addBox(-0.5F, -1.5F, -3.0F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, 2.0F, -0.4363F, 0.0F, 0.0F));
		PartDefinition right_leg = bone.addOrReplaceChild("right_leg", CubeListBuilder.create().texOffs(60, 60).mirror().addBox(-0.5F, -0.5F, -1.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.3967F, 1.1369F, 0.3028F, 0.6981F, 0.0F, 0.0F));
		PartDefinition left_leg = bone.addOrReplaceChild("left_leg", CubeListBuilder.create().texOffs(60, 60).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.4033F, 1.1369F, 0.3028F, 0.6981F, 0.0F, 0.0F));
		PartDefinition head = bone.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(37, 10).addBox(-1.5F, -3.5F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 29).addBox(-0.5F, -2.0F, -3.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-0.0033F, -2.8631F, -3.8972F));
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

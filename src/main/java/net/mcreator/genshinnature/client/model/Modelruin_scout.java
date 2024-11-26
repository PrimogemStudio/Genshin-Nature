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
public class Modelruin_scout<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("genshin_nature", "modelruin_scout"), "main");
	public final ModelPart bone5;
	public final ModelPart bone4;
	public final ModelPart bone3;
	public final ModelPart bone2;
	public final ModelPart bone;
	public final ModelPart tentacles;
	public final ModelPart tentacles2;
	public final ModelPart tentacles3;
	public final ModelPart tentacles4;

	public Modelruin_scout(ModelPart root) {
		this.bone5 = root.getChild("bone5");
		this.bone4 = this.bone5.getChild("bone4");
		this.bone3 = this.bone5.getChild("bone3");
		this.bone2 = this.bone5.getChild("bone2");
		this.bone = this.bone5.getChild("bone");
		this.tentacles = this.bone5.getChild("tentacles");
		this.tentacles2 = this.bone5.getChild("tentacles2");
		this.tentacles3 = this.bone5.getChild("tentacles3");
		this.tentacles4 = this.bone5.getChild("tentacles4");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition bone5 = partdefinition.addOrReplaceChild("bone5", CubeListBuilder.create().texOffs(56, 0).addBox(-1.0F, -37.5F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 52)
				.addBox(-5.5F, -35.5F, -5.5F, 11.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(0, 34).addBox(-2.5F, -36.5F, -2.5F, 5.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 23.5F, -0.5F));
		PartDefinition bone4 = bone5.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(9.6286F, -34.0939F, 0.005F, 0.0F, 0.0F, 0.3927F));
		PartDefinition cube_r1 = bone4.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-6.0F, -1.0F, -6.0F, 12.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));
		PartDefinition bone3 = bone5.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-9.6185F, -34.0939F, 0.005F, 0.0F, 0.0F, -0.3927F));
		PartDefinition cube_r2 = bone3.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 0).addBox(-6.0F, -1.0F, -6.0F, 12.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -3.1416F, -0.7854F, 3.1416F));
		PartDefinition bone2 = bone5.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -34.0939F, 9.6236F, -0.3927F, 0.0F, 0.0F));
		PartDefinition cube_r3 = bone2.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-6.0F, -1.0F, -6.0F, 12.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));
		PartDefinition bone = bone5.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -34.0939F, -9.6236F, 0.3927F, 0.0F, 0.0F));
		PartDefinition cube_r4 = bone.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 0).addBox(-6.0F, -1.0F, -6.0F, 12.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -3.1416F, 0.7854F, 3.1416F));
		PartDefinition tentacles = bone5.addOrReplaceChild("tentacles", CubeListBuilder.create().texOffs(52, 41).mirror().addBox(-0.6342F, 0.0F, -1.5F, 3.0F, 20.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-4.3658F, -34.5F, 0.0F, 0.0F, 0.0F, 0.1309F));
		PartDefinition cube_r5 = tentacles.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(52, 19).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 16.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.8658F, 19.0F, 0.0F, 0.0F, 0.0F, 0.2182F));
		PartDefinition tentacles2 = bone5.addOrReplaceChild("tentacles2", CubeListBuilder.create().texOffs(52, 41).addBox(-2.3658F, 0.0F, -1.5F, 3.0F, 20.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.3658F, -34.5F, 0.0F, 0.0F, 0.0F, -0.1309F));
		PartDefinition cube_r6 = tentacles2.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(52, 19).mirror().addBox(-1.5F, 0.0F, -1.5F, 3.0F, 16.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.8658F, 19.0F, 0.0F, 0.0F, 0.0F, -0.2182F));
		PartDefinition tentacles3 = bone5.addOrReplaceChild("tentacles3", CubeListBuilder.create().texOffs(52, 41).addBox(-1.5F, 0.0F, -0.6283F, 3.0F, 20.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -34.5F, -4.3717F, -0.1309F, 0.0F, 0.0F));
		PartDefinition cube_r7 = tentacles3.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(52, 19).addBox(-2.0F, 0.0F, -1.0F, 3.0F, 16.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5F, 19.0F, 0.3717F, -0.2182F, 0.0F, 0.0F));
		PartDefinition tentacles4 = bone5.addOrReplaceChild("tentacles4", CubeListBuilder.create().texOffs(52, 41).mirror().addBox(-1.5F, 0.0F, -2.3598F, 3.0F, 20.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -34.5F, 4.3598F, 0.1309F, 0.0F, 0.0F));
		PartDefinition cube_r8 = tentacles4.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(52, 19).mirror().addBox(-2.0F, 0.0F, -1.0F, 3.0F, 16.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.5F, 19.0F, -1.3598F, 0.2182F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int rgb) {
		bone5.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
	}
}

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
public class Modelwhirling_pyro_fungus_fixed<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("genshin_nature", "modelwhirling_pyro_fungus_fixed"), "main");
	public final ModelPart bone;
	public final ModelPart hat;
	public final ModelPart bone2;
	public final ModelPart tentacles3;
	public final ModelPart tentacles2;
	public final ModelPart tentacles;
	public final ModelPart bone3;
	public final ModelPart tentacles4;
	public final ModelPart tentacles5;
	public final ModelPart tentacles6;

	public Modelwhirling_pyro_fungus_fixed(ModelPart root) {
		this.bone = root.getChild("bone");
		this.hat = this.bone.getChild("hat");
		this.bone2 = this.bone.getChild("bone2");
		this.tentacles3 = this.bone2.getChild("tentacles3");
		this.tentacles2 = this.bone2.getChild("tentacles2");
		this.tentacles = this.bone2.getChild("tentacles");
		this.bone3 = this.bone.getChild("bone3");
		this.tentacles4 = this.bone3.getChild("tentacles4");
		this.tentacles5 = this.bone3.getChild("tentacles5");
		this.tentacles6 = this.bone3.getChild("tentacles6");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition bone = partdefinition.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(29, 28).addBox(-1.0F, -4.0F, -3.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(77, 33)
				.addBox(0.0F, -1.0F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(3, 68).addBox(-2.0F, -15.0F, -4.0F, 6.0F, 11.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.0F, 24.0F, 1.0F));
		PartDefinition hat = bone
				.addOrReplaceChild(
						"hat", CubeListBuilder.create().texOffs(48, 82).addBox(-9.0F, -18.0F, -11.0F, 20.0F, 3.0F, 20.0F, new CubeDeformation(0.0F)).texOffs(56, 40).addBox(-8.0F, -22.0F, -10.0F, 18.0F, 4.0F, 18.0F, new CubeDeformation(0.0F))
								.texOffs(0, 111).addBox(-6.0F, -25.0F, -8.0F, 14.0F, 3.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(4, 97).addBox(-4.0F, -26.0F, -6.0F, 10.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)),
						PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition bone2 = bone.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(1.0F, -14.0F, -2.0F));
		PartDefinition tentacles3 = bone2.addOrReplaceChild("tentacles3", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.0F, -0.5F, 2.0F, 0.0436F, -0.8727F, 0.0F));
		PartDefinition cube_r1 = tentacles3.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-1.99F, -0.25F, -5.2F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.0F, -7.0F, -0.1309F, 0.0F, 0.0F));
		PartDefinition cube_r2 = tentacles3.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(33, 8).addBox(-2.0F, -0.5F, -3.0F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -5.0F, 0.4363F, 0.0F, 0.0F));
		PartDefinition tentacles2 = bone2.addOrReplaceChild("tentacles2", CubeListBuilder.create(), PartPose.offsetAndRotation(2.0F, -0.5F, 2.0F, 0.0436F, 0.8727F, 0.0F));
		PartDefinition cube_r3 = tentacles2.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 0).addBox(-1.99F, -0.25F, -5.2F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.0F, -7.0F, -0.1309F, 0.0F, 0.0F));
		PartDefinition cube_r4 = tentacles2.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(33, 8).addBox(-2.0F, -0.5F, -3.0F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -5.0F, 0.4363F, 0.0F, 0.0F));
		PartDefinition tentacles = bone2.addOrReplaceChild("tentacles", CubeListBuilder.create(), PartPose.offset(0.0F, -0.5F, -2.0F));
		PartDefinition cube_r5 = tentacles.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 0).addBox(-1.99F, -0.25F, -5.2F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.0F, -2.0F, -0.1309F, 0.0F, 0.0F));
		PartDefinition cube_r6 = tentacles.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(33, 8).addBox(-2.0F, -0.5F, -3.0F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.4363F, 0.0F, 0.0F));
		PartDefinition bone3 = bone.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, -14.0F, 0.0F, -3.1416F, 0.0F, 3.1416F));
		PartDefinition tentacles4 = bone3.addOrReplaceChild("tentacles4", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.0F, -0.5F, 2.0F, 0.0436F, -0.8727F, 0.0F));
		PartDefinition cube_r7 = tentacles4.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 0).addBox(-1.99F, -0.25F, -5.2F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.0F, -7.0F, -0.1309F, 0.0F, 0.0F));
		PartDefinition cube_r8 = tentacles4.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(33, 8).addBox(-2.0F, -0.5F, -3.0F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -5.0F, 0.4363F, 0.0F, 0.0F));
		PartDefinition tentacles5 = bone3.addOrReplaceChild("tentacles5", CubeListBuilder.create(), PartPose.offsetAndRotation(2.0F, -0.5F, 2.0F, 0.0436F, 0.8727F, 0.0F));
		PartDefinition cube_r9 = tentacles5.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(0, 0).addBox(-1.99F, -0.25F, -5.2F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.0F, -7.0F, -0.1309F, 0.0F, 0.0F));
		PartDefinition cube_r10 = tentacles5.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(33, 8).addBox(-2.0F, -0.5F, -3.0F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -5.0F, 0.4363F, 0.0F, 0.0F));
		PartDefinition tentacles6 = bone3.addOrReplaceChild("tentacles6", CubeListBuilder.create(), PartPose.offset(0.0F, -0.5F, -2.0F));
		PartDefinition cube_r11 = tentacles6.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(0, 0).addBox(-1.99F, -0.25F, -5.2F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.0F, -2.0F, -0.1309F, 0.0F, 0.0F));
		PartDefinition cube_r12 = tentacles6.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(33, 8).addBox(-2.0F, -0.5F, -3.0F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.4363F, 0.0F, 0.0F));
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

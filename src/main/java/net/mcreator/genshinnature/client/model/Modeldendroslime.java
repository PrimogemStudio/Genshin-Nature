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
public class Modeldendroslime<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("genshin_nature", "modeldendroslime"), "main");
	public final ModelPart leaves;
	public final ModelPart leaves2;
	public final ModelPart leaves3;
	public final ModelPart bb_main;

	public Modeldendroslime(ModelPart root) {
		this.leaves = root.getChild("leaves");
		this.leaves2 = root.getChild("leaves2");
		this.leaves3 = root.getChild("leaves3");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition leaves = partdefinition.addOrReplaceChild("leaves", CubeListBuilder.create().texOffs(15, 27).addBox(-0.5F, -2.0937F, -0.0774F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5F, 13.0937F, -2.9226F, 0.3771F, 0.5603F, 0.0662F));
		PartDefinition cube_r1 = leaves.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(26, 34).addBox(-1.5F, -3.2352F, -2.9643F, 3.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -7.5315F, -1.1131F, 1.1781F, 0.0F, 0.0F));
		PartDefinition cube_r2 = leaves.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(19, 29).addBox(-0.5F, -1.0F, -1.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.0937F, 0.4226F, 0.4363F, 0.0F, 0.0F));
		PartDefinition leaves2 = partdefinition.addOrReplaceChild("leaves2", CubeListBuilder.create().texOffs(15, 27).addBox(-0.5F, -2.0937F, -0.0774F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5F, 13.0937F, -2.9226F, 0.3064F, -0.6225F, 0.0005F));
		PartDefinition cube_r3 = leaves2.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(26, 34).addBox(-1.5F, -3.2352F, -2.9643F, 3.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -7.5315F, -1.1131F, 1.1781F, 0.0F, 0.0F));
		PartDefinition cube_r4 = leaves2.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(19, 29).addBox(-0.5F, -1.0F, -1.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.0937F, 0.4226F, 0.4363F, 0.0F, 0.0F));
		PartDefinition leaves3 = partdefinition.addOrReplaceChild("leaves3", CubeListBuilder.create().texOffs(15, 27).addBox(-0.5F, -2.0937F, -0.0774F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5F, 13.0937F, 2.0774F, -2.9273F, 0.1281F, 3.128F));
		PartDefinition cube_r5 = leaves3.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(26, 34).addBox(-1.5F, -3.2352F, -2.9643F, 3.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -7.5315F, -1.1131F, 1.1781F, 0.0F, 0.0F));
		PartDefinition cube_r6 = leaves3.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(19, 29).addBox(-0.5F, -1.0F, -1.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.0937F, 0.4226F, 0.4363F, 0.0F, 0.0F));
		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(0, 55).addBox(-4.0F, -1.0F, -4.0F, 8.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 55).addBox(4.0F, -2.0F, -4.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 55)
						.addBox(5.0F, -3.0F, -4.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 55).addBox(-5.0F, -2.0F, -4.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 55)
						.addBox(-6.0F, -3.0F, -4.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(46, 0).addBox(-7.0F, -7.0F, -4.0F, 1.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(46, 0).mirror()
						.addBox(6.0F, -7.0F, -4.0F, 1.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(46, 0).mirror().addBox(-6.0F, -8.0F, -4.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(46, 0).mirror()
						.addBox(-5.0F, -9.0F, -4.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(46, 0).mirror().addBox(-4.0F, -10.0F, -4.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(46, 0)
						.addBox(5.0F, -8.0F, -4.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(46, 0).addBox(4.0F, -9.0F, -4.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(46, 0)
						.addBox(3.0F, -10.0F, -4.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(36, 0).addBox(-3.0F, -11.0F, -4.0F, 6.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-4.0F, -9.0F, -5.0F, 8.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 57).addBox(-5.0F, -8.0F, -5.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 57)
						.addBox(-6.0F, -7.0F, -5.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 57).addBox(4.0F, -8.0F, -5.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 57)
						.addBox(5.0F, -7.0F, -5.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 55).addBox(-3.0F, -10.0F, -5.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 56)
						.addBox(5.0F, -7.0F, 4.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(1, 55).addBox(4.0F, -8.0F, 4.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(9, 56)
						.addBox(-3.0F, -10.0F, 4.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 55).addBox(-4.0F, -9.0F, 4.0F, 8.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(1, 55)
						.addBox(-5.0F, -8.0F, 4.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 56).addBox(-6.0F, -7.0F, 4.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int rgb) {
		leaves.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		leaves2.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		leaves3.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
	}
}

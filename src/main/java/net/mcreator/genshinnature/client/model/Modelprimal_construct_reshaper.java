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
public class Modelprimal_construct_reshaper<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("genshin_nature", "modelprimal_construct_reshaper"), "main");
	public final ModelPart bone;
	public final ModelPart bone2;
	public final ModelPart bone3;
	public final ModelPart bone4;
	public final ModelPart weapon;
	public final ModelPart weapon2;

	public Modelprimal_construct_reshaper(ModelPart root) {
		this.bone = root.getChild("bone");
		this.bone2 = this.bone.getChild("bone2");
		this.bone3 = this.bone2.getChild("bone3");
		this.bone4 = this.bone2.getChild("bone4");
		this.weapon = root.getChild("weapon");
		this.weapon2 = root.getChild("weapon2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition bone = partdefinition.addOrReplaceChild("bone",
				CubeListBuilder.create().texOffs(50, 62).addBox(-9.0F, -1.0F, 1.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 13).addBox(-7.0F, 0.0F, 0.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(56, 13).mirror()
						.addBox(5.0F, 0.0F, 0.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(50, 62).mirror().addBox(3.0F, -1.0F, 1.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(58, 8)
						.addBox(-1.0F, -13.0F, 1.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 18.0F, 0.0F));
		PartDefinition cube_r1 = bone.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 62).mirror().addBox(-9.5F, -0.5F, -0.5F, 19.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(4.683F, -8.4772F, 1.51F, 0.0F, 0.0F, 1.0472F));
		PartDefinition cube_r2 = bone.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 23).addBox(-0.8F, -1.0F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.5F, 2.0F, 1.5F, 0.0F, 0.0F, 0.6109F));
		PartDefinition cube_r3 = bone.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 23).addBox(-0.2F, -1.0F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.5F, 2.0F, 1.5F, 0.0F, 0.0F, -0.6109F));
		PartDefinition cube_r4 = bone.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 62).addBox(0.0F, -1.0F, -0.01F, 19.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-9.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0472F));
		PartDefinition bone2 = bone.addOrReplaceChild("bone2",
				CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -8.0F, 0.0F, 6.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 9).addBox(-2.0F, -7.0F, -1.0F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 1.0F, 0.0F));
		PartDefinition cube_r5 = bone2.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(27, 0).addBox(4.0F, -1.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(47, 0).addBox(7.5F, -4.0F, 1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 16).mirror()
						.addBox(3.5F, -4.5F, 1.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(54, 0).addBox(0.0F, -2.0F, 0.0F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, -7.0F, -0.5F, 0.0F, 0.0436F, -0.7854F));
		PartDefinition cube_r6 = bone2.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(27, 0).addBox(-5.0F, -1.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(47, 0).addBox(-8.5F, -4.0F, 1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 16)
						.addBox(-7.5F, -4.5F, 1.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(54, 0).mirror().addBox(-4.0F, -2.0F, 0.0F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.0F, -7.0F, -0.5F, 0.0F, -0.0436F, 0.7854F));
		PartDefinition bone3 = bone2.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -6.0F, 1.5F, 0.0F, 0.0F, 2.3562F));
		PartDefinition cube_r7 = bone3.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(27, 0).addBox(4.2F, -1.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(54, 0).addBox(0.2F, -2.0F, -1.0F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, -2.0F, -1.0F, 0.0F, 0.0436F, -0.7854F));
		PartDefinition bone4 = bone2.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.2784F, 0.5F, 0.0F, 0.0F, 2.3562F));
		PartDefinition cube_r8 = bone4.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(20, 0).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.8839F, -0.8839F, 0.0F, 0.0F, 0.0F, -0.7854F));
		PartDefinition cube_r9 = bone4.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(36, 0).addBox(-2.0F, -2.0F, -0.5F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.8839F, 0.8839F, 0.0F, 0.0F, 0.0F, -0.7854F));
		PartDefinition weapon = partdefinition.addOrReplaceChild("weapon",
				CubeListBuilder.create().texOffs(3, 32).addBox(-1.5F, -1.5F, -3.5F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(29, 15).addBox(-1.0F, -1.0F, -9.5F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(10.5F, 8.5F, 3.5F, -0.2233F, -0.3033F, 0.0198F));
		PartDefinition weapon2 = partdefinition.addOrReplaceChild("weapon2",
				CubeListBuilder.create().texOffs(3, 32).addBox(-1.5F, -1.5F, -3.5F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(29, 15).addBox(-1.0F, -1.0F, -9.5F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-10.5F, 8.5F, 3.5F, -0.2233F, 0.3033F, -0.0198F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int rgb) {
		bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		weapon.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		weapon2.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
	}
}

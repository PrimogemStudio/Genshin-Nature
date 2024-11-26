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
public class Modelcrab<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("genshin_nature", "modelcrab"), "main");
	public final ModelPart leftleg1;
	public final ModelPart leftleg2;
	public final ModelPart leftarm;
	public final ModelPart rightarm;
	public final ModelPart bb_main;

	public Modelcrab(ModelPart root) {
		this.leftleg1 = root.getChild("leftleg1");
		this.leftleg2 = root.getChild("leftleg2");
		this.leftarm = root.getChild("leftarm");
		this.rightarm = root.getChild("rightarm");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition leftleg1 = partdefinition.addOrReplaceChild("leftleg1", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition cube_r1 = leftleg1.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(0, 61).addBox(-0.5F, -2.0F, 3.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 61).addBox(-0.5F, -2.0F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.5F, 0.0F, -1.5F, 0.0F, 0.0F, -0.3927F));
		PartDefinition cube_r2 = leftleg1.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 61).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.3927F));
		PartDefinition leftleg2 = partdefinition.addOrReplaceChild("leftleg2", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition cube_r3 = leftleg2.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 61).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.5F, 0.0F, 2.4F, 0.0F, 0.0F, 0.3927F));
		PartDefinition cube_r4 = leftleg2.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 61).addBox(-0.5F, -2.0F, 1.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.5F, 0.0F, -1.5F, 0.0F, 0.0F, -0.3927F));
		PartDefinition cube_r5 = leftleg2.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 61).addBox(-0.1173F, -0.0761F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.1173F, -1.9239F, -1.4F, 0.0F, 0.0F, 0.3927F));
		PartDefinition leftarm = partdefinition.addOrReplaceChild("leftarm",
				CubeListBuilder.create().texOffs(50, 0).addBox(-4.0154F, 0.6002F, -1.5F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(60, 8).addBox(-4.0154F, -0.3998F, 0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 8)
						.addBox(-4.0154F, -0.3998F, -1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 8).addBox(-2.0154F, -0.3998F, -1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 8)
						.addBox(-2.0154F, -0.3998F, 0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.9846F, 20.3998F, 0.5F, 0.0F, 0.0F, -0.1309F));
		PartDefinition cube_r6 = leftarm.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(60, 8).addBox(-3.4F, -0.3F, -1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 8).addBox(-3.4F, -0.3F, 0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 8)
						.addBox(-1.4F, -0.3F, -1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 8).addBox(-1.4F, -0.3F, 0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(50, 0)
						.addBox(-4.4F, -1.3F, -1.5F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.3846F, -0.0998F, 0.0F, 0.0F, 0.0F, 0.3054F));
		PartDefinition rightarm = partdefinition.addOrReplaceChild("rightarm",
				CubeListBuilder.create().texOffs(50, 0).addBox(-4.0463F, 0.8007F, -1.5F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(60, 7).addBox(-4.0463F, -0.1993F, 0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 8)
						.addBox(-4.0463F, -0.1993F, -1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 8).addBox(-2.0463F, -0.1993F, -1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 7)
						.addBox(-2.0463F, -0.1993F, 0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.9281F, 19.8077F, 0.5F, 3.1416F, 0.0F, -3.0107F));
		PartDefinition cube_r7 = rightarm.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(60, 8).addBox(-3.4F, -0.3F, -1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 7).addBox(-3.4F, -0.3F, 0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 8)
						.addBox(-1.4F, -0.3F, -1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 7).addBox(-1.4F, -0.3F, 0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(50, 0)
						.addBox(-4.4F, -1.3F, -1.5F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.3537F, 0.1007F, 0.0F, 0.0F, 0.0F, 0.3054F));
		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main", CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -4.0F, -2.0F, 6.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(60, 61)
				.addBox(-2.0F, -6.0F, -2.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 61).addBox(1.0F, -6.0F, -2.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int rgb) {
		leftleg1.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		leftleg2.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		leftarm.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		rightarm.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
	}
}
